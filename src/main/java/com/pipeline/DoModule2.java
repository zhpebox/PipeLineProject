package com.pipeline;

public class DoModule2<T> extends AbsModule<T>{

    @Override
    public void processItem(T item){
        System.out.println("module1 开始处理 "+item.toString());

    }

}
