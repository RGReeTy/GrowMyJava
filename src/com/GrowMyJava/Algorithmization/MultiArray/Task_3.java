package com.GrowMyJava.Algorithmization.MultiArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    //Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an row dimension = ");
        int Row = sc.nextInt();
        System.out.println("Input an column dimension = ");
        int Col = sc.nextInt();
        if (Row < 0 && Col < 0) {
            System.out.println("Input a dimension > 0!!");
        } else {
            int[][] matrix = new int[Row][Col];
            createFullMatrix(matrix);
            System.out.println("Array has " + Row + " rows and " + Col + " columns" + Arrays.deepToString(matrix));
            System.out.println("Input an row coordinate (between 0 and " + Row + ") ..");
            int k = sc.nextInt();
            System.out.println("Input an column coordinate (between 0 and " + Col + ") ..");
            int p = sc.nextInt();
            showMeElement(matrix, k, p, Row, Col);
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

    private static void showMeElement(int[][] matrix, int k, int p, int Row, int Col) {
        if (k < Row && p < Col) {
            System.out.println(matrix[k][p]);
        } else {
            System.out.println("Mistake. Input numbers whitch are placed between borders!");
        }
    }
}