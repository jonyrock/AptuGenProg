package ru.aptu.xml.ast;

import ru.aptu.xml.ASTTree.TextSource;

public class AstInput extends AstNode {

	private AstTag rts;

	public AstInput(AstTag rts, TextSource input, int start, int end) {
		super(input, start, end);
		this.rts = rts;
	}

	public AstTag getRts() {
		return rts;
	}
	public void accept(AstVisitor v) {
		if (!v.visit(this)) {
			return;
		}

		if (rts != null) {
			rts.accept(v);
		}
	}
}
