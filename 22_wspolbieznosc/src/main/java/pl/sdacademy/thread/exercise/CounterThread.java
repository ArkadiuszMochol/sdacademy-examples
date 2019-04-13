package pl.sdacademy.thread.exercise;

public class CounterThread extends Thread {

    private int count;
    private boolean stop = false;

    @Override
    public void run() {
        while(!stop) {
            System.out.println("Counter: " + count++);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopCounting() {
        stop = true;
    }
}
