package com.GrowMyJava.BasicsOfSoftwareCodeDevelopment.Cycles;

public class Task_6 {
    //Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    public static void main(String[] args) {
        //В Java тип char хранит 16-разрядное значение без знака в диапазоне от 0 до 65536
        for (int i = 0; i < Character.MAX_VALUE; i++) {
            System.out.println(i + " = " + (char) i);
        }
    }
}

