package com.grow_my_java.differrent_tests;

public class ComparingStrings {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "Java";
        s2 = "Java";
        System.out.println("сравнение ссылок " + (s1 == s2));
        s1 += '2';
// s1-="a"; //ошибка, вычитать строки нельзя
        s2 = new String(s1);
        System.out.println("сравнение ссылок " + (s1 == s2));
        System.out.println("сравнение значений " + s1.equals(s2));
    }
}
