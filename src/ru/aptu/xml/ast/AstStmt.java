package ru.aptu.xml.ast;

import ru.aptu.xml.ASTTree.TextSource;

public class AstStmt extends AstNode {

	private String identifier;
	private Integer val;

	public AstStmt(String identifier, Integer val, TextSource input, int start, int end) {
		super(input, start, end);
		this.identifier = identifier;
		this.val = val;
	}

	public String getIdentifier() {
		return identifier;
	}
	public Integer getVal() {
		return val;
	}
	public void accept(AstVisitor v) {
		v.visit(this);
	}
}
