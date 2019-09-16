package com.GrowMyJava.Module_2_Algorithmization.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {
    //Даны целые числа а 1 ,а 2 ,..., а n . Вывести на печать только те числа, для которых а i > i.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an array dimension = ");
        int N = sc.nextInt();
        if (N < 0) {
            System.out.println("Input a dimension > 0!!");
        } else {
            int[] arrayA = new int[N];
            createArray(arrayA, N);//create an array with number of elements N
            System.out.println("Array has " + N + " elements : " + Arrays.toString(arrayA));
            compareElemAndIndex(arrayA);
        }
    }

    public static int[] createArray(int[] arrayA, int N) {
        for (int i = 0; i < N; i++) {
            arrayA[i] = (int) (Math.random() * 100);
        }
        return arrayA;
    }

    private static void compareElemAndIndex(int arrayA[]) {
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] > i)
                System.out.println("Element " + arrayA[i] + " has value more than his index ( " + i + " ).");
        }
    }
}