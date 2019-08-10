package com.GrowMyJava.Algorithmization.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    //Дана последовательность действительных чисел а 1 ,а 2 ,..., а п . Заменить все ее члены, большие данного Z, этим
    //числом. Подсчитать количество замен.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an array dimension = ");
        int N = sc.nextInt();
        double[] arrayA = new double[N];
        createArray(arrayA, N);//create an array with number of elements N
        System.out.println("Array has " + N + " elements : " + Arrays.toString(arrayA));
        System.out.println("Input a number Z = ");
        double Z = sc.nextDouble();
        compareElementsAndZ(Z, arrayA);
    }

    public static double[] createArray(double[] arrayA, int N) {
        for (int i = 0; i < N; i++) {
            arrayA[i] = (i * i - N); //random sequence formula
        }
        return arrayA;
    }

    private static void compareElementsAndZ(double Z, double arrayA[]) {
        int count = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] > Z) {
                arrayA[i] = Z;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No replacements made!");
        } else {
            System.out.println("The count of change: " + count);
        }
        System.out.println("The final array is: " + Arrays.toString(arrayA));
    }
}