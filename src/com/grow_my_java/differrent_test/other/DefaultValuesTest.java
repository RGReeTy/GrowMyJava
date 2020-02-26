package com.grow_my_java.differrent_test.other;

public class DefaultValuesTest {
    public static void main(String[] args) {
        DefaultValues d = new DefaultValues();
        d.aMethod();
    }
}

class DefaultValues {
    int a;
    String name;

    public void aMethod() {
        int b;
        int[] c = new int[5];
        System.out.println("a = " + a);
        System.out.println("name = " + name);
        //System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
    //a = 0
    //b - не проинициализировано
    //name = null
    //c = [I@3d494fbf
}
