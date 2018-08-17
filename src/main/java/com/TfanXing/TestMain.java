package com.TfanXing;

import java.util.Arrays;
import java.util.List;

public class TestMain {
//    public static void main(String[] args) {
//        Generator<String,String> r1 = new Generator<String,String>();
//        r1.setT("HHAH");
//        r1.getToClass();
//        Generator<Integer,String> r2 = new Generator<Integer,String>();
//        r2.setT(123);
//        r2.getToClass();
//        r2.sayWhat("<<JJ");
//    }
    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruit = Arrays.asList(new Fruit());

    static void f2() {
        CovariantReader<Fruit> fruitReader = new CovariantReader<Fruit>();
        Fruit f = fruitReader.readCovariant(fruit);
        Fruit a = fruitReader.readCovariant(apples);
        apples.stream().forEach(e ->{
            System.out.println(e);
        });
    }
    public static void main(String[] args) {
        f2();
    }


}

class CovariantReader<T> {
    T readCovariant(List<? extends T> list) {
        return list.get(0);
    }
    void readCovariant1(List<? super T> list) {
        list.add(null);
    }

}

class Fruit {}
class Apple extends Fruit {}
class Orange extends Fruit {}

