package pl.sdacademy.callable.exercise;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<Integer>> results = Lists.newArrayList();

        for (int i = 0; i < 10; i++) {
                results.add(executorService.submit(new HardCalculationCallable()));
        }

        List<Integer> realResults = Lists.newArrayList();
        try {
            /*
            for (int i = 0; i < results.size(); i++) {
                Future<Integer> futureInt = results.get(i);
                Integer calculatedInt = futureInt.get();
                realResults.add(calculatedInt);
            }
            */
            for (Future<Integer> future : results) {
                Integer calculatedInt = future.get();
                realResults.add(calculatedInt);
            }

        } catch (InterruptedException | ExecutionException e) {
            // do nothing
        }

        System.out.println(realResults);
        executorService.shutdown();

    }

}
