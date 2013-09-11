package ru.aptu.xml.ast;

import ru.aptu.xml.ASTTree.TextSource;

public interface IAstNode {
	int getOffset();
	int getEndOffset();
	TextSource getInput();
	void accept(AstVisitor v);
}
