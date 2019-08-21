package com.GrowMyJava.Algorithmization.MultiArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_12 {
    //12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
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
            sortRowsIncrease(matrix);
            System.out.println("Matrix has increased sorting rows: \n" + Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            sortRowsDecrease(matrix);
            System.out.println("Matrix has decreased sorting rows: \n" + Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        }
    }

    public static int[][] generateMatrix(int[][] matrix) {
        Random rand = new Random();
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                matrix[a][b] = rand.nextInt(1001);
            }
        }
        return matrix;
    }

    private static int[][] sortRowsIncrease(int matrix[][]) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        isSorted = false;

                        buf = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = buf;
                    }
                }
            }
        }
        return matrix;
    }

    private static int[][] sortRowsDecrease(int matrix[][]) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] < matrix[i][j + 1]) {
                        isSorted = false;

                        buf = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = buf;
                    }
                }
            }
        }
        return matrix;
    }
}