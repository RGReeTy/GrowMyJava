package com.GrowMyJava.Algorithmization.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task_8 {
    //Дана последовательность целых чисел a1, a2, ..., a(n). Образовать новую последовательность, выбросив из исходной
    // те члены, которые равны min(a1, a2, ..., a(n)).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an array dimension = ");
        int N = sc.nextInt();
        if (N < 0) {
            System.out.println("Input a dimension > 0!!");
        } else {
            int[] arrayA = new int[N];
            System.out.println("Array is:" + Arrays.toString(createArray(arrayA, N)));//create an array with number of elements N
            int minValue = findingMin(arrayA);
            System.out.println("Minimum value of array is " + minValue);
            int[] newArray = deleteMinNumbers(arrayA, minValue);
            System.out.println("NEW array is:" + Arrays.toString(newArray));
        }
    }

    public static int[] createArray(int[] arrayA, int N) {
        for (int i = 0; i < N; i++) {
            arrayA[i] = (int) Math.PI * (i + 1) * N; //random sequence formula
        }
        arrayA[0] = 0; //for test
        arrayA[2] = 0; //for test
        arrayA[7] = 0; //for test
        return arrayA;
    }

    private static int findingMin(int arrayA[]) {
        int min = arrayA[0];
        for (int i = 0; i < arrayA.length; i++) {
            if (min > arrayA[i]) min = arrayA[i];
        }
        //System.out.println("Min number is =" + min);
        return min;
    }

    private static int[] deleteMinNumbers(int[] arrayA, int minValue) {
        int j = 0;
        int count = arrayA.length;
        for (int elem:arrayA) {
            if (elem== minValue) count--;
        }
        int[] newArr = new int[count];
        for (int element: arrayA) {
            if (element != minValue) {
                newArr[j++] = element;
            }
        }
        return newArr;
    }
}