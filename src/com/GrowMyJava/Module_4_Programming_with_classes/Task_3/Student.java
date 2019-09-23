package com.GrowMyJava.Module_4_Programming_with_classes.Task_3;

import java.util.Random;

public class Student {
    //3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
    //из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
    //номеров групп студентов, имеющих оценки, равные только 9 или 10.

    private String name;
    private int groupID;
    private int[] progress = new int[5];

    public Student(String name, int groupId) {
        this.name = name;
        this.groupID = groupId;
        this.progress = new int[5];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int[] getProgress() {
        return progress;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' + ", groupID= " + groupID;
    }

    public void excellentStudent() {
        for (int i = 0; i < progress.length; i++) {
            progress[i] = new Random().nextInt(3) + 8;
        }
    }
}
