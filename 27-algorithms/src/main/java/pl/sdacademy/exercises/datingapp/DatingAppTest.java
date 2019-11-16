package pl.sdacademy.exercises.datingapp;

import java.util.Arrays;
import java.util.List;

public class DatingAppTest {

    public static void main(String[] args) {
        // user pola: name, lastName, isFemale, age, interests: List<String>
        User kasia = new User("Kasia", "Kowalska", true, 22, Arrays.asList("Rower", "Muzyka"));
        User basia = new User("Basia", "Basińska", true, 34, Arrays.asList("Książka", "Film"));
        User asia = new User("Asia", "Asińska", true, 25, Arrays.asList("Programowanie"));
        User bartek = new User("Bartek", "Bartkowiak", false, 25, Arrays.asList("Rower", "Gotowanie", "Programowanie"));
        User kamil = new User("Kamil", "Kamil", false, 28, Arrays.asList("Programowanie", "Książka"));

        DatingApp datingApp = new DatingApp();
        datingApp.addUser(kasia);
        datingApp.addUser(basia);
        datingApp.addUser(asia);
        datingApp.addUser(bartek);
        datingApp.addUser(kamil);

        List<User> kasiaMatch = datingApp.match(kasia);
        System.out.println("Dopasowania kasi: " + kasiaMatch.toString());

        List<User> bartekMatch = datingApp.match(bartek);
        System.out.println("Dopasowania bartka: " + bartekMatch.toString());

    }

}
