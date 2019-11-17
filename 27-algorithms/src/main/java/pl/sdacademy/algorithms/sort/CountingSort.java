package pl.sdacademy.algorithms.sort;

public class CountingSort {

    public static void main(String[] args) {
        int [] ageArray = {10, 23, 45 , 100, 45, 23, 1, 5 ,5, 100, 101};

        int [] ageCountsArray = new int [150];

        printTable(ageArray);

        //zliczanie
        for (int i = 0; i < ageArray.length; i++) {
            ageCountsArray[ageArray[i]] += 1;
        }

        //odtwarzanie posortowanej tablicy
        int k = 0;
        for (int i = 0; i < ageCountsArray.length; i++) {
            for (int j = 0; j < ageCountsArray[i]; j++) {
                ageArray[k] = i;
                k++;
            }
        }

        printTable(ageArray);

    }

    public static void  printTable(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
