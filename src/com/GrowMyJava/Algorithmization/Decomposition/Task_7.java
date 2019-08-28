package com.GrowMyJava.Algorithmization.Decomposition;

public class Task_7 {
    //7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
    public static void main(String[] args) {
        int sum = sumOfFactorial();
        System.out.println("The sum of results of factorial from 1 to 9 odd numbers is " + sum);
    }

    private static int sumOfFactorial() {
        int result = 0;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                result += factorialOfOddNumbers(i);
            }
        }
        return result;
    }

    private static int factorialOfOddNumbers(int factorial) {
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }
        return result;
    }
}
