package com.GrowMyJava.Module_1_BasicsOfSoftwareCodeDevelopment.Cycles;

import java.util.Scanner;

public class Task_7 {
    // Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    //m и n вводятся с клавиатуры.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write m and n :");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m <= 0 || n < +0) {
            System.out.println("Write a positive numbers more than zero!");
        } else {
            showDelivers(m, n);
        }
    }

    private static void showDelivers(int m, int n) {
        for (int i = m; i <= n; i++) {//Делитель меньше конечного n
            for (int del = 2; del < i; del++) {//Делитель=2 - по условию: кроме еденицы
                if (i % del == 0) System.out.println("The deliver of " + i + " is : " + del);
            }
        }
    }
}