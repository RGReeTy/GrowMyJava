package com.grow_my_java.differrent_test.acmp.Task_2;

//Требуется посчитать сумму целых чисел, расположенных между числами 1 и N включительно.

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        try {
            pw.println(getSumOfIntToN(in.nextInt()));
        } finally {
            pw.close();
        }
    }

    public static long getSumOfIntToN(int val) {

        long result = 0;

        if (val > 0) {
            for (int i = 1; i <= val; i++) {
                result += i;
            }
        } else {
            for (int i = 1; i >= val; i--) {
                result += i;
            }
        }
        return result;
    }
}