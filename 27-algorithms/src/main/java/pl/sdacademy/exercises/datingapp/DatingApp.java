package pl.sdacademy.exercises.datingapp;

import java.util.ArrayList;
import java.util.List;

public class DatingApp {

    private List<User> users = new ArrayList<>();

    public void addUser(User newUser) {
        users.add(newUser);
    }

    public List<User> match(User user) {
        List<User> matchingUsers = new ArrayList<>();
        for(User nextUser : users) {
            if (usersMatch(nextUser, user)) {
                matchingUsers.add(nextUser);
            }
        }
        return matchingUsers;
    }

    private boolean usersMatch(User user1, User user2) {
        if (user1.equals(user2)) {
            return false;
        }
        if (user1.isFemale() == user2.isFemale()) {
            return false;
        }
        if (Math.abs(user1.getAge() - user2.getAge()) > 3) {
            return false;
        }
        if (!interestsMatch(user1, user2)) {
            return false;
        }
        return true;
    }

    private boolean interestsMatch(User user1, User user2) {
        for(String interest : user1.getInterests()) {
            if (user2.getInterests().contains(interest)) {
                return true;
            }
        }
        return false;
    }

}
