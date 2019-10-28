package com.grow_my_java.module_2_algorithmization.SortedArray;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_6 {
    //6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
    //Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai<=ai+1, то продвинуться
    // на один элемент вперед. Если ai>ai+1, то производится перестановка и сдвигаются на один элемент назад.
    //Составить алгоритм этой сортировки.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        System.out.println("Input a dimension of array 'N' = ");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Input a positive dimension > 0!!");
        } else {
            double[] array = generateMatrix(size);
            System.out.println("Array has " + size + " columns: \n" + Arrays.toString(array));
            System.out.println("Sorted array is: \n" + Arrays.toString(sortShells(array, size)));
            scanner.close();
            printWriter.close();
        }
    }

    private static double[] sortShells(double[] array, int size) {
        int step = size / 2;
        while (step > 0) {
            for (int i = 0; i < (size - step); i++) {
                int j = i;
                while (j >= 0 && array[j] > array[j + step]) {
                    double temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                    j--;
                }
            }
            step = step / 2;
        }
        return array;
    }

    public static double[] generateMatrix(int dimension) {
        Random rand = new Random();
        double[] array = new double[dimension];
        for (int a = 0; a < array.length; a++) {
            array[a] = rand.nextDouble() * 10;
        }
        return array;
    }
}