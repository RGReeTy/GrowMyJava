package com.grow_my_java.module_2_algorithmization.Decomposition;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_10 {
    //10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
    //являются цифры числа N.
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number N..");
        Integer userIn = Integer.valueOf(read.readLine());
        createArrayFromNumber(userIn);
    }

    private static void createArrayFromNumber(Integer userIn) {
        int number = userIn;
        int length = getCountsOfDigits(number);
        int[] array = new int[length];
        if (number < 0) number *= -1; //create positive number
        for (int i = array.length - 1; i >= 0; i--) {       //fill the array
            array[i] = number % 10;
            number = number / 10;
        }
        System.out.println(Arrays.toString(array));
    }

    private static int getCountsOfDigits(int n) {
        return n < 10 ? 1 :
                n < 100 ? 2 :
                        n < 1000 ? 3 :
                                n < 10000 ? 4 :
                                        n < 100000 ? 5 :
                                                n < 1000000 ? 6 :
                                                        n < 10000000 ? 7 :
                                                                n < 100000000 ? 8 :
                                                                        n < 1000000000 ? 9 : 10;
    }
}