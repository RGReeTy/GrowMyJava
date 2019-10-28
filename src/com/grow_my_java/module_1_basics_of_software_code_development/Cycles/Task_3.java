package com.grow_my_java.module_1_basics_of_software_code_development.Cycles;

public class Task_3 {
    //Найти сумму квадратов первых ста чисел.
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += (int) Math.pow(i, 2);
            //System.out.println(sum);
        }
        System.out.println("Summary pow of 100 first numbers is:" + sum);
    }
}