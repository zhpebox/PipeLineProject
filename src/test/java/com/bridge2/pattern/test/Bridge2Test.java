package com.bridge2.pattern.test;

import com.bridge2.pattern.*;

public class Bridge2Test {
    public static void main(String[] args) {
        IColor color1 = new Color_red();

        Shape shape1 = new Square();
        shape1.setColor((s)->{
            System.out.println(s);
        });
        shape1.draw();


        IColor color3 = new Color_grey();
        Shape shape3 = new Line();
        shape3.setColor(color3);
        shape3.draw();
    }
}
