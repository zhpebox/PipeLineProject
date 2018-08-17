package com.TfanXing;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        TMiger t = new TMiger(new Apple(),new String("123"));
        List m = t.getList();
        m.forEach(ms-> System.out.println(ms));
    }
}
