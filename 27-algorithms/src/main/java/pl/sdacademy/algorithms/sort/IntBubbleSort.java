package pl.sdacademy.algorithms.sort;

public class IntBubbleSort {

    public static void main(String[] args) {
        int [] array = {0, 2, 1, 8, 7, 4, 3, 9};

        for (int elem : array) {
            System.out.print(elem + ",");
        }
        System.out.println();

        bubbleSort(array);

        for (int elem : array) {
            System.out.print(elem + ",");
        }
        System.out.println();
    }

    public static void bubbleSort(int [] array) {

    }

}
