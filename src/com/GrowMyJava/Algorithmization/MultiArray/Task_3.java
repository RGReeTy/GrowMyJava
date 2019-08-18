package com.GrowMyJava.Algorithmization.MultiArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    //Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a row dimension = ");
        int Row = sc.nextInt();
        System.out.println("Input a column dimension = ");
        int Col = sc.nextInt();
        if (Row < 0 && Col < 0) {
            System.out.println("Input a dimension > 0!!");
        } else {
            int[][] matrix = new int[Row][Col];
            createFullMatrix(matrix);
            System.out.println("Matrix has " + Row + " rows and " + Col + " columns: \n" + Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            System.out.println("Input an row (between 1 and " + Row + ") ..");
            int k = sc.nextInt();
            System.out.println("Input an column (between 1 and " + Col + ") ..");
            int p = sc.nextInt();
            showMeRow(matrix, k, Row);
            showMeCol(matrix, p, Col);
        }
    }

    public static int[][] createFullMatrix(int[][] matrix) {
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                matrix[a][b] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    private static void showMeRow(int[][] matrix, int k, int Row) {
        System.out.print("Yours row №" + Row + " is: ");
        if (k > 0 && k <= Row) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[k - 1][i] + " ");
            }
        } else {
            System.out.println("Mistake. Input numbers which are placed between borders!");
        }
    }

    private static void showMeCol(int[][] matrix, int p, int Col) {
        System.out.print("\n Yours col №" + Col + " is: ");
        if (p > 0 && p <= Col) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][p - 1] + " ");
            }
        } else {
            System.out.println("Mistake. Input numbers which are placed between borders!");
        }
    }
}