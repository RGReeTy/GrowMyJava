package com.grow_my_java.module_3_strings_and_basics_of_text_processing;

public class Task_2_2 {
    //2. В строке вставить после каждого символа 'a' символ 'b'.
    public static void main(String[] args) {
        String testLine = "You will meet with our head of sales and the interview will last for about 45 minutes.";
        System.out.println(testLine.replaceAll("a", "ab"));
    }
}