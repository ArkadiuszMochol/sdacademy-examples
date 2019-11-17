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
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                swapIfNeeded(j, array);
            }
        }
    }

    private static void swapIfNeeded(int idx, int [] array) {
        if (Integer.compare(array[idx], array[idx + 1]) == 1) {
            int tmp = array[idx + 1];
            array[idx + 1] = array[idx];
            array[idx] = tmp;
        }
    }

}
