package com.flyweight.pattern;

/**
 * 创建有key的子类
 */
public class SubFlyWeight extends FlyWeight {

    private String key;

    public SubFlyWeight(String key) {
        this.key = key;
    }

    @Override
    public void method() {
        System.out.println("this is the sub method, and the key is " + this.key);
    }
}
