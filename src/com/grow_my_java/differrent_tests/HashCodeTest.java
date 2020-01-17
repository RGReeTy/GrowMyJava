package com.grow_my_java.differrent_tests;

import java.util.HashMap;
import java.util.Map;

public class HashCodeTest {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(3, "C");
        map.put(2, "B");
        map.put(1, "A");


        System.out.println(map);
    }
}
