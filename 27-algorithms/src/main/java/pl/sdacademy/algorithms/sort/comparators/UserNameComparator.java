package pl.sdacademy.algorithms.sort.comparators;

import pl.sdacademy.exercises.datingapp.User;

import java.util.Comparator;

public class UserNameComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return user1.getName().compareTo(user2.getName());
    }
}
