package com.GrowMyJava.Module_4_Programming_with_classes.AggregationAndComposition.Task_1;

public class Task_1_Main {
    //1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
    //консоль текст, заголовок текста.

    public static void main(String[] args) {
        Word word1 = new Word("Hello");
        Word word2 = new Word("World!");

        Sentence header = new Sentence();

        header.addWord(word1);
        header.addWord(word2);

        Text text = new Text(header);

        Word word3 = new Word("I");
        Word word4 = new Word("want");
        Word word5 = new Word("to");
        Word word6 = new Word("be");
        Word word7 = new Word("a");
        Word word8 = new Word("programmer!");

        Sentence sentence2 = new Sentence();

        sentence2.addWord(word3);
        sentence2.addWord(word4);
        sentence2.addWord(word5);
        sentence2.addWord(word6);
        sentence2.addWord(word7);
        sentence2.addWord(word8);

        text.addSentence(sentence2);

        text.printText();
        System.out.println("\n-------------------------------------------------");
        sentence2.removeWord(word6);

        text.printText();
        System.out.println("\n-------------------------------------------------");
        text.removeSentence(sentence2);

        text.printText();
        System.out.println("\n-------------------------------------------------");
        text.getHeader().printSentence();
    }
}
