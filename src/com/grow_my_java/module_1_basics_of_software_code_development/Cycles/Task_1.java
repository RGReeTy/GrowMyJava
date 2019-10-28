package com.grow_my_java.module_1_basics_of_software_code_development.Cycles;

import java.util.Scanner;

public class Task_1 {
    //Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
    //все числа от 1 до введенного пользователем числа
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