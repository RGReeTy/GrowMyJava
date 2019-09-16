package com.GrowMyJava.Module_2_Algorithmization.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task_10 {
    //Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
    //элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an array dimension = ");
        int N = sc.nextInt();
        if (N < 0) {
            System.out.println("Input a dimension > 0!!");
        } else {
            int[] array = new int[N];
            createArray(array, N);//create an array with number of elements N
            System.out.println("Array has " + N + " elements : " + Arrays.toString(array));
            System.out.println("Array has " + N + " elements : " + Arrays.toString(pressArray(array, N)));
        }
    }

    public static int[] createArray(int[] array, int N) {
        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    private static int[] pressArray(int[] array, int N) {

        for (int i = 1; i < array.length; ) {
            array[i] = 0;
            i = i + 2;
        }
        sortArray(array);
        return array;
    }

    private static int[] sortArray(int[] array) {//like bubble sort
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != 0) {
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
