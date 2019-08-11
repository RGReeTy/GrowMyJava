package com.GrowMyJava.Algorithmization.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    //Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an array dimension = ");
        int N = sc.nextInt();
        double[] arrayA = new double[N];
        createArray(arrayA, N);//create an array with number of elements N
        System.out.println("Array has " + N + " elements : " + Arrays.toString(arrayA));
        findMaxAndMinWithReplacing(arrayA);
    }

    public static double[] createArray(double[] arrayA, int N) {
        for (int i = 0; i < N; i++) {
            arrayA[i] = (double)(Math.round(Math.random() * N * 100))/100; //random sequence formula
        }
        return arrayA;
    }

    private static void findMaxAndMinWithReplacing(double arrayA[]) {
        int indexOfMax = 0;
        int indexOfMin = 0;
        double temp = 0;
        for (int i = 1; i < arrayA.length; i++) {
            if (arrayA[i] > arrayA[indexOfMax]) {
                indexOfMax = i;
                temp = arrayA[i];
            } else if (arrayA[i] < arrayA[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println("Max number of array is: " + arrayA[indexOfMax] + ", min number of array is:" + arrayA[indexOfMin]);
        temp = arrayA[indexOfMax];
        arrayA[indexOfMax] = arrayA[indexOfMin];
        arrayA[indexOfMin] = temp;
        System.out.println("New Array : " + Arrays.toString(arrayA));
    }
}