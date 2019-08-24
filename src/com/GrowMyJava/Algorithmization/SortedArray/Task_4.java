package com.GrowMyJava.Algorithmization.SortedArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    //4. Сортировка обменами. Дана последовательность чисел a1 >= a2 >= ... >= an Требуется переставить числа в
    //порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 Если ai> ai+1, то делается
    //перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
    //Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a dimension of array 'N' = ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Input a positive dimension > 0!!");
        } else {
            int[] array = generateMatrix(N);
            System.out.println("Array has " + N + " columns: \n" + Arrays.toString(array));
            System.out.println("Sorted array is: \n" + Arrays.toString(sortBySelection(array)));
        }
    }

    private static int[] sortBySelection(int[] array) {
        int counter = 0;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    counter++;
                    needIteration = true;
                }
            }
        }
        System.out.println("The elements of array are change own index " + counter + " times.");
        return array;
    }

    public static int[] generateMatrix(int dimension) {
        Random rand = new Random();
        int coefficient = rand.nextInt(1000) + 50;
        int[] array = new int[dimension];
        for (int a = 0; a < array.length; a++) {
            array[a] = coefficient / (a + 1);
        }
        return array;
    }
}