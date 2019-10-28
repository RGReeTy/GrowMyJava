package com.grow_my_java.module_2_algorithmization.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    //В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an array dimension = ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Please enter a positive number!!");
        } else {
            int[] arrayA = new int[N];
            createArray(arrayA, N);//create an array with number of elements N
            System.out.println("Array has " + N + " elements : " + Arrays.toString(arrayA));
            System.out.println("Input a deliver K = ");
            int K = sc.nextInt();
            if (K <= 0) {
                System.out.println("Please enter a positive number!!");
            } else {
                showElementsDevK(K, arrayA);
            }
        }
    }

    public static int[] createArray(int[] arrayA, int N) {
        for (int i = 0; i < N; i++) {
            arrayA[i] = (int) (Math.random() * 100);
        }
        //System.out.println("Array has " + N + " elements : " + Arrays.toString(arrayA));
        return arrayA;
    }

    private static void showElementsDevK(int K, int arrayA[]) {
        int sum = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % K == 0) {
                sum += arrayA[i];
            }
        }
        System.out.println("The sum of elements is: " + sum);
    }
}