package com.GrowMyJava.BasicsOfSoftwareCodeDevelopment.Branching;

import java.util.Scanner;

public class Task_3 {
    //Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
    public static void main(String[] args) {
        int x_1=0, x_2=0, x_3=0, y_1=0, y_2=0, y_3 = 0;
       /*   Scanner sc = new Scanner(System.in);
            System.out.println("Input a number = ");
            int x_123 = sc.nextInt();*/
        if ((x_3 - x_1) / (x_2 - x_1) == (y_3 - y_1) / (y_2 - y_1)) System.out.println("Points lie on one straight line.");
    }
}
