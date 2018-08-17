package com.bridge2.pattern;

import lombok.Setter;

public abstract class Shape {

    @Setter
    IColor color ;

    public abstract void draw();
}
