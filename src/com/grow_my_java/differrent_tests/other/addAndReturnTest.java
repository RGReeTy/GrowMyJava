package com.grow_my_java.differrent_tests.other;

public class addAndReturnTest {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        a = addAndReturn(b++, a++ + b++);
        System.out.print(a + " ");
        System.out.print(b + " ");
    }

    public static int addAndReturn(int x, int y) {
        int z;
        System.out.print(x + " ");
        System.out.print(y + " ");
        z = x + y;
        return z;
    }

}
