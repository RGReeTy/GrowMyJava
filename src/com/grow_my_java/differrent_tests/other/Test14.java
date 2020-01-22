package com.grow_my_java.differrent_tests.other;

public class Test14 {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(c1);
        Complex c3 = c1;
        System.out.println(c2);
        System.out.println(c1 == c2);
        System.out.println(c3 == c2);
        System.out.println(c1 == c3);
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c1.equals(c3));

    }
}

final class Complex {
    private double re, im;

    public Complex(double re, double im) {
        System.out.println("Complex (double re+mi) constructor called");
        this.re = re;
        this.im = im;
    }

    Complex(Complex c) {
        this(c.im, c.re);
        System.out.println("Complex(Complex c) constructor called");
    }

    public String toString() {
        return "(" + re + "+" + im + "i)";
    }
    //Complex (double re+mi) constructor called
    //Complex (double re+mi) constructor called
    //Complex(Complex c) constructor called
    //(15.0+10.0i)
    //false
    //false
    //true
    //false
    //false
    //true
}
