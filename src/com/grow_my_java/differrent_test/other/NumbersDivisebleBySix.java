package com.grow_my_java.differrent_test.other;

import java.util.Scanner;
import java.util.stream.IntStream;

//Given the sequence of natural numbers. Find the sum of numbers divisible by 6. The input is the number of elements in
// the sequence, and then the elements themselves. In this sequence, there is always a number divisible by 6.
//        Sample Input 1:
//        8
//        11
//        12
//        68
//        6
//        98
//        81
//        36
//        86
//        Sample Output 1:
//        54

public class NumbersDivisebleBySix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int answer = IntStream.of(array).filter(x -> x % 6 == 0).sum();

        System.out.println(answer);

    }
}
