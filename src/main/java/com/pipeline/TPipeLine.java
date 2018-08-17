package com.pipeline;

public class TPipeLine<T> {

    AbsModule<T> head = null;

    public void addModule(AbsModule module){
        if(head == null ){
            head = module;
        }else{
            module.nextModule = head.nextModule;
            head.nextModule = module;
        }
    }

    public void startPipeline(T startItem){
        this.head.putq(startItem);
        this.head.start();

    }

}
