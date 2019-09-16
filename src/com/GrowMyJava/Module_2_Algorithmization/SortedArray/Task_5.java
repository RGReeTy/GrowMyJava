package com.GrowMyJava.Module_2_Algorithmization.SortedArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_5 {
// 5. Сортировка вставками. Дана последовательность чисел a1, a2, ..., ai. Требуется переставить числа в порядке
// возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность, т. е.
// a1 <= a2 <= ... <= an. Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
// последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
// не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью
// двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
    //from forum:
    // Вопрос: Добрый вечер! Модуль 2, сортировки, задача 5 - сортировка вставками. Не совсем понятно условие.
    // Нам изначально даны числа в порядке возрастания? Или до i-го элемента возрастает, а далее в случайном порядке?
    // И двоичный поиск элемента, он ведь будет работать только в отсортированной последовательности, а наша последовательность
    // не отсортирована!
    //Ответ: читайте внимательно задачу. дана последовательность с n элементами. она не упорядочена. А вот ее подпоследовательность
    // до i-го элемента - упорядочена (в неупорядоченной последовательности есть ряж элементов, которые упорядочены).
    // Вставить оставшиеся элементы, чтобы не нарушить порядок - дело техники.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a dimension of array 'N' = ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Input a positive dimension > 0!!");
        } else {
            int[] array = generateMatrix(N);
            System.out.println("Array has " + N + " columns: \n" + Arrays.toString(array));
            System.out.println("Sorted array is: \n" + Arrays.toString(sortInsertion(array)));
        }
    }

    private static int[] sortInsertion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int insertPosition = binarySearch(array, 0, i - 1, key);
            for (int j = i; j > insertPosition; j--) {
                array[j] = array[j - 1];
            }
            array[insertPosition] = key;
        }
        return array;
    }

    private static int binarySearch(int[] array, int left, int right, int key) {
        int medium;
        while (left <= right) {
            medium = right + left / 2;
            if (key > array[medium]) {
                left = medium + 1;
            } else if (key < array[medium]) {
                right = medium - 1;
            } else {
                return medium;
            }
        }
        return left;
    }

    public static int[] generateMatrix(int dimension) {
        Random rand = new Random();
        int coefficient = rand.nextInt(1000) + 50;
        int[] array = new int[dimension];
        for (int a = 0; a < array.length; a++) {
            array[a] = coefficient * (a + 1);
        }
        return array;
    }
}
