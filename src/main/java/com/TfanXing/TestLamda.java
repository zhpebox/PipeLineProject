package com.TfanXing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TestLamda {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("123");
        list.add("abc");
        list.add("XYZ");

        Arrays.asList();

        list.forEach(t -> {
            System.out.println(t);
        });

        list.stream().forEach( m -> System.out.println(m));


        List<String> list2 = null;
        list2 = list.stream().map(s -> {
            return "DO_"+s;
        }).collect(Collectors.toList());

        list2.stream().forEach(m -> System.out.println(m));

        list2 = list.stream().filter(t -> !t.equals("123")).collect(Collectors.toList());
        list2.forEach(m -> System.out.println(m));

    }


}
