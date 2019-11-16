package pl.sdacademy.algorithms.search;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyBinarySearch {

    public static void main(String[] args) {
        int [] myArray = {2, 12, 23, 34, 45, 56, 67, 78, 98};
        MyBinarySearch binarySearch = new MyBinarySearch();
        int foundPosition = binarySearch.binarySearch(myArray, 0, myArray.length - 1, 100);
        System.out.printf("%d znalazłem na indeksie %d\n", 100, foundPosition);

        Arrays.sort(myArray);
    }

    public int naiveSearch(int [] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return  -1;
    }

    public int binarySearch(int [] array, int left, int right, int searchValue) {
        if (left <= right) {
            int m = left + (right - left) / 2;
            if (array[m] == searchValue) {
                return m;
            }
            if (array[m] > searchValue) {
                return binarySearch(array, left, m - 1 , searchValue);
            }
            return binarySearch(array,m + 1 , right ,searchValue);
        }
        return -1;
    }

}
