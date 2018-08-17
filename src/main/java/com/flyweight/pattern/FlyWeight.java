package com.flyweight.pattern;

/**
 * 享元模式（FlyWeight）： 运用共享技术有效地支持大量细粒度的对象
 *
 * 主要目的是事实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销
 */
public abstract class FlyWeight {

    public abstract void method();

}
