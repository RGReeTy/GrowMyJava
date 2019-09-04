package com.GrowMyJava.Algorithmization.Decomposition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {
    //Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
    //натуральных чисел: НОК(А, В)= (А*В)/НОД(А, В)
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter first number: ");
            int A = Integer.parseInt(read.readLine());
            System.out.println("Enter second number: ");
            int B = Integer.parseInt(read.readLine());
            findMaxCommonNOD(A, B);
            findMinCommonNOK(A, B);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void findMaxCommonNOD(int A, int B) {
        int NOD = 0;
        int lessNumber = A > B ? B : A;
        int biggerNumber = A > B ? A : B;
        if (biggerNumber % lessNumber != 0) {
            System.out.println("These numbers don't have the greatest common factor!");
        } else {
            for (int i = 1; i <= lessNumber; i++) {
                if (lessNumber % i == 0 & biggerNumber % i == 0) NOD = i;
            }
        }
        if (NOD != 0) System.out.println("These numbers have the greatest common factor = " + NOD);
    }

    private static void findMinCommonNOK(int A, int B) {
        int NOK = A * B;
        int lessNumber = A > B ? B : A;
        int biggerNumber = A > B ? A : B;
        for (int i = NOK; i > lessNumber; i--) {
            if (i % A == 0 & i % B == 0) NOK = i;
        }
        System.out.println("For these numbers I catch the least common multiple = " + NOK);
    }
}
