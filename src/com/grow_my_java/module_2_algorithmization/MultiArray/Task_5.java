package com.grow_my_java.module_2_algorithmization.MultiArray;

import java.util.Scanner;

public class Task_5 {
    /* 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     * {1  1  1  ...  1  1  1}
     * {2  2  2  ...  2  2  0}
     * {3  3  3  ...  3  0  0}
     * {.. .. .. ... .. .. ..}
     * {n-1 n-1 0 ... 0  0  0}
     * {n  0  0  ...  0  0  0}
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an even number 'n' = ");
        int n = sc.nextInt();
        if (n <= 0 || n % 2 !=  0) {
            System.out.println("Input an even number > 0!!");
        } else {
            int[][] matrix = new int[n][n];
            generateMatrix(matrix);
        }
    }

    private static void generateMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j < matrix[i].length - i) {
                    matrix[i][j] = i + 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.format("%1d\t", matrix[i][j]);
            }
            System.out.println();
        }
    }
}