package pl.sdacademy.algorithms.basic;

import java.util.stream.Stream;

public class Iteration {

    public static void main(String[] args) {
        /*wszystkie po kolei
        wszystkie od końca
        wszystkie na nieparzystych pozycjach
        wszystkie podzielne przez 3
        sumę wszystkich
        sumę pierwszych 4
        sumę ostatnich 5 większych od 2
        ilość liczb idąc od początku tablicy, by ich suma przekroczyła 10
        */

        int [] array = {10, 29, 34, 23, 435, 45, 56, 0, 54, 1, 2};
        int [][] matrix = {{2, 3}, {4, 5}};
        int [][] identityMatrix = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        int n = 5;
        int [][] matrix2 = new int[n][n];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.println(matrix2[i][j]);
            }

        }

        System.out.println("Pętla for");
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Pętla while");
        int i = 0;
        while(i < array.length) {
            System.out.println(array[i]);
            i++;
        }

        System.out.println("Pętla do while");
        i = 0;
        do {
            System.out.println(array[i]);
        } while(++i < array.length);

        System.out.println("For each");
        for (int num: array) {
            System.out.println(num);
        }

        String [] names = {"Ala", "Ola", "Bartek", "Andrzej"};

        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }

        for (String oneName: names) {
            System.out.println(oneName);
        }

        // sumę ostatnich 5 większych od 2
        int sum = 0;
        for (int j = array.length - 1; j > 0 && j > array.length - 6; j--) {
           if (array[j] > 1) {
               sum += array[j];
           }
        }
        System.out.println(String.format("Suma ostatnich 5 elementów większych od 2 to %d", sum));

    }

}
