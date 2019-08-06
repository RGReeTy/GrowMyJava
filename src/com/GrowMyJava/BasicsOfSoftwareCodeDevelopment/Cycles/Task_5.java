package com.GrowMyJava.BasicsOfSoftwareCodeDevelopment.Cycles;

import java.math.BigInteger;

public class Task_5 {
    //Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    //заданному е. Общий член ряда имеет вид...
    //from forum: Задача 5 (циклы), значение n определяется пользователем. Ряд имеет конечное число членов, от 1 до n.
    public static void main(String[] args) {

        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        System.out.println("The multiplication of 1 to 200 is:"+res);
    }
}