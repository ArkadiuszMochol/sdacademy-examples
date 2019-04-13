package pl.sdacademy.callable.exercise;

import java.util.Random;
import java.util.concurrent.Callable;

public class HardCalculationCallable implements Callable<Integer> {

    private static Random random = new Random();

    @Override
    public Integer call() throws InterruptedException {
        Thread.sleep(1000 + random.nextInt(2000));
        return random.nextInt(10);
    }
}
