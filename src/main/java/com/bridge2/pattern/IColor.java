package com.bridge2.pattern;


public interface IColor {
    public void bePrain(String shape);

    default public void ss(){
        System.out.println("ZXX");
    }
}
