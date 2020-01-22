package com.grow_my_java.differrent_tests.other;

public class LoseAccuracy02 {
    public static void main(String[] args) {
        float f1 = 1.2345f;
        double d1 = f1;
        double d2 = 1.2345;
        System.out.println("f1 - " + f1);
        System.out.println("d1 - " + d1);
        System.out.println("------------------- - ");
        System.out.printf("f1 = %.16f\n", f1);
        System.out.printf("d2 = %.16f\n", d2);
    }
}
