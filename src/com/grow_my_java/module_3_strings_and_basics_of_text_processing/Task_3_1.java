package com.grow_my_java.module_3_strings_and_basics_of_text_processing;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task_3_1 {
    //1. Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
    //операции: отсортировать абзацы по количеству предложений;
    //в каждом предложении отсортировать слова по длине;
    //отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
    //алфавиту.
    public static void main(String[] args) {
        String text = "My job is a long distance from my home, almost 50.00 miles away. I have to wake up early every " +
                "morning, as I’m always in a rush. There’s never enough time for a relaxed breakfast.\n At exactly " +
                "6:00 AM, I get into my car and start the long drive.I usually like driving on the highway more than in" +
                " the city. During the morning rush hour, though, it’s not very enjoyable. The heavy traffic is a little " +
                "bit annoying.\n So I always listen to my favorite classical music CD’s in the car – Chopin, Mozart, and" +
                " Bach. That cheers me up a lot. The drive to work takes about one hour. Going back home in the evening " +
                "after work takes even longer, maybe around 70 minutes. Lately I’ve been thinking about trying to take " +
                "the train to work instead of driving. That way, I could still listen to my music with headphones, and " +
                "even read a novel at the same time.";
        System.out.println("Yours text next: " + text);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose what you want to do with the text: " +
                "\n1.Sort paragraphs by number of sentences;" +
                "\n2.In each sentence the words are sorted by length." +
                "\n3.Sorted tokens in a descending sentence");
        int answer = sc.nextInt();
        if (answer < 1 || answer > 3) {
            System.out.println("Choose yours answer between numbers 1, 2, 3!");
        } else {
            switch (answer) {
                case (1):
                    sortParagraphsBySentenceNumber(text);
                    break;
                case (2):
                    sortSentencesByLengthOfWords(text);
                    break;
                case (3):
                    System.out.println("Please enter the symbol for the counting and sorting: ");
                    Scanner scan = new Scanner(System.in);
                    String scanSymbol = scan.nextLine();
                    sortTokensInSentences(text, scanSymbol);
                    break;
            }
        }
    }

    private static void sortParagraphsBySentenceNumber(String text) {
        String paragraphRegexp = "(?=^\\s)";
        String sentencesSplit = "\\s+[^\".!?]*[.!?]";
        String[] paragraphs = Pattern.compile(paragraphRegexp, Pattern.MULTILINE).split(text);
        sort(paragraphs, sentencesSplit);
        printParagraphs(paragraphs);
    }

    private static void sort(String[] arr, String sentencesSplit) {
        int in, out;
        String temp;
        int h = 1;
        int lengthOfCurrentSentence;
        while (h <= arr.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (out = h; out < arr.length; out++) {
                temp = arr[out];
                lengthOfCurrentSentence = Pattern.compile(sentencesSplit).split(arr[out]).length;
                in = out;
                while (in > h - 1 && Pattern.compile(sentencesSplit).split(arr[in - h]).length >= lengthOfCurrentSentence) {
                    arr[in] = arr[in - h];
                    in -= h;
                }
                arr[in] = temp;
            }
            h = (h - 1) / 3;
        }
    }

    private static void printParagraphs(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String p : strings) {
            sb.append(p.trim()).append("\n");
        }
        System.out.println(sb);
    }

    private static void sortSentencesByLengthOfWords(String text) {
        if (text.isEmpty()) {
            System.out.println("The String is empty!");
        } else {
            String sentencesRegexp = "(?<=[a-z\\d][?.!]\\s)";
            String wordsRegexp = "[\\W]+";
            String[] sentences = Pattern.compile(sentencesRegexp, Pattern.MULTILINE).split(text);
            for (int i = 0; i < sentences.length; i++) {
                String[] words = Pattern.compile(wordsRegexp).split(sentences[i]);
                int j = 0;
                while (j < words.length - 1) {
                    int max = words[j].length();
                    int currentLength = words[j + 1].length();
                    j = sortArr(words, j, max, currentLength);
                }
                sentences[i] = printWords(words);
            }
            printWords(sentences);
            System.out.println(Arrays.toString(sentences));
        }
    }

    private static String printWords(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s).append(" ");
        }
        sb.append("\n");
        return sb.toString();
    }

    public static void sortTokensInSentences(String testString, String c) {
        if (testString.isEmpty()) {
            System.out.println("The String is empty!");
            return;
        }
        String wordRegexp = "[\\W]+";
        String[] words = Pattern.compile(wordRegexp).split(testString);
        String[] result = sortByAlphabet(words);
        char symbol = c.charAt(0);
        int i = 0;
        while (i < result.length - 1) {
            int count = getNumberOfChars(result[i], symbol);
            int countNext = getNumberOfChars(result[i + 1], symbol);
            i = sortArr(result, i, count, countNext);
        }
        printWords(words);
        System.out.println(Arrays.toString(result));
    }

    private static int sortArr(String[] arr, int i, int max, int current) {
        if (current >= max) {
            i++;
        } else {
            String temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            if (i > 1) {
                i--;
            } else {
                i = 0;
            }
        }
        return i;
    }

    private static int getNumberOfChars(String s, char symbol) {
        int counter = 0;
        for (char c : s.toCharArray()) {
            if (Character.toLowerCase(c) == Character.toLowerCase(symbol)) {
                counter++;
            }
        }
        return counter;
    }

    private static String[] sortByAlphabet(String[] strings) {
        for (int i = 1; i < strings.length; i++) {
            String temp = strings[i];
            int j = i;
            while (j > 0 && strings[j - 1].compareToIgnoreCase(temp) >= 0) {
                strings[j] = strings[j - 1];
                --j;
            }
            strings[j] = temp;
        }
        return strings;
    }
}
