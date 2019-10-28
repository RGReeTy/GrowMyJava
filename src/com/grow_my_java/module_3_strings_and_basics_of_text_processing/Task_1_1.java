package com.grow_my_java.module_3_strings_and_basics_of_text_processing;

public class Task_1_1 {
    //1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
    public static void main(String[] args) {
        String[] tests = {
                "lowercase",
                "Class",
                "MyClass",
                "HTML",
                "PDFLoader",
                "SNakeCaSE",
                "JoinLikeJavaJunior",
                "NvidiaTitanX",
                "99Bottles",
                "May4BeWithYou",
                "BFG9000",
        };
        for (String test : tests) {
            System.out.println("[" + splitCamelCase(test) + "]");
        }
    }

    private static String splitCamelCase(String s) {
        return s.replaceAll(
                String.format("%s|%s|%s",
                        "(?<=[A-Z])(?=[A-Z][a-z])",     //разделяет слова с прописной буквы и прписной+строчная
                        "(?<=[^A-Z])(?=[A-Z])",         //разделяет строчные и прописные буквы
                        "(?<=[A-Za-z])(?=[^A-Za-z])"    //разделяет буквы и числа
                ),
                "_"
        );
    }
}

