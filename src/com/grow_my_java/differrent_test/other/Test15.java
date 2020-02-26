package com.grow_my_java.differrent_test.other;

public class Test15 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
    }
}

class A {
    static int a = 0;
    static int c = a;

    static {
        a = a + 5;
    }

    static {
        a = a + 9;
    }

    int b = a++;
    int d = a;

    {
        a = a + 2;
    }

    public A() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}