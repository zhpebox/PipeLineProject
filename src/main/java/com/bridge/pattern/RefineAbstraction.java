package com.bridge.pattern;

public class RefineAbstraction extends Abstraction {
    @Override
    public void operation() {
        super.getImplementor().operation();
    }
}
