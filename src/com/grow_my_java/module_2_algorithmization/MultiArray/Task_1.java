package com.grow_my_java.module_2_algorithmization.MultiArray;

public class Task_1 {
    //Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
    public static void main(String[] args) {
        int arr[][] = {
                {5, 5, 6, 1, 4},
                {2, 3, 9, 8, 7},
                {4, 5, 6, 8, 1},
                {7, 8, 9, 0, 5},
                {8, 7, 5, 6, 3},
                {8, 7, 5, 6, 3},
                {4, 5, 6, 8, 1}
        };
        for (int i = 0; i <arr.length ; i++) {
            for (int k = 0; k <arr[i].length ;k+=2 ) {
                if (arr[0][k] > arr[arr.length - 1][k]) {
                    System.out.print("| " + arr[i][k] + " ");
                }
            }
            System.out.println("|");
        }

    }
}
