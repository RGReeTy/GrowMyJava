package com.GrowMyJava.Algorithmization.Decomposition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_2 {
    //2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter first number: ");
            int A = Integer.parseInt(read.readLine());
            System.out.println("Enter second number: ");
            int B = Integer.parseInt(read.readLine());
            System.out.println("Enter third number: ");
            int C = Integer.parseInt(read.readLine());
            System.out.println("Enter fourth number: ");
            int D = Integer.parseInt(read.readLine());
            findMaxCommonNOD(A, B, C, D);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void findMaxCommonNOD(int A, int B, int C, int D) {
        int NOD = 0;
        int[] temp = {A, B, C, D};
        int size = temp.length;
        temp = sortShells(temp, size);
        System.out.println(Arrays.toString(temp));
        if (temp[1] % temp[0] != 0 & temp[2] % temp[0] != 0 & temp[3] % temp[0] != 0) {
            System.out.println("These numbers don't have the greatest common factor!");
        } else {
            for (int i = 1; i <= temp[0]; i++) {
                if (temp[0] % i == 0 & temp[1] % i == 0 & temp[2] % i == 0 & temp[3] % i == 0) NOD = i;
            }
        }
        if (NOD != 0) System.out.println("These numbers have the greatest common factor = " + NOD);
    }

    private static int[] sortShells(int[] array, int size) {
        int step = size / 2;
        while (step > 0) {
            for (int i = 0; i < (size - step); i++) {
                int j = i;
                while (j >= 0 && array[j] > array[j + step]) {
                    int temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                    j--;
                }
            }
            step = step / 2;
        }
        return array;
    }
}
