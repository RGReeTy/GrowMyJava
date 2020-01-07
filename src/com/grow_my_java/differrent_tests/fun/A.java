package com.grow_my_java.differrent_tests.fun;

public class A {
    static String m(int i) {
        return "int";
    }

    static String m(double i) {
        return "double";
    }

    public static void main(String[] args) {
        short a1 = 1;
        float b1 = 2;
        System.out.print(m(a1) + " : " + m(b1));
    }
}
