package com.GrowMyJava.Module_2_Algorithmization.Decomposition;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_12 {
    //12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
    //являются числа, сумма цифр которых равна К и которые не большее N.
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number K..");
        int K = Integer.parseInt(read.readLine());
        System.out.println("Enter a number N..");
        int N = Integer.parseInt(read.readLine());
        if (K <= 0 || N <= 0) {
            System.out.println("Input a positive numbers > 0!!");
        } else {
            int[] array = getRightArray(K, N);
            if (array.length < 1) {
                System.out.println("Can't to find any coincidences!");
            } else {
                for (int value : array) {
                    System.out.print(value + " ");
                }
            }
        }
    }

    private static int[] getRightArray(int sumOfDigits, int maxNumber) {
        int count = 0;
        int start = 0;
        int summ;
        int[] array = new int[maxNumber];
        for (int i = 0; i < array.length; i++) {
            //verify numbers from 0 to N
            for (int j = start + 1; j < maxNumber; j++) {
                summ = 0;
                int temp = j;
                while (temp > 0) {
                    int digits = temp % 10;
                    temp /= 10;
                    summ += digits;
                }
                if (summ == sumOfDigits) {
                    start = j;
                    break;
                }
            }

            if (i > 0) {
                if (start == array[i - 1]) {
                    start = 0;
                    break;
                }
            }
            array[i] = start;
        }

        // find final length of array
        for (int value : array) {
            if (value > 0) {
                count++;
            }
        }

        int[] arrayFinal = new int[count];
        System.arraycopy(array, 0, arrayFinal, 0, arrayFinal.length);
        return arrayFinal;
    }
}

