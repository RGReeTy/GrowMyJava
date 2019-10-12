package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_1;

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

    @Override
    public String toString() {
        return interiorOfWord;
    }
}
