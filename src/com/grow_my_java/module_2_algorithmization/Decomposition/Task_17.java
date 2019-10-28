package com.grow_my_java.module_2_algorithmization.Decomposition;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_17 {
    //17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
    //действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number N..");
        int N = Integer.parseInt(read.readLine());
        if (N < 1) {
            System.out.println("Input a positive numbers > 0!!");
        } else {
            System.out.println("We need " + countOfOperation(N) + " times to repeat this operations for this number " + N);
        }
    }

    private static int countOfOperation(int number) {
        int count = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            tempNumber -= sumOfDigits(tempNumber);
            count++;
        }
        return count;
    }

    private static int sumOfDigits(int tempNumber) {
        int sum = 0;
        while (tempNumber > 0) {
            int digits = tempNumber % 10;
            tempNumber /= 10;
            sum += digits;
        }
        //System.out.println(sum); /for control
        return sum;
    }
}