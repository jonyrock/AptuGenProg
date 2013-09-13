package ru.aptu.xml.ast;

public abstract class AstVisitor {

	protected boolean visit(AstInput n) {
		return true;
	}

	protected boolean visit(AstTag n) {
		return true;
	}

	protected boolean visit(AstTagText n) {
		return true;
	}

    protected boolean visit(AstInner n) {
        return true;
    }
}
