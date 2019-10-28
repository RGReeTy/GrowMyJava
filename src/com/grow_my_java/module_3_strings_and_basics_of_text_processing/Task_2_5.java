package com.grow_my_java.module_3_strings_and_basics_of_text_processing;

public class Task_2_5 {
    //5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
    public static void main(String[] args) {
        String testLine = "You will meet with our head of sales and the interview will last for about 45 minutes.";
        System.out.println("The symbol 'a' meeting " + getNumberOfRepetitions(testLine) + " times.");
    }

    private static int getNumberOfRepetitions(String testLine) {
        char[] symbols = testLine.toCharArray();
        int count = 0;
        for (int i = 0; i < symbols.length; ++i) {
            if (symbols[i] == 'a')
                ++count;
        }
        return count;
    }
}