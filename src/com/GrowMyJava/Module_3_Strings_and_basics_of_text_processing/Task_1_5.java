package com.GrowMyJava.Module_3_Strings_and_basics_of_text_processing;

public class Task_1_5 {
    //5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
    //Крайние пробелы в строке удалить.
    public static void main(String[] args) {
        String testLine = "I want't to      write any word.     This is strong Word.    Word word wORD WORD words.     ";
        System.out.println(testLine.replaceAll("\\s+", " ").trim());
    }
}

