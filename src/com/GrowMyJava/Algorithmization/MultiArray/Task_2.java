package com.GrowMyJava.Algorithmization.MultiArray;

public class Task_2 {
    //Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
    public static void main(String[] args) {
        int arr[][] = {
                {5, 5, 6, 1, 4},
                {2, 3, 9, 8, 7},
                {4, 5, 6, 8, 1},
                {7, 8, 9, 0, 5},
                {8, 7, 5, 6, 3}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                if (i == k) System.out.print(arr[i][k]);
            }
        }
    }
}
