package com.GrowMyJava.Algorithmization.MultiArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    /*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)...
     * {1  2   3  ... n}
    * {n n-1 n-2 ... 1}
    * {1  2   3  ... n}
    * {n n-1 n-2 ... 1}
    * {. ... ... ... .}
     * {n n-1 n-2 ... 1}
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
            //System.out.println("Matrix has " + n + " rows and " + n + " columns: \n" + Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        }
    }

    private static int[][] generateMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                    System.out.format("%d\t", matrix[i][j]);
                } else {
                    matrix[i][j] = matrix.length - j;
                    System.out.format("%d\t", matrix[i][j]);
                }
            }
            System.out.println();
        }
        return matrix;
    }
}