package com.grow_my_java.differrent_test.other;

public class InfinityTest {
    public static void main(String[] args) {
        double d = 1000000e100;
        int x = (int) d;
        int y = (int) -d;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        //x = 2147483647
        //y = -2147483648

        double xd = 0, yd = 0, zd;
        zd = yd / xd;
        System.out.println(zd);//NaN

        double xdd = 0, ydd = 2, zdd;
        zdd = ydd / xdd;
        System.out.println(zdd);//Infinity

        int xx = 0, yy = 2;
        double zz = yy / xx;
        //System.out.println(zz);//Exception in thread "main" java.lang.ArithmeticException: / by zero

        int xxx = 325;
        byte yyy = (byte) xxx;
        System.out.println(xxx + "\n" + yyy); //325    69
    }
}
