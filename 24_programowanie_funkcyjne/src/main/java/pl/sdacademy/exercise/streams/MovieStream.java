package pl.sdacademy.exercise.streams;

import pl.sdacademy.stream.movie.Film;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MovieStream {

    public static void main(String[] args) {
        List<Film> filmy = Arrays.asList( //nasza biblioteczka filmów jest skromna, ale wiele można z nią zrobić
                new Film("Obcy",
                        "Riddley Scott",
                        LocalDate.of(1990, 10, 31),
                        39.99, Arrays.asList("Akcja", "Horror"),
                        Arrays.asList("Sigourney Weaver", "Bradd Pitt")),
                new Film("Casablanca",
                        "Michael Curtis",
                        LocalDate.of(1942, 11, 26),
                        29.99, Arrays.asList("Dramat", "Kryminał"),
                        Arrays.asList("Humphrey Bogart", "Ingrid Bergman")),
                new Film("Troya",
                        "Michael Curtis",
                        LocalDate.of(2008, 11, 26),
                        59.99, Arrays.asList("Akcja", "Historyczny"),
                        Arrays.asList("Bradd Pitt", "Orlando Bloom")),
                new Film("Godfather",
                        "Francis Coppola",
                        LocalDate.of(1982, 3, 4),
                        80.29, Arrays.asList("Akcja", "Dramat"),
                        Arrays.asList("Marlon Brando", "Al Pacino"))
        );

        Set<String> rezyserzy = filmy.stream().map(Film::getRezyser)
                .collect(Collectors.toSet());
        boolean czySaDrogie = filmy.stream()
                .anyMatch(film -> film.getCenaDVD() > 100);
        Set<String> aktorzy = filmy.stream().flatMap(film -> film.getListaAktorów().stream())
                .collect(Collectors.toSet());
        System.out.println(aktorzy);

        boolean czyJestBraddPitt = filmy.stream().flatMap(film -> film.getListaAktorów().stream())
                .anyMatch(actor -> actor.equals("Bradd Pitt"));
        System.out.println(czyJestBraddPitt);

        Map<String, List<Film>> filmByRezyser = filmy.stream()
                .collect(Collectors.groupingBy(Film::getRezyser));
        System.out.println(filmByRezyser);

        filmByRezyser.keySet().forEach(key -> {
            System.out.println(key);
            filmByRezyser.get(key).forEach(film -> System.out.println(" --" + film.getTytuł()));
        });

        // wypisz filmy, które powstały po 30 października 1990
        List<Film> niezastareFilmy = filmy.stream()
                .filter(film -> film.getRokPremiery().isAfter(LocalDate.of(1990, 10, 30)))
                .collect(Collectors.toList());
        System.out.println(niezastareFilmy);

        // znajdź średnią cenę filmów w liście
        double sredniaCena = filmy.stream()
                .mapToDouble(Film::getCenaDVD)
                .average()
                .getAsDouble();

        System.out.println("Srednia cena filmu: " + sredniaCena);
    }
}
