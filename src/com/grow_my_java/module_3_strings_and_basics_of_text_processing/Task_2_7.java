package com.grow_my_java.module_3_strings_and_basics_of_text_processing;

public class Task_2_7 {
    //7.Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
    //def", то должно быть выведено "abcdef".
    public static void main(String[] args) {
        String testLine1 = "You will meet with our head of sales and the interview will last for about 45 minutes.";
        String testLine2 = "abc cde def";
        System.out.println(removeDuplicateCharactersFromWord(testLine1));
        System.out.println(removeDuplicateCharactersFromWord(testLine2));
    }

    private static String removeDuplicateCharactersFromWord(String text) {
        String result = new String("");
        for (int i = 0; i < text.length(); i++) {
            if (!result.contains("" + text.charAt(i))) {
                result += "" + text.charAt(i);
            }
        }
        return deleteSpaces(result);
    }

    private static String deleteSpaces(String text) {
        return text.replaceAll("\\s", "");
    }
}