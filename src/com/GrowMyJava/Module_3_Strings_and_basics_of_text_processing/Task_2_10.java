package com.GrowMyJava.Module_3_Strings_and_basics_of_text_processing;

import java.util.Arrays;

public class Task_2_10 {
    //10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
    //знаком. Определить количество предложений в строке X.
    public static void main(String[] args) {
        String textX = "It was a new experience for me, because I have never tried something similar to this system." +
                "I think it is very useful for English language learners!" +
                "Does the system works very fast?" +
                "I like that I can edit my writings as many times as I want and they are being corrected in some seconds.";
        String[] sentence = textX.split("[.!?]+");
        System.out.println(Arrays.toString(sentence));
        System.out.println("The text has " + sentence.length + " sentences.");
    }
}