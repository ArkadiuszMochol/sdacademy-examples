package pl.sdacademy.runnable.exercise;

public class CounterRunnable implements Runnable {

    private int count;
    private boolean stop = false;

    @Override
    public void run() {
        while(!stop) {
            System.out.println("Counter: " + count++);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                stop = true;
            }
        }
    }

    public void stopCounting() {
        stop = true;
    }
}
