package com.grow_my_java.differrent_tests.other;

public class StringEqualsSout {
    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");

        System.out.println(str1 == str2 && str1 == str3);
    }
}
