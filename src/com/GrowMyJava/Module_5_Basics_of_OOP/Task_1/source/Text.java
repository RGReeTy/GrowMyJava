package com.GrowMyJava.Module_5_Basics_of_OOP.Task_1.source;

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
