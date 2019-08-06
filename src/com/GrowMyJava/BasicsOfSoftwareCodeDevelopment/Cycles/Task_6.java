package com.GrowMyJava.BasicsOfSoftwareCodeDevelopment.Cycles;

import java.util.Scanner;

public class Task_6 {
    //Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a positive integer = ");
        long x = sc.nextLong();
        if (x < 0) {
            System.out.println("Write a positive number!");
        } else if (x == 1) {
            System.out.println("Yours sum is 1 =|");
        } else if (x == 0) {
            System.out.println("Yours number is 0 =(");
        } else {
            long sum = 0;
            for (int i = 1; i <= x; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 1 to " + x + " is " + sum);

        }
    }
}