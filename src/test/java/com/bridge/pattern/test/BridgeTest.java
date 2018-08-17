package com.bridge.pattern.test;

import com.bridge.pattern.Abstraction;
import com.bridge.pattern.ConCreateImplementorB;
import com.bridge.pattern.ConcreateImplementorA;
import com.bridge.pattern.RefineAbstraction;

public class BridgeTest {

    public static void main(String[] args) {
        Abstraction abstraction = new RefineAbstraction();

        //调用第一个实现类
        abstraction.setImplementor(()->{
            System.out.println("this is Lamble's operation……!");
        });
        abstraction.operation();

        //调用第二个实现类
        abstraction.setImplementor(new ConCreateImplementorB());
        abstraction.operation();
    }
}
