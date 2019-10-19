package pl.sdacademy.exercise.optional;

import pl.sdacademy.user.User;

import java.util.Optional;
import java.util.function.Predicate;

public class OptionalUser {

    public static void main(String[] args) {
        User defaultUser = new User("NN", "NN", -1);

        User anna = new User("Anna", "Kowalska", 34);
        User dominik = null;

        System.out.println("Anna jest dorosła? " + czyDorosły(anna));
        System.out.println("Dominik jest dorosły? " + czyDorosły(dominik));

        Predicate<User> dorosly = user -> user.getWiek() >= 18;
        Predicate<User> kobieta = user -> user.getImie().endsWith("a");

        Predicate<User> doroslaKobieta = dorosly.and(kobieta);

        Optional<User> userOpt = Optional.ofNullable(anna);
        userOpt.ifPresent(System.out::println);
        userOpt
                .map( usr -> usr.getImie() + " " + usr.getNazwisko())
                .map(String::toUpperCase)
                .ifPresent(System.out::println);

        User adult = Optional.ofNullable(anna)
                .filter(dorosly)
                .orElse(defaultUser);
        System.out.println(adult);

        User upperCaseUser = Optional.ofNullable(dominik)
                .map(usr -> new User(usr.getImie().toUpperCase(), usr.getNazwisko().toUpperCase(), usr.getWiek()))
                .orElse(defaultUser);
        System.out.println(upperCaseUser);

        Optional.ofNullable(anna)
                .filter(usr -> usr.getWiek() > 20)
                .map(usr -> {
                    System.out.println("User " + usr.getImie() + " ma więcej niż 20 lat");
                    return usr;
                })
                .filter(usr -> usr.getWiek() > 30)
                .map(usr -> {
                    System.out.println("User " + usr.getImie() + " ma więcej niż 30 lat");
                    return usr;
                });
        System.out.println(silnia(4));

    }

    public static int silnia(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * silnia(n - 1);
        }
    }



    public static boolean czyDorosły(User user) {
//        if (user != null) {
//            return user.getWiek() >= 18;
//        } else {
//            return false;
//        }
        int czarek = 2;
        return Optional.ofNullable(user)
                .filter(usr -> usr.getWiek() >= 18)
                .isPresent();
    }

}
