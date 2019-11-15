package pl.sdacademy.algorithms.search;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinarySearch {

    static int binarySearch(int [] array, int left, int right, int value) {

        if(left <= right) {
            int middle = left + (right - left) / 2;
            if(array[middle] == value) {
                return middle;
            }
            if (array[middle] > value) {
                return binarySearch(array, left, middle - 1, value);
            }
            return binarySearch(array, middle + 1, right, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i: arr) {
            System.out.println(i);
        }
        System.out.println(binarySearch(arr, 0, arr.length - 1, 3));
    }

}
