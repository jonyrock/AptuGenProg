package ru.aptu.xml.ast;

import java.util.List;
import ru.aptu.xml.ASTTree.TextSource;

public class AstInput extends AstNode {

	private List<AstStmt> s;

	public AstInput(List<AstStmt> s, TextSource input, int start, int end) {
		super(input, start, end);
		this.s = s;
	}

	public List<AstStmt> getS() {
		return s;
	}
	public void accept(AstVisitor v) {
		if (!v.visit(this)) {
			return;
		}

		if (s != null) {
			for (AstStmt it : s) {
				it.accept(v);
			}
		}
	}
}
