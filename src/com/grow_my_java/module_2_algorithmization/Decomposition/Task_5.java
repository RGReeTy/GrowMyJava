package com.grow_my_java.module_2_algorithmization.Decomposition;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_5 {
    //5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
    //которое меньше максимального элемента массива, но больше всех других элементов).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        System.out.println("Input a dimension of array = ");
        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("Input a positive dimension > 0!!");
        } else {
            int[] array = generateMatrix(N);
            int maxElement = findMaxElem(array);
            System.out.println("Array has " + N + " elements : " + Arrays.toString(array));
            System.out.println("The max element of array is " + maxElement);
            System.out.println("The seconds max element of array is " + find2ndMaxElem(array, maxElement));
        }
    }

    private static int findMaxElem(int[] array) {
        int maxElem = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxElem < array[i]) {
                maxElem = array[i];
            }
        }
        return maxElem;
    }

    private static int find2ndMaxElem(int[] array, int maxElement) {
        int max2ndElem = 0;
        for (int i = 0; i < array.length; i++) {
            if (max2ndElem < array[i] /*& array[i] != maxElement*/) {
                if (array[i] != maxElement) max2ndElem = array[i];
            }
        }
        return max2ndElem;
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
