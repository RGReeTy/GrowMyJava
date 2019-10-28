package com.grow_my_java.module_2_algorithmization.MultiArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_15 {
    //15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
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
            int maxElement = findMaximumElem(matrix);
            System.out.println("Maximal element of matrix is: " + maxElement);
            changeEveryOddElementMaxElem(maxElement, matrix);
            System.out.println("Final matrix is: \n" + Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

        }
    }

    private static int findMaximumElem(int[][] matrix) {
        int maxElem = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElem) maxElem = matrix[i][j];
            }
        }
        return maxElem;
    }

    private static int[][] changeEveryOddElementMaxElem(int maxElement, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) matrix[i][j] = maxElement;
            }
        }
        return matrix;
    }

    private static int[][] generateMatrix(int[][] matrix) {
        Random rand = new Random();
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                matrix[a][b] = rand.nextInt(1001);
            }
        }
        return matrix;
    }
}