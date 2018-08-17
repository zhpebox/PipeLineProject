package com.bridge.pattern;

import lombok.Data;

@Data
public abstract class Abstraction {

    public Implementor implementor;

    public abstract void operation();

}
