package com.GrowMyJava.Algorithmization.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    //Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
    //положительных и нулевых элементов.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an array dimension = ");
        int N = sc.nextInt();
        double[] arrayA = new double[N];
        createArray(arrayA, N);//create an array with number of elements N
        System.out.println("Array has " + N + " elements : " + Arrays.toString(arrayA));
        compareElements(arrayA);
    }

    public static double[] createArray(double[] arrayA, int N) {
        for (int i = 0; i < N; i++) {
            arrayA[i] = (i * i - N); //random sequence formula
        }
        return arrayA;
    }

    private static void compareElements(double arrayA[]) {
        int countPlus = 0;
        int countMinus = 0;
        int countZero = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] == 0) {
                countZero++;
            }
            if (arrayA[i] < 0) {
                countMinus++;
            } else {
                countPlus++;
            }
        }
        System.out.println("The array is contained " + countZero + " zero elements, " + countPlus + " positive elements, " + countMinus + " negative elements");
    }
}