package com.grow_my_java.module_1_basics_of_software_code_development.Procedur_prog;

import java.util.Scanner;
//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//𝑐 + √𝑐 2 + 4𝑏𝑑
//2𝑏
//− 𝑏 3 𝑑 + 𝑐 −2
public class Task_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number a= ");
        float a = sc.nextFloat();
        System.out.println("Input a number b= ");
        float b = sc.nextFloat();
        System.out.println("Input a number c= ");
        float c = sc.nextFloat();
        System.out.println("Result: " + funct(a, b, c));
    }

    public static float funct(float a, float b, float c) {
        float z = ((b + (float) Math.sqrt((b * b + 4 * a * c))) / (2 * a)) - ((float) Math.pow(a, 3) * c + (float) Math.pow(b, -2));
        return z;
    }
}
