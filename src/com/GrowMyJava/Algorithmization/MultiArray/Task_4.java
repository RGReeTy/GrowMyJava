package com.GrowMyJava.Algorithmization.MultiArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an even number 'n' = ");
        int n = sc.nextInt();
        if (n <= 0 || n % 2 !=  0) {
            System.out.println("Input an even number > 0!!");
        } else {
            int[][] matrix = new int[n][n];
            generateMatrix(matrix, n);
            System.out.println("Matrix has " + n + " rows and " + n + " columns: \n" + Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        }
    }

    private static int[][] generateMatrix(int[][] matrix, int n) {
        for (int a = 0; a < matrix.length; a=+2) {
            for (int b = 0; b < matrix[a].length; b++) {
                matrix[a][b] = b+1;
            }
        }
        for (int x = 1; x < matrix.length; x=+2) {
            for (int y = n; y < matrix[x].length; y--) {
                matrix[x][y] = y-1;
            }
        }
        return matrix;
    }
}