package com.GrowMyJava.Algorithmization.MultiArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task_9 {
    //9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
    // Определить, какой столбец содержит максимальную сумму.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a dimension of matrix 'N' = ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Input a positive dimension > 0!!");
        } else {
            int[][] matrix = new int[N][N];
            generateMatrix(matrix);
            System.out.println("Matrix has " + N + " rows and columns: \n" + Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            findSumAtColumn(matrix);
        }
    }

    private static int[][] generateMatrix(int[][] matrix) {
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                matrix[a][b] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    private static void findSumAtColumn(int[][] matrix) {
        int maxCount = 0;
        int indexCol = 0;
        for (int i = 0; i < matrix.length; ) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            System.out.println("Sum of " + (i + 1) + " column is " + sum);
            if (maxCount < sum) {
                maxCount = sum;
                indexCol = i + 1;
            }
            i++;
        }
        System.out.println("Maximal summ is in " + indexCol + " column and it's " + maxCount);
    }
}