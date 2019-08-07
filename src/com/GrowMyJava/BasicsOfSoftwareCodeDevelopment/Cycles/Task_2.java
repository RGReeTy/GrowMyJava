package com.GrowMyJava.BasicsOfSoftwareCodeDevelopment.Cycles;

import java.util.Scanner;

public class Task_2 {
    //Вычислить значения функции на отрезке [а,b] c шагом h
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a first point = ");
        float a = sc.nextFloat();
        System.out.println("Input a last point = ");
        float b = sc.nextFloat();
        System.out.println("Input a step = ");
        float h = sc.nextFloat();
        float x;
        float y;
        for (x = a; x <= b; x += h) {
            if (x <= 2) {
                y = -x;
                System.out.println(" a= " + a + " b= " + b + " x= " + x + " y= " + y);
            } else {
                y = x;
                System.out.println(" a= " + a + " b= " + b + " x= " + x + " y= " + y);
            }
        }

    }
}
