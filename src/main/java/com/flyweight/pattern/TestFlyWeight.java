package com.flyweight.pattern;

public class TestFlyWeight {

    public static void main(String[] args) {

        /**
         * 创建享元工厂
         */
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();

        /**
         * key相同的情况，通过比较可以知道，两个对象指向同一块内存
         */
        FlyWeight flyWeightA = flyWeightFactory.getFlyWeight("keya");
        FlyWeight flyWeightB = flyWeightFactory.getFlyWeight("keya");

        System.out.println(flyWeightA==flyWeightB);
        flyWeightA.method();
        flyWeightB.method();

        System.out.println("*****************");

        /**
         * key不相同的时候，指向不同的内存位置
         */
        FlyWeight flyWeightC = flyWeightFactory.getFlyWeight("keyc");
        System.out.println(flyWeightA==flyWeightC);
        flyWeightC.method();

    }
}
