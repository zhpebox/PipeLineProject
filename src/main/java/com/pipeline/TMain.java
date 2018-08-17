package com.pipeline;

public class TMain {

    public static void main(String[] args) {
        TPipeLine pipeLine = new TPipeLine();
        TContent task = new TContent();

        DoModule1 module1 = new DoModule1();
        DoModule2 module2 = new DoModule2();

        pipeLine.addModule(module2);
        pipeLine.addModule(module1);

        pipeLine.startPipeline(task);

    }

}
