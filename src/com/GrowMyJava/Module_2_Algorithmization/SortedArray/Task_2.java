package com.GrowMyJava.Module_2_Algorithmization.SortedArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    //2. Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bn. Образовать из них новую
    //  последовательность чисел так, чтобы она тоже была неубывающией. Примечание. Дополнительный массив не использовать.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a dimension of arrays 'N' = ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Input a positive dimension > 0!!");
        } else {
            int[] arrayFirst = generateMatrix(N);
            int[] arraySecond = generateMatrix(N);
            System.out.println("First array has " + N + " columns: \n" + Arrays.toString(arrayFirst));
            System.out.println("Second array has " + N + " columns: \n" + Arrays.toString(arraySecond));
            System.out.println("Union array has " + (N + N) + " columns: \n" + Arrays.toString(unionArray(arrayFirst, arraySecond)));
        }
    }

    private static int[] unionArray(int[] arrayFirst, int[] arraySecond) {
        int[] unionArray = new int[arrayFirst.length + arraySecond.length];
        int firstIndex = 0, secondIndex = 0;
//        for (int i = 0; i < unionArray.length; i++) {
//            unionArray[i] = (arrayFirst[firstIndex] <= arraySecond[secondIndex] ? arrayFirst[firstIndex] : arraySecond[secondIndex]);
//            if (i < unionArray.length - 1) {
//                if (unionArray[i] == arrayFirst[firstIndex]) {
//                    if (firstIndex == arrayFirst.length - 1) {
//                        unionArray[i + 1] = arraySecond[secondIndex + 1];
//                    } else firstIndex++;
//                } else if (secondIndex == arraySecond.length - 1) {
//                    unionArray[i + 1] = arrayFirst[firstIndex + 1];//break;
//                } else secondIndex++;
//            }
//        }
        for (int i = 0; i < unionArray.length; i++) {
            if (arrayFirst[firstIndex] < arraySecond[secondIndex]) {
                if (firstIndex == arrayFirst.length - 1) {
                    unionArray[i++] = arrayFirst[firstIndex++];
                    break;
                } else unionArray[i] = arrayFirst[firstIndex++];
            } else if (secondIndex == arraySecond.length - 1) {
                unionArray[i++] = arraySecond[secondIndex++];
                break;
            } else unionArray[i] = arraySecond[secondIndex++];
        }
        /*
        for (int q = 0; q < unionArray.length; q++) {
            if (unionArray[q]==0){
                if (firstIndex < arrayFirst.length){
                    unionArray[q]=arraySecond[secondIndex-1];
                } else if (secondIndex < arraySecond.length){
                    unionArray[q]=arrayFirst[firstIndex-1];
                }
            }
        }*/
        return unionArray;


    }

    public static int[] generateMatrix(int dimension) {
        Random rand = new Random();
        int coefficient = rand.nextInt(10) + 1;
        int[] array = new int[dimension];
        for (int a = 0; a < array.length; a++) {
            array[a] = (a + 1) * coefficient;
        }
        return array;
    }
}