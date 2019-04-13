package pl.sdacademy.thread.exercise;

public class Main {

    public static void main(String[] args) {
        System.out.println("Główny wątek: start");
        CounterThread thread = new CounterThread();
        thread.start();
        try {
            Thread.sleep(5000);
            thread.stopCounting();
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Główny wątek stop");
    }
}
