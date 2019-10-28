package com.grow_my_java.module_5_basics_of_oop.Task_1.source;

public class Text {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String addContent(String s) {
        content += " " + s;
        return content;
    }
}
