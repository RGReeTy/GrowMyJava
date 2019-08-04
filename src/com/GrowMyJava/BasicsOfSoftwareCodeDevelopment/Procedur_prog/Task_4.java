package com.GrowMyJava.BasicsOfSoftwareCodeDevelopment.Procedur_prog;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.
public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number XXX.XXX = ");
        double R = sc.nextDouble();
        if (R <= 99.999 | R >= 1000.000) {
            System.out.println("Invalid number");
        } else {
            int part = (int)R;
            BigDecimal bd = new BigDecimal(( R - Math.floor( R )) * 1000 );
            bd = bd.setScale(3, RoundingMode.HALF_DOWN);
            System.out.print( bd.intValue()+","+part+"\n");
//i know what that is not an answer, but it works
            double sum = ((double) part / 1000)+bd.intValue();
            System.out.println(sum);
            sc.close();
        }
    }
}
