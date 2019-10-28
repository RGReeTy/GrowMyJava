package com.grow_my_java.module_1_basics_of_software_code_development.Cycles;

import java.math.BigInteger;

public class Task_4 {
    //Составить программу нахождения произведения квадратов первых двухсот чисел.
    public static void main(String[] args) {
        //try to find answer 1
//        BigInteger answer = BigInteger.ZERO;
//        for (int i = 1; i <= 200; i++) {
//            BigInteger bi = BigInteger.valueOf(i);
//            BigInteger mult = bi.multiply(bi.multiply(bi));
//            BigInteger result = mult.multiply(mult);
//            System.out.println(result);
//
//        }
        //try to find answer 2
//        for (BigInteger bi = BigInteger.valueOf(1); bi.compareTo(BigInteger.ZERO) < 201; bi = bi.add(BigInteger.ONE)) {
//            BigInteger mult = bi.multiply(bi);
//            BigInteger result = mult.multiply(mult);
//            System.out.println(result);
//        }
        // System.out.println("The multiplication of 1 to 200 is:"+ mult);
        //try to find answer 3 (200!)
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        System.out.println("The multiplication of 1 to 200 is:"+res);
    }
}