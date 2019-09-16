package com.GrowMyJava.Module_2_Algorithmization.Decomposition;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_16 {
    //16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
    //Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number n..");
        int n = Integer.parseInt(read.readLine());
        if (n <= 0) {
            System.out.println("Input a positive numbers > 0!!");
        } else {
            long sumOddNumbers = getSumOddNumbers(n);
            System.out.println("The sum of odd " + n + "-n digits: " + sumOddNumbers);
            System.out.println("Number of even digits of sum is: " + checkCountOfEvenDigits(sumOddNumbers));
        }
    }

    private static long getSumOddNumbers(int n) {
        long sum = 0;
        long min = (long) Math.pow(10, n - 1);
        long max = (long) Math.pow(10, n);
        for (long i = min; i <= max - 1; i++) {
            if (checkOddNumber(i)) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        return sum;
    }

    private static boolean checkOddNumber(long iterator) {
        int digit;
        while (iterator > 0) {
            digit = (int) iterator % 10;
            if (digit % 2 == 0) {
                return false;
            }
            iterator = iterator / 10;
        }
        return true;
    }

    private static int checkCountOfEvenDigits(long sumOddNumbers) {
        int digit;
        int counter = 0;
        while (sumOddNumbers > 0) {
            digit = (int) sumOddNumbers % 10;
            if (digit % 2 == 0) {
                counter++;
            }
            sumOddNumbers = sumOddNumbers / 10;
        }
        return counter;
    }
}