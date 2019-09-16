package com.GrowMyJava.Module_1_BasicsOfSoftwareCodeDevelopment.Branching;

import java.util.Scanner;

public class Task_4 {
    //Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
    //отверстие.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a length of a hole = ");
        int A = sc.nextInt();
        System.out.println("Input a width of a hole = ");
        int B = sc.nextInt();
        if (A <= 0 | B <= 0) {
            System.out.println("Parameters of the hole must be positive!");
        } else {
            System.out.println("Yours hole has a parameters: " + A + "x" + B);
            System.out.println("Input a length of the brick = ");
            int x = sc.nextInt();
            System.out.println("Input a width of the brick = ");
            int y = sc.nextInt();
            System.out.println("Input a height of the brick = ");
            int z = sc.nextInt();
            if (x <= 0 | y <= 0 | z <= 0) {
                System.out.println("Parameters of the brick must be positive!");
            } else {
                System.out.println("Yours brick has a parameters: " + x + "x" + y + "x" + z);
                if (A < x || A < y || A < z) {
                    System.out.println("Brick is bigger then hole");
                } else if ((B < x || B < y || B < z)) {
                    System.out.println("Brick is bigger then hole");
                } else {
                    System.out.println("GETOVERHERE!");
                }
            }
        }
    }
}