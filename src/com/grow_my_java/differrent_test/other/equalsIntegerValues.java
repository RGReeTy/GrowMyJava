package com.grow_my_java.differrent_test.other;

public class equalsIntegerValues {
    public static void main(String[] args) {
        Integer int1 = new Integer(145);
        Integer int2 = new Integer(45);
        Number int3 = new Integer(145);
        Integer int4 = 145;
        Integer int5 = 145;
        Integer int6 = 45;
        Integer int7 = 45;
        int x = 45;
        System.out.println(int1 > int2);
        System.out.println(x < int1);
        //System.out.println(x < int3);
        System.out.println(int1 == int4);
        System.out.println(int4 == int5);
        System.out.println(int6 == int7);
        System.out.println(int2 == x);
    }
}
