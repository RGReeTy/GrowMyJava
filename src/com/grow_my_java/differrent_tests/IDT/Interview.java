package com.grow_my_java.differrent_tests.IDT;

//17.01.2020 14:00

public class Interview {

    public static void main(String[] args) {

        //version 1 (starting from 1, columns at one line)
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------");

        //version 2 (starting from 2, columns at two lines)
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}
