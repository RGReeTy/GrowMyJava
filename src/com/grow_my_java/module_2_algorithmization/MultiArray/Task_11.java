package com.grow_my_java.module_2_algorithmization.MultiArray;

import java.util.Arrays;
import java.util.Random;

public class Task_11 {
    //11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
    //которых число 5 встречается три и более раз.
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        generateMatrix(matrix);
        System.out.println("Matrix 10x20 is: \n" + Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        huntForMaximumFive(matrix);
    }

    private static int[][] generateMatrix(int[][] matrix) {
        Random rand = new Random();
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                matrix[a][b] = rand.nextInt(16);
            }
        }
        return matrix;
    }

    private static void huntForMaximumFive(int[][] matrix) {
        for (int i = 0; i < matrix.length; ) {
            int count5 = 0;
            int indexCol = 0;
            int maxCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count5++;
                    if (maxCount < count5) {
                        maxCount = count5;
                        indexCol = i + 1;
                    }
                }
            }
            if (maxCount >= 3)
                System.out.println("In row №" + indexCol + " number '5' meeting " + maxCount + " times!");
            i++;
        }
    }
}