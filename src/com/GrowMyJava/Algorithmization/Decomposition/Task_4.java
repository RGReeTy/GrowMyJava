package com.GrowMyJava.Algorithmization.Decomposition;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    //4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
    //из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
    public static void main(String[] args) {
        int array[] = create3points();
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        System.out.println("Input a XY coordinate for a first point = ");
        int X1 = scanner.nextInt();
        int Y1 = scanner.nextInt();
        System.out.println("Input a XY coordinate for a second point = ");
        int X2 = scanner.nextInt();
        int Y2 = scanner.nextInt();
        System.out.println("Input a XY coordinate for a third point = ");
        int X3 = scanner.nextInt();
        int Y3 = scanner.nextInt();
        if (N <= 0) {
            System.out.println("Input a positive dimension > 0!!");
        } else {
            int[] array = generateMatrix(N);
            int maxElement = findMaxElem(array);
            System.out.println("Array has " + N + " elements : " + Arrays.toString(array));
            System.out.println("The max element of array is " + maxElement);
            System.out.println("The seconds max element of array is " + find2ndMaxElem(array, maxElement));
        }
    }

    private static int[] create3points() {
    }

    private static int findMaxElem(int[] array) {
        int maxElem = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxElem < array[i]) {
                maxElem = array[i];
            }
        }
        return maxElem;
    }

    private static int find2ndMaxElem(int[] array, int maxElement) {
        int max2ndElem = 0;
        for (int i = 0; i < array.length; i++) {
            if (max2ndElem < array[i] /*& array[i] != maxElement*/) {
                if (array[i] != maxElement) max2ndElem = array[i];
            }
        }
        return max2ndElem;
    }

    public static int[] generateMatrix(int dimension) {
        Random rand = new Random();
        int[] array = new int[dimension];
        for (int a = 0; a < array.length; a++) {
            array[a] = rand.nextInt(101);
        }
        return array;
    }
}
