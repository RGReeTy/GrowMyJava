package com.GrowMyJava.Algorithmization.Decomposition;

import java.util.Arrays;

public class Task_8 {
    //8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    //Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
    //массива с номерами от k до m.
    /*По условию нумерация начинается с 1, поэтому сделаю 7 элементов массива*/
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int sum1 = findSumElem(array, 1, 3);
        System.out.println("The sum of numbers from indexes 1 to 3 is " + sum1);
        int sum2 = findSumElem(array, 3, 5);
        System.out.println("The sum of numbers from indexes 3 to 5 is " + sum2);
        int sum3 = findSumElem(array, 4, 6);
        System.out.println("The sum of numbers from indexes 4 to 6 is " + sum3);
    }

    private static int findSumElem(int[] array, int startNumber, int endNumber) {
        int sum = 0;
        for (int a = startNumber; a <= endNumber; a++) {
            sum += array[a];
        }
        return sum;
    }

}
