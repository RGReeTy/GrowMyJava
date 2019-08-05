package com.GrowMyJava.BasicsOfSoftwareCodeDevelopment.Branching;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x = ");
        double x = sc.nextDouble();
        double answer = x > 3 ? foo2(x) : foo1(x);
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("Answer is: " + df.format(answer));
    }

    public static double foo1(double x) {
        double result = Math.pow(x, 2) - 3 * x + 9;
        return result;
    }

    public static double foo2(double x) {
        double result = 1 / (Math.pow(x, 3) + 6);
        return result;
    }
}