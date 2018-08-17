package com.bridge2.pattern;

public class Color_red implements IColor {
    @Override
    public void bePrain(String shape) {
        System.out.println("红色的"+shape);
    }
}
