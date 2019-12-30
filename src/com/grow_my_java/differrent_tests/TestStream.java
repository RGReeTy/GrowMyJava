package com.grow_my_java.differrent_tests;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        Stream stream = list.stream();

        System.out.println(stream.count());
        System.out.println(stream.filter(x -> x.equals("Six")));
        System.out.println(stream.count());
        stream.filter(x -> x.toString().length() == 3).forEach(System.out::println);
        System.out.println("OK");


    }
}
