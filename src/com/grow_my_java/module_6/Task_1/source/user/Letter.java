package com.grow_my_java.module_6.Task_1.source.user;

public class Letter {
    private Email from;
    private Email to;
    private String subject;
    private String text;


    public Letter(Email from, Email to, String subject, String text) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.text = text;
    }

    public Email getFrom() {
        return from;
    }

    public void setFrom(Email from) {
        this.from = from;
    }

    public Email getTo() {
        return to;
    }

    public void setTo(Email to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("The letter from %s, to %s, subject: %s\n \"%s\"", from, to, subject, text);
    }
}
