package com.GrowMyJava.Module_3_Strings_and_basics_of_text_processing;

public class Task_2_6 {
    //6. Из заданной строки получить новую, повторив каждый символ дважды.
    public static void main(String[] args) {
        String testLine = "You will meet with our head of sales and the interview will last for about 45 minutes.";
        System.out.println("The result of task: " + testLine.replaceAll(".", "$0$0"));
    }
}