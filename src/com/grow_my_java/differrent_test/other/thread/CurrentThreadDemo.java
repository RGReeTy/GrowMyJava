package com.grow_my_java.differrent_test.other.thread;

public class CurrentThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток: " + t);
        t.setName("My Thread");
        System.out.println("После изменения имени: " + t);
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток завершен");
        }
        t.join(5);
        System.out.println("t.isInterrupted() = " + t.isInterrupted());
        t.interrupt();
        System.out.println("t.isInterrupted() = " + t.isInterrupted());
    }
}
