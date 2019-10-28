package com.grow_my_java.module_2_algorithmization.SortedArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_3 {
    //3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an
    //.Требуется переставить элементы так,чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого,
    // выбирается наибольший элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со
    // второго, эта процедура повторяется. Написать алгоритм сортировки выбором
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a dimension of array 'N' = ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Input a positive dimension > 0!!");
        } else {
            int[] array = generateMatrix(N);
            System.out.println("Array has " + N + " columns: \n" + Arrays.toString(array));
            System.out.println("Distinct array is: \n" + Arrays.toString(sortBySelection(array)));
        }
    }

    private static int[] sortBySelection(int[] array) {
        int swapIndex;
        int temp;
        for (int index = 0; index < array.length; index++) {
            int max = array[index];
            swapIndex = index;
            for (int sub = index + 1; sub < array.length; sub++) {
                if (max < array[sub]) {
                    max = array[sub];
                    swapIndex = sub;
                }
            }
            if (swapIndex != index) {
                temp = array[index];
                array[index] = array[swapIndex];
                array[swapIndex] = temp;
            }
        }
        return array;
    }

    public static int[] generateMatrix(int dimension) {
        Random rand = new Random();
        int coefficient = rand.nextInt(10) + 1;
        int[] array = new int[dimension];
        for (int a = 0; a < array.length; a++) {
            array[a] = (a + 1) * coefficient;
        }
        return array;
    }
}
