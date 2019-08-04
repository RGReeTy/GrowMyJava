package com.GrowMyJava.BasicsOfSoftwareCodeDevelopment.Procedur_prog;

import java.util.Scanner;
// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//𝑡𝑖𝑜𝑦 + 𝑑𝑝𝑡𝑧
//𝑑𝑝𝑡𝑦 − 𝑡𝑖𝑜𝑧
//∗ 𝑢𝑔 𝑦𝑧
public class Task_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number x = ");
        double x = sc.nextDouble();
        System.out.println("Input a number y = ");
        double y = sc.nextDouble();
        System.out.println("Result: " + funct(x, y));
        sc.close();
    }

    public static double funct(double x, double y) {
        double z = ((Math.sin(x) + Math.cos(y))/(Math.cos(x)-Math.sin(y)))*(Math.tan(x*y));
        return z;
    }
}
