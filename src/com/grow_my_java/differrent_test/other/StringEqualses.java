package com.grow_my_java.differrent_test.other;

public class StringEqualses {

    public static void main(String[] args) {
        System.out.println("A ");
        synchronized (args) {
            System.out.println("B ");
            try {
                args.wait();
            } catch (InterruptedException e) {

            }
        }
        System.out.println("C ");
    }
}
