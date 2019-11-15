package pl.sdacademy.algorithms.basic;

import pl.sdacademy.algorithms.search.MyBinarySearch;
import pl.sdacademy.structures.heap.MyIntegerHeap;

import java.util.Random;

public class Util {

    public static void main(String[] args) {

        int [] iterTimes = {10, 100, 1_000, 10_000, 100_000, 1_000_000};

        for (int iter: iterTimes) {
            int [] testedArray = generateSortedTable(iter);
            MyBinarySearch binarySearch = new MyBinarySearch();
            long startTime = System.nanoTime();

//            testedFunction(iter);
            binarySearch.binarySearch(testedArray, 0 , testedArray.length -1, iter - 2);
//            binarySearch.naiveSearch(testedArray, iter -2);
            long stopTime = System.nanoTime();
            double elapsedTime = (stopTime - startTime)/1000000.0;
            System.out.println(String.format("Time for %d - %f", iter, elapsedTime));
        }
    }

    public static int [] generateSortedTable(int length) {
        MyIntegerHeap myIntegerHeap = new MyIntegerHeap();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            myIntegerHeap.push(random.nextInt(10000));
        }
        int [] sortedArray = new int [length];
        for (int i = length - 1; i >= 0 ; i--) {
            sortedArray[i] = myIntegerHeap.pop();
        }
        return sortedArray;
    }

    public static void testedFunction(long iterTimes) {
        long total = 0;
        for (int i = 0; i < iterTimes; i++) {
            total += i;
            for (int j = 0; j < iterTimes; j++) {
                total += i+j;
            }
        }
    }
}
