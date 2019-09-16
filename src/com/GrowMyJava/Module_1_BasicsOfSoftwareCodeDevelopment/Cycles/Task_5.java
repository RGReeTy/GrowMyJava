package com.GrowMyJava.Module_1_BasicsOfSoftwareCodeDevelopment.Cycles;


import java.util.Scanner;

public class Task_5 {
    //Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    //заданному е. Общий член ряда имеет вид...
    //from forum: Задача 5 (циклы), значение n определяется пользователем. Ряд имеет конечное число членов, от 1 до n.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a member of the series = ");
        int n = sc.nextInt();
        if (n <= 0) System.out.println("Write a positive number!");
        System.out.println("Input a number " + "e = ");
        double e = sc.nextDouble();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double a = ((1 / (Math.pow(2, i))) + ((1 / (Math.pow(3, i)))));
            double modul = Math.abs(a);
            if (modul >= e) sum+=a;     // по условию надо найти сумму членов ряда, а не сумму модулей ряда!
            //System.out.println(sum);
        }
        System.out.println(sum);
    }
}