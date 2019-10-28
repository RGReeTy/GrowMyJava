package com.grow_my_java.module_2_algorithmization.MultiArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task_8 {
    //В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
    //на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
    //пользователь с клавиатуры
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
            replaceColumn(matrix);
        }
    }

    public static int[][] generateMatrix(int[][] matrix) {
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                matrix[a][b] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    private static void replaceColumn(int matrix[][]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a first number of column for replacement = ");
        int X = in.nextInt();
        System.out.println("Input a second number of column for replacement = ");
        int Y = in.nextInt();
        if (X < 0 || Y < 0) {
            System.out.println("Input a positive numbers!!");
        } else {
            int temp = 0;
            if (X - 1 > matrix.length || Y > matrix.length) {
                System.out.println("Input a numbers more 0 and less " + (matrix.length) + " !!");
            } else {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = X; j < matrix[i].length; ) {
                        temp = matrix[i][X - 1];
                        matrix[i][X - 1] = matrix[i][Y - 1];
                        matrix[i][Y - 1] = temp;
                        break;
                    }
                }
                System.out.println("Final matrix is: \n" + Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            }
        }
    }
}