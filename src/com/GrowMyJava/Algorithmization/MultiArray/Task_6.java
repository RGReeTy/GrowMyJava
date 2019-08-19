package com.GrowMyJava.Algorithmization.MultiArray;

import java.util.Scanner;

public class Task_6 {
    /* 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     * {1  1  1 ... 1  1  1}
     * {0  1  1 ... 1  1  0}
     * {0  0  1 ... 1  0  0}
     * {.  .  . ... .  .  .}
     * {0  1  1 ... 1  1  0}
     * {1  1  1 ... 1  1  1}
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an even number 'n' = ");
        int n = sc.nextInt();
        if (n <= 0 || n % 2 != 0) {
            System.out.println("Input an even number > 0!!");
        } else {
            int[][] matrix = new int[n][n];
            generateMatrix(matrix, n);
        }
    }

    private static void generateMatrix(int[][] matrix, int n) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((j <= i && j >= n - i - 1) || (j >= i && j <= n - i - 1)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.format("%1d\t", matrix[i][j]);
            }
            System.out.println();
        }
    }
}