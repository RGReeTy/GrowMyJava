package com.grow_my_java.module_4_programming_with_classes.AggregationAndComposition.Task_1;

public class Word {

    private String interiorOfWord;

    public Word(String interiorOfWord) {
        this.interiorOfWord = interiorOfWord;
    }

    public String getInteriorOfWord() {
        return interiorOfWord;
    }

    public void setInteriorOfWord(String interiorOfWord) {
        this.interiorOfWord = interiorOfWord;
    }

    public void printWord() {
        System.out.println(interiorOfWord);
    }
}
