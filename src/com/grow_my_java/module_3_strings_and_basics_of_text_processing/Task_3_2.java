package com.grow_my_java.module_3_strings_and_basics_of_text_processing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3_2 {
    /*
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип
(открывающий тег, закрывающий тег, содержимое тега, тег без тела).
Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */
    public static class RE {
        private String text = "<notes>\n" +
                "<note id = \"1\">\n" +
                "<to>Вася</to>\n" +
                "<from>Света</from>\n" +
                "<heading>Напоминание</heading>\n" +
                "<body>Позвони мне завтра!</body>\n" +
                "</note>\n" +
                "<note id = \"2\">\n" +
                "<to>Петя</to>\n" +
                "<from>Маша</from>\n" +
                "<heading>Важное напоминание</heading>\n" +
                "<body/>\n" +
                "</note>\n" +
                "</notes>";

        public static void main(String[] args) {
            RE textClass = new RE();
            String[] splitText = textClass.text.split("\\n");
            StringBuilder sb = new StringBuilder();
            Pattern openingTag = Pattern.compile("<[\\w=\"\"\\s]+>");
            Pattern closeTag = Pattern.compile("<(/+[\\w]+?)>");
            Pattern tagWithoutBody = Pattern.compile("<([\\w]+/)>");
            Pattern tagContent = Pattern.compile("[а-яА-яЁё\\s]+[!.?,]?");
            for (String s : splitText) {
                Matcher openingTagMatcher = openingTag.matcher(s);
                if (openingTagMatcher.find()) {
                    sb.append("Открывающий тег --> ");
                    sb.append(openingTagMatcher.group());
                }
                Matcher tagWithoutBodyMatcher = tagWithoutBody.matcher(s);
                if (tagWithoutBodyMatcher.find()) {
                    sb.append(tagWithoutBodyMatcher.group());
                    sb.append(" <-- Тег без тела");
                }
                Matcher tagContentMatcher = tagContent.matcher(s);
                if (tagContentMatcher.find()
                        && !tagContentMatcher.group().equals(" ")) {
                    sb.append("  Содержимое тега:  ");
                    sb.append(tagContentMatcher.group());
                    sb.append("  ");

                }
                Matcher closeTagMatcher = closeTag.matcher(s);
                if (closeTagMatcher.find()) {
                    sb.append(closeTagMatcher.group());
                    sb.append(" <-- Закрывающий тег");
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }
    }
}
