package pl.sdacademy.runnable.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Runnable runnable = new CounterRunnable();
//        Thread thread = new Thread(runnable);
//        thread.start();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(runnable);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdownNow();
    }
}
