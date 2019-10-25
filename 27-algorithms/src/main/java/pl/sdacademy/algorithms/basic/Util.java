package pl.sdacademy.algorithms.basic;

public class Util {

    public static void main(String[] args) {

        long [] iterTimes = {10, 100, 1_000, 10_000, 100_000};



        for (long iter: iterTimes) {
            long startTime = System.nanoTime();

            testedFunction(iter);

            long stopTime = System.nanoTime();
            double elapsedTime = (stopTime - startTime)/1000000.0;
            System.out.println(String.format("Time for %d - %f", iter, elapsedTime));
        }


    }

    public static void testedFunction(long iterTimes) {
        long total = 0;
        for (int i = 0; i < iterTimes; i++) {
            for (int j = 0; j < iterTimes; j++) {
                total += i+j;
            }
        }
    }
}
