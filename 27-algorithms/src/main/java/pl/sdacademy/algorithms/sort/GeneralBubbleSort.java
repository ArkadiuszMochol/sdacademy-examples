package pl.sdacademy.algorithms.sort;

import pl.sdacademy.algorithms.sort.comparators.UserNameComparator;
import pl.sdacademy.exercises.datingapp.User;

import java.util.Arrays;
import java.util.Comparator;

public class GeneralBubbleSort {

    public static void main(String[] args) {
        User [] users = {
             new User("Kasia", "Kowalska", true, 22, Arrays.asList("Rower", "Muzyka")),
             new User("Basia", "Basińska", true, 34, Arrays.asList("Książka", "Film")),
             new User("Asia", "Asińska", true, 25, Arrays.asList("Programowanie")),
             new User("Bartek", "Bartkowiak", false, 25, Arrays.asList("Rower", "Gotowanie", "Programowanie")),
             new User("Kamil", "Kamil", false, 28, Arrays.asList("Programowanie", "Książka")),
        };

        String [] strings = {"Kotek", "Piesek", "Chomik", "Dziobak", "Żyrafa"};

        Integer [] integers = {4, 2, 3, 8, 7, 9 , 12, 23};

        Comparator<User> userNameComparator = new UserNameComparator();
        Comparator<User> userAgeComparator = new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return Integer.compare(user1.getAge(), user2.getAge());
            }
        };
        Comparator<User> userLastNameComparator = (user1, user2) ->
                user1.getLastName().compareTo(user2.getLastName());

        printTable(users);

        bubbleSort(users, userLastNameComparator);

        printTable(users);

    }

    public static <T> void bubbleSort(T [] array, Comparator<T> comparator) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                swapIfNeeded(j, array, comparator);
            }
        }
    }

    public static <T> void swapIfNeeded(int idx, T [] array, Comparator<T> comparator) {
        if (comparator.compare(array[idx], array[idx + 1]) > 0) {
            T tmp = array[idx + 1];
            array[idx + 1 ] = array[idx];
            array[idx] = tmp;
        }
    }

    ///////////////////////////////

    public static <T extends Comparable<T>> void bubbleSort(T [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                swapIfNeeded(j, array);
            }
        }
    }

    public static <T extends Comparable<T>> void swapIfNeeded(int idx, T [] array) {
        if (array[idx].compareTo(array[idx + 1]) > 0) {
            T tmp = array[idx + 1];
            array[idx + 1 ] = array[idx];
            array[idx] = tmp;
        }
    }

    ///////////////////////////

    public static <T> void printTable(T [] array) {
        for (T elem : array) {
            System.out.println(elem);
        }
        System.out.println();
    }

}
