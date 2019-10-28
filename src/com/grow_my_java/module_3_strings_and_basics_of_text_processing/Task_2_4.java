package com.grow_my_java.module_3_strings_and_basics_of_text_processing;

import java.util.Arrays;

public class Task_2_4 {
    //4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
    public static void main(String[] args) {
        String testLine1 = "информатика";
        char[] chars = new char[testLine1.length()];
        testLine1.getChars(0, testLine1.length(), chars, 0);
        System.out.println(Arrays.toString(chars));
        System.out.println("Answer is: " + chars[7] + chars[3] + chars[4] + chars[7]);
    }
}