package ru.aptu.xml;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import ru.aptu.xml.ASTLexer.ErrorReporter;
import ru.aptu.xml.ASTLexer.LapgSymbol;
import ru.aptu.xml.ASTLexer.Lexems;
import ru.aptu.xml.ast.AstInput;
import ru.aptu.xml.ast.AstStmt;

public class ASTParser {

	public static class ParseException extends Exception {
		private static final long serialVersionUID = 1L;

		public ParseException() {
		}
	}

	private final ErrorReporter reporter;

	public ASTParser(ErrorReporter reporter) {
		this.reporter = reporter;
	}

	private static final boolean DEBUG_SYNTAX = false;
	private static final int[] tmAction = ASTLexer.unpack_int(9,
		"\ufffd\uffff\ufff7\uffff\uffff\uffff\0\0\uffff\uffff\uffff\uffff\3\0\uffff\uffff" +
		"\ufffe\uffff");

	private static final short[] tmLalr = ASTLexer.unpack_short(12,
		"\0\1\1\1\uffff\ufffe\1\uffff\0\2\uffff\ufffe");

	private static final short[] lapg_sym_goto = ASTLexer.unpack_short(10,
		"\0\1\2\3\4\5\5\6\7\10");

	private static final short[] lapg_sym_from = ASTLexer.unpack_short(8,
		"\7\1\4\2\5\0\1\0");

	private static final short[] lapg_sym_to = ASTLexer.unpack_short(8,
		"\10\2\5\4\6\7\3\1");

	private static final short[] lapg_rlen = ASTLexer.unpack_short(4,
		"\2\0\1\4");

	private static final short[] lapg_rlex = ASTLexer.unpack_short(4,
		"\10\10\6\7");

	protected static final String[] lapg_syms = new String[] {
		"eoi",
		"identifier",
		"val",
		"eq",
		"semicol",
		"_skip",
		"input",
		"stmt",
		"stmt_optlist",
	};

	public interface Tokens extends Lexems {
		// non-terminals
		public static final int input = 6;
		public static final int stmt = 7;
		public static final int stmt_optlist = 8;
	}

	/**
	 * -3-n   Lookahead (state id)
	 * -2     Error
	 * -1     Shift
	 * 0..n   Reduce (rule index)
	 */
	protected static int tmAction(int state, int symbol) {
		int p;
		if (tmAction[state] < -2) {
			for (p = -tmAction[state] - 3; tmLalr[p] >= 0; p += 2) {
				if (tmLalr[p] == symbol) {
					break;
				}
			}
			return tmLalr[p + 1];
		}
		return tmAction[state];
	}

	protected static int tmGoto(int state, int symbol) {
		int min = lapg_sym_goto[symbol], max = lapg_sym_goto[symbol + 1] - 1;
		int i, e;

		while (min <= max) {
			e = (min + max) >> 1;
			i = lapg_sym_from[e];
			if (i == state) {
				return lapg_sym_to[e];
			} else if (i < state) {
				min = e + 1;
			} else {
				max = e - 1;
			}
		}
		return -1;
	}

	protected int tmHead;
	protected LapgSymbol[] tmStack;
	protected LapgSymbol tmNext;
	protected ASTLexer tmLexer;

	public AstInput parse(ASTLexer lexer) throws IOException, ParseException {

		tmLexer = lexer;
		tmStack = new LapgSymbol[1024];
		tmHead = 0;

		tmStack[0] = new LapgSymbol();
		tmStack[0].state = 0;
		tmNext = tmLexer.next();

		while (tmStack[tmHead].state != 8) {
			int action = tmAction(tmStack[tmHead].state, tmNext.symbol);

			if (action >= 0) {
				reduce(action);
			} else if (action == -1) {
				shift();
			}

			if (action == -2 || tmStack[tmHead].state == -1) {
				break;
			}
		}

		if (tmStack[tmHead].state != 8) {
			reporter.error(tmNext.offset, tmNext.endoffset, tmNext.line,
						MessageFormat.format("syntax error before line {0}",
								tmLexer.getTokenLine()));
			throw new ParseException();
		}
		return (AstInput)tmStack[tmHead - 1].value;
	}

	protected void shift() throws IOException {
		tmStack[++tmHead] = tmNext;
		tmStack[tmHead].state = tmGoto(tmStack[tmHead - 1].state, tmNext.symbol);
		if (DEBUG_SYNTAX) {
			System.out.println(MessageFormat.format("shift: {0} ({1})", lapg_syms[tmNext.symbol], tmLexer.current()));
		}
		if (tmStack[tmHead].state != -1 && tmNext.symbol != 0) {
			tmNext = tmLexer.next();
		}
	}

	protected void reduce(int rule) {
		LapgSymbol lapg_gg = new LapgSymbol();
		lapg_gg.value = (lapg_rlen[rule] != 0) ? tmStack[tmHead + 1 - lapg_rlen[rule]].value : null;
		lapg_gg.symbol = lapg_rlex[rule];
		lapg_gg.state = 0;
		if (DEBUG_SYNTAX) {
			System.out.println("reduce to " + lapg_syms[lapg_rlex[rule]]);
		}
		LapgSymbol startsym = (lapg_rlen[rule] != 0) ? tmStack[tmHead + 1 - lapg_rlen[rule]] : tmNext;
		lapg_gg.line = startsym.line;
		lapg_gg.offset = startsym.offset;
		lapg_gg.endoffset = (lapg_rlen[rule] != 0) ? tmStack[tmHead].endoffset : tmNext.offset;
		applyRule(lapg_gg, rule, lapg_rlen[rule]);
		for (int e = lapg_rlen[rule]; e > 0; e--) {
			tmStack[tmHead--] = null;
		}
		tmStack[++tmHead] = lapg_gg;
		tmStack[tmHead].state = tmGoto(tmStack[tmHead - 1].state, lapg_gg.symbol);
	}

	@SuppressWarnings("unchecked")
	protected void applyRule(LapgSymbol lapg_gg, int rule, int ruleLength) {
		switch (rule) {
			case 0:  // stmt_optlist ::= stmt_optlist stmt
				((List<AstStmt>)lapg_gg.value).add(((AstStmt)tmStack[tmHead].value));
				break;
			case 1:  // stmt_optlist ::=
				lapg_gg.value = new ArrayList();
				break;
			case 2:  // input ::= stmt_optlist
				lapg_gg.value = new AstInput(
						((List<AstStmt>)tmStack[tmHead].value) /* s */,
						null /* input */, tmStack[tmHead].offset, tmStack[tmHead].endoffset);
				break;
			case 3:  // stmt ::= identifier eq val semicol
				lapg_gg.value = new AstStmt(
						((String)tmStack[tmHead - 3].value) /* identifier */,
						((Integer)tmStack[tmHead - 1].value) /* val */,
						null /* input */, tmStack[tmHead - 3].offset, tmStack[tmHead].endoffset);
				break;
		}
	}
}
