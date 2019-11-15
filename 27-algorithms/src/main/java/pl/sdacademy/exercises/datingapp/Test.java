package pl.sdacademy.exercises.datingapp;

public class Test {
    public static void main(String[] args) {
        int[] tableNumbers = {-10, -8, -6, -4, -2, 0, 1, 3, 5, 7, 9, 12};
        countNegativesAndPositives(tableNumbers);
    }

    public static void countNegativesAndPositives(int[] table) {
        int counter1 = 0, counter2 = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] > 0) {
                counter1++;
            }

        }
        System.out.println("The number of positive numbers is equal " + counter1);
        for (int i = 0; i < table.length; i++) {
            if (table[i] < 0) {
                counter2++;
            }
        }
        System.out.println("The number of negative numbers is equal " + counter2);
    }
}
