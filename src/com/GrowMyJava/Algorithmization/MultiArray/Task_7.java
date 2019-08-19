package com.GrowMyJava.Algorithmization.MultiArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task_7 {
    // 7. Сформировать квадратную матрицу порядка N по правилу:... и подсчитать количество положительных элементов в ней

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a dimension of matrix 'N' = ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Input a positive dimension > 0!!");
        } else {
            double[][] matrix = new double[N][N];
            generateMatrix(matrix, N);
            System.out.println("Matrix has " + N + " rows and columns: \n" + Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            countAllPositiveElem(matrix);
        }
    }

    private static double[][] generateMatrix(double[][] matrix, int N) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((i * i - j * j) / N);
            }
        }
        return matrix;
    }

    private static void countAllPositiveElem(double[][] matrix) {
        int count = 0;
        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                if (aDouble > 0) count++;
            }
        }
        System.out.println("Matrix has " + count + " positive elements");
    }
}