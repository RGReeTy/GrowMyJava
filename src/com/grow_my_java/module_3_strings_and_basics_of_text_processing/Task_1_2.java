package com.grow_my_java.module_3_strings_and_basics_of_text_processing;

public class Task_1_2 {
    //2. Замените в строке все вхождения 'word' на 'letter'.
    public static void main(String[] args) {
        String testLine = "I want't to write any word. This is strong Word. Word word wORD WORD words.";
        System.out.println(testLine.replaceAll("[Ww][oO][rR][dD]", "Letter"));
    }
}

