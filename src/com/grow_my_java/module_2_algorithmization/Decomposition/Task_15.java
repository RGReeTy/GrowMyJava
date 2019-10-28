package com.grow_my_java.module_2_algorithmization.Decomposition;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_15 {
    //15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
    //последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.


    public static void main(String[] args) {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number n..");
            long n = Long.parseLong(read.readLine());
            if (n <= 0) {
                System.out.println("Input a positive numbers > 0!!");
            } else {
                System.out.println("All numbers with digits that are in the increasing order:");
                getIncNumbers(n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getIncNumbers(long n) {
        long min = (long) Math.pow(10, n - 1);
        long max = (long) Math.pow(10, n);
        for (long i = min; i <= max - 1; i++) {
            if (isDesiredNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isDesiredNumber(long i) {
        int digit = (int) i % 10;
        i = i / 10;
        int current;
        while (i > 0) {
            current = (int) i % 10;
            i = i / 10;
            if (digit <= current) {
                return false;
            }
            digit = current;
        }
        return true;
    }
}