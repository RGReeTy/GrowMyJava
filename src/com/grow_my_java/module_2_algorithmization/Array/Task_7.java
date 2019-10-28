package com.grow_my_java.module_2_algorithmization.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task_7 {
    //Даны действительные числа a1, a2, ..., a(n). Найти max(a1 + a(2n), a2 + a(2n-1), ..., a(n) + a(n+1)).
    //From forum: Вопрос: Здравствуйте. в блоке одномерные массивы задание 7. дан массив n элементов. как искать а1 + a2n и т.д?
    //Ответ: В задании опечатка, от a_1 до a_2n.
    //Не понятно все равно: увеличить в два раза размерность массива? или получать новые элементы, умножая на n? Просто поиск уже был..
    //Буду решать такую задачу: Найти max(a1 + a(n), a2 + a(n-1), ..., .
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an array dimension = ");
        int N = sc.nextInt();
        double[] arrayA = new double[N];
        createArray(arrayA, N);//create an array with number of elements N
        System.out.println("Array has " + N + " elements : " + Arrays.toString(arrayA));
        findMax(arrayA);
    }

    public static double[] createArray(double[] arrayA, int N) {
        for (int i = 0; i < N; i++) {
            arrayA[i] = (double) (Math.round(Math.random() * N * 100)) / 100; //random sequence formula
        }
        return arrayA;
    }

    private static void findMax(double[] array) {

        int first = 0;
        int last = array.length - 1;
        double Sum = array[first] + array[last];

        while (array[first++] < array[last--]) {
            double temp = array[first] + array[last];
            if (temp > Sum) {
                Sum = temp;
            }
        }
        System.out.println("Answer is: " + Sum);
    }
}