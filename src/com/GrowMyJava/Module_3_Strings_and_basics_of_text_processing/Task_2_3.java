package com.GrowMyJava.Module_3_Strings_and_basics_of_text_processing;

public class Task_2_3 {
    //3. Проверить, является ли заданное слово палиндромом.
    public static void main(String[] args) {
        StringBuilder testLine1 = new StringBuilder();
        StringBuilder testLine2 = new StringBuilder();
        StringBuilder testLine3 = new StringBuilder();
        testLine1.append("полиндром");
        testLine2.append("потоп");
        testLine3.append("А роза упала на лапу Азора");
        System.out.println(testLine1.toString().contentEquals((testLine1.reverse())));
        System.out.println(testLine2.toString().contentEquals((testLine2.reverse())));
        System.out.println(testLine3.toString().contentEquals((testLine3.reverse())));
        String testLine3Modify = testLine3.toString().replaceAll("\\s", "");
        System.out.println(testLine3.reverse().toString().replaceAll("\\s", "").equals(testLine3Modify));

    }
}