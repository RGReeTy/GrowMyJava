package com.GrowMyJava.Module_3_Strings_and_basics_of_text_processing;

public class Task_2_1 {
    //1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
    public static void main(String[] args) {
        String testLine = "You will  meet   with our     head of sales        and the interview will last for about 45 minutes.";
        System.out.println("The number of maximal spaces is: " + deleteSpaces(testLine));
    }

    private static int deleteSpaces(String testString) {
        if (testString.length() == 0) {
            System.out.println("The given string is empty!");
            return 0;
        } else {
            int counter = 0;
            String[] strings = testString.split("\\S");
            for (String string : strings) {
                if (string.length() > counter) {
                    counter = string.length();
                }
            }
            return counter;
        }
    }
}

