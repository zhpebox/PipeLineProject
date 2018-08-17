package com.flyweight2.pattern;

public class TestWork {

    public static void main(String[] args) {

        WorkFactory workFactory = new WorkFactory();
        IWork work1 = workFactory.getIWorkOne("s1");
        IWork work2 = workFactory.getIWorkOne("s1");

        System.out.println(work1==work2);
        work1.goWhat();
        work2.goWhat();

        IWork work3 = workFactory.getIWorkOne("s3");
        System.out.println(work1==work3);
        work3.goWhat();

    }

}
