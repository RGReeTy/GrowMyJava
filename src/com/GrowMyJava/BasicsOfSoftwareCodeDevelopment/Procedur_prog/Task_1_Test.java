package com.GrowMyJava.BasicsOfSoftwareCodeDevelopment.Procedur_prog;

import java.util.Scanner;
//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
public class Task_1_Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number a= ");
        int a = sc.nextInt();
        System.out.println("Input a number b= ");
        int b = sc.nextInt();
        System.out.println("Input a number c= ");
        int c = sc.nextInt();
        System.out.println("Result: " + funct(a, b, c));
    }
    public static int funct(int a, int b, int c) {
        int z = (int)Math.pow((a-3), (b/2))+c;
        return z;
    }
}
