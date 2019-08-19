package com.GrowMyJava.Algorithmization.MultiArray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task_10 {
    //10. Найти положительные элементы главной диагонали квадратной матрицы.
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
            positiveElementsFromMainDiagonal(matrix);
        }
    }

    private static int[][] generateMatrix(int[][] matrix) {
        Random rand = new Random();
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                matrix[a][b] = rand.nextInt() / 10000000;
            }
        }
        return matrix;
    }

    private static void positiveElementsFromMainDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j & matrix[i][j] > 0) {
                    System.out.format("%1d\t", matrix[i][j]);
                    break;
                } //else break;
            }
            // System.out.println("Final matrix is: \n" + Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        }
    }
}