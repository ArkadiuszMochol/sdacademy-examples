package pl.sdacademy.algorithms.sort.comparators;

import pl.sdacademy.exercises.datingapp.User;

import java.util.Arrays;

public class ComparatorTest {

    public static void main(String[] args) {
        UserNameComparator comparator = new UserNameComparator();

        User kasia = new User("Kasia", "Kowalska", true, 22, Arrays.asList("Rower", "Muzyka"));
        User basia = new User("Basia", "Basińska", true, 34, Arrays.asList("Książka", "Film"));

        System.out.println(comparator.compare(basia, kasia));
    }

}
