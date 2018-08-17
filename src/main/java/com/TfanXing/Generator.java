package com.TfanXing;

import com.bridge2.pattern.Color_grey;
import com.bridge2.pattern.IColor;
import com.bridge2.pattern.Line;
import com.bridge2.pattern.Shape;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Generator<T, K> {

    @Setter @Getter
    private T t;

    public void getToClass(){
        System.out.println(t+" -> "+t.getClass());
    }

    public void sayWhat(K k){
        System.out.println(k.getClass());
        if(k.getClass().toString().equals("class java.lang.String")){
            System.out.println("HHMM"+(String)k);
        }
        System.out.println(k);
    }

}
