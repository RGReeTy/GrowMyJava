package com.grow_my_java.differrent_test.other;

public class StaticField {
    public static int x = 777;
    public static StaticField fff = new StaticField();

    private StaticField() {
        System.out.println("x= " + x);
    }

    public static void main(String[] args) {
        System.out.println(StaticField.x);
    }

    //x= 777
    //777
}
