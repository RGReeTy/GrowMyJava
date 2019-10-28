package com.grow_my_java.module_4_programming_with_classes.SimpleClassesAndObjects.Task_3;

public class Task_3 {
    public static void main(String[] args) {

        Student[] students = {
                new Student("Travolta J.", 1902),
                new Student("Downey J.", 1902),
                new Student("Kamberbetch J.", 1902),
                new Student("Holland T.", 1901),
                new Student("Thurman U.", 1901),
                new Student("Chan J.", 1902),
                new Student("Rivz K.", 1901),
                new Student("Yohanson S.", 1901),
                new Student("Ruffalo M.", 1901),
                new Student("Reynolds R.", 1902),
        };

        for (Student student : students) {
            student.excellentStudent();
        }

        System.out.println("The most excellent students are: ");
        printExcellentStudents(students);
    }

    private static void printExcellentStudents(Student[] students) {
        for (Student student : students) {
            boolean excellent = false;
            for (int mark : student.getProgress()) {
                if (mark < 9) {
                    excellent = false;
                    break;
                } else {
                    excellent = true;
                }
            }
            if (excellent) System.out.println(student);
        }
    }
}
