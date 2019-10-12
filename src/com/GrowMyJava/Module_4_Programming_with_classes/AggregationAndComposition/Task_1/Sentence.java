package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_1;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private List<Word> words;

    public Sentence() {
        this.words = new ArrayList<>();
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public boolean addWord(Word word) {
        return words.add(word);
    }

    public boolean removeWord(Word word) {
        return words.remove(word);
    }

    public void printSentence() {
        for (Word word : words) {
            System.out.print(word + " ");
        }
    }
}
