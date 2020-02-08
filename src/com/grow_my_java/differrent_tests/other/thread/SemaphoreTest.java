package com.grow_my_java.differrent_tests.other.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);
        Connection connection = Connection.getConnection();
        for (int i = 0; i < 200; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}

class Connection { //Singleton
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(10);

    private Connection() {
    }

    public static Connection getConnection() {
        return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release();
        }
    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            connectionsCount++;
            System.out.println("connection count = " + connectionsCount);
        }
        Thread.sleep(5000);

        synchronized (this) {
            connectionsCount--;
            System.out.println("connectionsCount = " + connectionsCount);
        }

    }
}


class TestyTest {
    void Method() {
        //next text cutting from psvm method early
        Semaphore semaphore = new Semaphore(3);// есть 3 разрешения для взаимодествия
        try {
            semaphore.acquire();//когда в потоке есть взаимодествие с ресурсом
            semaphore.acquire();
            semaphore.acquire();
            System.out.println("All permits have been acquire!");
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();//разрешение отдано
        System.out.println(semaphore.availablePermits());//возвращает количество разрешений
    }
}
