package com.grow_my_java.differrent_tests.other;

import java.util.Scanner;

public class GetEvenNumberFollowingOfScan {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println(getNumber(number));

    }

    private static int getNumber(int number) {
        if (number == 0) return 2;
        if (number % 2 == 0) {
            return number + 2;
        } else {
            return number + 1;
        }
    }
}
