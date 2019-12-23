package com.grow_my_java.differrent_tests.acmp.Task_550;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int year = in.nextInt();

        if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))) {
            out.printf("13/09/%04d", year);
        } else {
            out.printf("12/09/%04d", year);
        }

        out.close();
    }
}