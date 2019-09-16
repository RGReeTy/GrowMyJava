package com.GrowMyJava.Module_2_Algorithmization.Decomposition;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_13 {
    //13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
    //Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
    //решения задачи использовать декомпозицию.

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number N..");
        int N = Integer.parseInt(read.readLine());
        if (N <= 2) {
            System.out.println("Input a positive numbers > 2!!");
        } else {
            getTwins(N);
        }
    }

    private static void getTwins(int n) {
        for (int i = n; i < n * 2; i++) {
            if (i < n * 2 - 1) {
                System.out.println("( " + i + " and " + (i + 2) + ")");
            }
        }
    }
}