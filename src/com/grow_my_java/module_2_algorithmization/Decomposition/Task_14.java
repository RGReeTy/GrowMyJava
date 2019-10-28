package com.grow_my_java.module_2_algorithmization.Decomposition;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_14 {
    //14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
    //возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
    //использовать декомпозицию.

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number k..");
        int k = Integer.parseInt(read.readLine());
        if (k <= 0) {
            System.out.println("Input a positive numbers > 0!!");
        } else {
            getArmstrongNumber(k);
        }
    }

    private static int getNumberOfDigits(int i) {
        int count = 0;
        while (i != 0) {
            count++;
            i /= 10;
        }
        return count;
    }

    private static int findSumOfElements(int i) {
        int number = i;
        int summ = 0;
        while (number != 0) {
            summ += Math.pow(number % 10, getNumberOfDigits(i));
            number /= 10;
        }
        return summ;
    }

    private static boolean checkNumber(int i) {
        boolean bool = false;
        if (findSumOfElements(i) == i) {
            bool = true;
        }
        return bool;
    }

    private static void printArmstrongNumber(int i) {
        if (checkNumber(i)) {
            System.out.print(i + " ");
        }
    }

    private static void getArmstrongNumber(int k) {
        for (int i = 1; i <= k; i++) {
            printArmstrongNumber(i);
        }
    }
}