package com.GrowMyJava.BasicsOfSoftwareCodeDevelopment.Branching;

import java.util.Scanner;

public class Task_1 {
    //Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    //он прямоугольным.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a first angle = ");
        int firstAngle = sc.nextInt();
        System.out.println("Input a second angle = ");
        int secondAngle = sc.nextInt();
        if (firstAngle >= 180 | secondAngle >= 180) {
            System.out.println("Yours angle is too big. Write angle 0<__<180");
        } else if ((firstAngle + secondAngle) >= 180) {
            System.out.println("This triangle can't to be exist");
        } else {
            int thirdAngle = 180 - firstAngle - secondAngle;
            System.out.println("The third angle is " + thirdAngle + " degrees");
            if (firstAngle==90 | secondAngle==90 |thirdAngle==90) System.out.println("Your triangle is rectangular");
        }
    }
}
