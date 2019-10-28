package com.grow_my_java.module_2_algorithmization.MultiArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task_14 {
    //14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
    //единиц равно номеру столбца.
    public static void main(String[] args) {
        generateMatrix();
    }

    public static void generateMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number of rows in matrix 'm' = ");
        int m = sc.nextInt();
        System.out.println("Input a number of columns in matrix 'n' = ");
        int n = sc.nextInt();
        if (m <= 0 || n <= 0) {
            System.out.println("Input a positive dimension > 0!!");
        } else {
            int[][] matrix = new int[m][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i < j) {
                        matrix[i][j] = 1;
                    }
                }
            }
            System.out.println("Matrix has " + m + " rows and " + n + " columns: \n" + Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        }
    }
}