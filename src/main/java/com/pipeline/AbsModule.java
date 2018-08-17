package com.pipeline;

public abstract class AbsModule<T> {

    AbsModule<T> nextModule;
    T item;

    public void putq(T item){
        this.item = item;
    }

    public void start(){
        this.processItem(item);
        nextModule.putq(item);
        nextModule.start();
    }

    public void processItem(T item){}
}
