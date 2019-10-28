package com.grow_my_java.module_2_algorithmization.Decomposition;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_6 {
    //6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter first number:");
            int a = Integer.parseInt(read.readLine());

            System.out.println("Enter second number: ");
            int b = Integer.parseInt(read.readLine());

            System.out.println("Enter third number: ");
            int c = Integer.parseInt(read.readLine());

            int[] array = {a, b, c};
            System.out.println("This numbers are mutually simple? : ");
            System.out.println(isMutually(array));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int findAnswer(int[] array) {
        int a = array[0];
        for (int element : array) {
            int b = element;
            while (a != 0 && b != 0) {
                if (a > b) {
                    a %= b;
                } else {
                    b %= a;
                }
            }
            a += b;
        }
        return a;
    }

    private static boolean isMutually(int[] array) {
        return findAnswer(array) == 1;
    }
}

