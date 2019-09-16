package com.GrowMyJava.Module_1_BasicsOfSoftwareCodeDevelopment.Branching;

import java.util.Scanner;

public class Task_2 {
    //Найти max{min(a, b), min(c, d)}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number = ");
        int a = sc.nextInt();
        System.out.println("Input a number = ");
        int b = sc.nextInt();
        System.out.println("Input a number = ");
        int c = sc.nextInt();
        System.out.println("Input a number = ");
        int d = sc.nextInt();
        if (a == b || c == d) {
            System.out.println("Yours numbers are equals");
        } else {
            int min1 = a > b ? b : a;
            int min2 = c > d ? d : c;
            if (min1 == min2) {
                System.out.println("Yours numbers are equals");
            } else {
                int max = min1 > min2 ? min1 : min2;
                System.out.println("Maximum of minimum numbers is: " + max);
            }
        }
    }
}