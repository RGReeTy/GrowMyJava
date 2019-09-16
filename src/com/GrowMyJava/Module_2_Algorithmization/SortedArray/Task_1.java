package com.GrowMyJava.Module_2_Algorithmization.SortedArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    //1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
    //один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
    //дополнительный массив.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a dimension of matrix 'N' = ");
        int N = sc.nextInt();
        System.out.println("Input a dimension of matrix 'M' = ");
        int M = sc.nextInt();
        if (N <= 0 || M <= 0) {
            System.out.println("Input a positive dimension > 0!!");
        } else {
            int[] arrayFirst = generateMatrix(N);
            int[] arraySecond = generateMatrix(M);
            System.out.println("First array has " + N + " columns: \n" + Arrays.toString(arrayFirst));
            System.out.println("Second array has " + M + " columns: \n" + Arrays.toString(arraySecond));
            System.out.println("Input a natural number 'k' = ");
            int k = sc.nextInt();
            if (k <= 0 || k > arrayFirst.length) {
                System.out.println("Input a positive number 0 <'k'< length of first array!!");
            } else {
                System.out.println("Union array has " + (N + M) + " columns: \n" + Arrays.toString(unionArray(arrayFirst, arraySecond, k)));
            }
        }
    }

    private static int[] unionArray(int[] arrayFirst, int[] arraySecond, int k) {
        int[] unionArray = new int[arrayFirst.length + arraySecond.length];
        int secondArrayIndex = 0;
        for (int i = 0; i < unionArray.length; i++) {
            if (i < k) {
                unionArray[i] = arrayFirst[i];
            } else if (i >= k && i < (k + arraySecond.length)) {
                unionArray[i] = arraySecond[secondArrayIndex++];
            } else {
                unionArray[i] = arrayFirst[k++];
            }
        }
        return unionArray;
    }

    public static int[] generateMatrix(int dimension) {
        Random rand = new Random();
        int[] array = new int[dimension];
        for (int a = 0; a < array.length; a++) {
            array[a] = rand.nextInt(101);
        }
        return array;
    }
}

