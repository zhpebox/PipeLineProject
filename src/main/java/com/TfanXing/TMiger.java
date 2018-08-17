package com.TfanXing;

import java.util.List;

public class TMiger extends AbsFruit<Apple,String> {

    public TMiger(Apple apple, String orange) {
        super(apple, orange);
    }

    public void getAll(){
        List s = super.getList();
        s.forEach(t -> System.out.println(t));
    }

}
