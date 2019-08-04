package com.GrowMyJava.BasicsOfSoftwareCodeDevelopment.Procedur_prog;

import java.util.Scanner;

public class Task_6 {
    //Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    //принадлежит закрашенной области, и false — в противном случае:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a X coordinate = ");
        byte X = sc.nextByte();
        System.out.println("Input a Y coordinate = ");
        byte Y = sc.nextByte();
        //There are 4 quarters x+y+ x-y+ x-y- x+y-
        if (X <= 4 & X >= -4 & Y <= 4 & Y >= -3) {
            if (X <= 2 & X >= -2) {
                System.out.println("true");
            } else System.out.println("true");
        } else System.out.println("false");
    }
}
