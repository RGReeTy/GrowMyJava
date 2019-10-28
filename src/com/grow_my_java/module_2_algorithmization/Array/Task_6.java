package com.grow_my_java.module_2_algorithmization.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {
    //Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
    //являются простыми числами.
    // 1 не является простым числом!!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an array dimension = ");
        int N = sc.nextInt();
        if (N < 0) {
            System.out.println("Input a dimension > 0!!");
        } else {
            double[] arrayA = new double[N];
            createArray(arrayA, N);//create an array with number of elements N
            System.out.println("Array has " + N + " elements : " + Arrays.toString(arrayA));
            sumOfNumbers(arrayA);
        }
    }

    public static double[] createArray(double[] arrayA, int N) {
        for (int i = 0; i < N; i++) {
            arrayA[i] = Math.PI * i * N; //random sequence formula
        }
        return arrayA;
    }

    private static void sumOfNumbers(double[] array) {
        double sum = 0;
        int count = 0;
        for (int i = 2; i < array.length; i++) {
            if (primeNumber(i)) {
                sum += array[i];
                count++;
            }
        }
        System.out.println("The count of prime numbers is :" + count);
        System.out.println("The sum of prime numbers is :" + sum);
    }

    private static boolean primeNumber(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        System.out.println(i + " is prime number!");
        return true;
    }
}