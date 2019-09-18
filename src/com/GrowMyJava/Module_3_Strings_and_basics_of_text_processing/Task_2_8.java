package com.GrowMyJava.Module_3_Strings_and_basics_of_text_processing;

public class Task_2_8 {
    //8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
    //длинных слов может быть несколько, не обрабатывать.
    public static void main(String[] args) {
        String testLine1 = "You will meet with our head of sales and the interview will last for about 45 minutes.";
        String testLine2 = "sleep work repeat industrialization independence private";
        System.out.println("The most longest word at line is: " + getLongerWord(testLine1));
        System.out.println("The most longest word at line is: " + getLongerWord(testLine2));
    }

    private static String getLongerWord(String text) {
        if (text.length() == 0) {
            System.out.println("The given string is empty!");
            return "";
        } else {
            String[] words = text.split(" ");
            String longerWord = "";
            int maxLength = 0;
            for (String word : words) {
                if (word.length() > maxLength) {
                    maxLength = word.length();
                    longerWord = word;
                }
            }
            return longerWord;
        }
    }
}