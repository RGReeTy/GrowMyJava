package com.grow_my_java.module_1_basics_of_software_code_development.Procedur_prog;

import java.util.Scanner;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number = ");
        long T = sc.nextLong();
        if (T != 0) {
            long hour = T / (60 * 60);
            long min = (T - hour * 60 * 60) / 60;
            long sec = T - hour * 60 * 60 - min * 60;
            System.out.print("Time is: " + hour + " ч " + min + " мин " + sec + " сек ");
        } else {
            System.out.println("Time equals zero");
        }
        sc.close();
    }
}