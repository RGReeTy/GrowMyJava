package com.GrowMyJava.Module_2_Algorithmization.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task_9 {
    //В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
    //чисел несколько, то определить наименьшее из них
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an array dimension = ");
        int N = sc.nextInt();
        if (N < 0) {
            System.out.println("Input a dimension > 0!!");
        } else {
            //int []array = {1, 1, 1, 2, 2, 2, 3, 3}; //for testing
            int[] array = new int[N];
            System.out.println("Array is:" + Arrays.toString(createArray(array, N)));//create an array with number of elements N
            System.out.println("Most popular number of array is " + findPopular(array));
        }
    }

    private static int[] createArray(int[] array, int N) {

        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 10); //random sequence formula
        }
        return array;
    }

    private static int findPopular(int[] array) {
        int prev = array[0];
        int popular = array[0];
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == prev)
                count++;
            else {
                if (count > maxCount) {
                    popular = array[i - 1];
                    maxCount = count;
                }
                prev = array[i];
                count = 1;
            }
        }
        return count > maxCount ? array[array.length - 1] : popular;
    }
}