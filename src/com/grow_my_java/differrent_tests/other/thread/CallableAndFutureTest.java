package com.grow_my_java.differrent_tests.other.thread;

import java.util.Random;
import java.util.concurrent.*;

public class CallableAndFutureTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Starting");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");

            Random random = new Random();
            int randomValue = random.nextInt(10);
            if (randomValue < 5) throw new Exception("Something bad happened");
            return randomValue;
        });

        executorService.shutdown();

        try {
            int result = future.get();
            System.out.println("result = " + result);
//            System.out.println("future = " + future);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }
    }
}
