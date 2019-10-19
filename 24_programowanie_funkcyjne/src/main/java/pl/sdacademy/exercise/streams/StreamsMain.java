package pl.sdacademy.exercise.streams;


import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMain {

    private String field;

    public static void main(String[] args) {

        List<String> napisy = Arrays.asList("Ala", "Tomek", "Michał", "Jarek", "Kamila", "Adrian", "Jadwiga");
        System.out.println("Wynik: " + przetwórz(napisy));

        Map<Integer, List<String>> poLiczbieZnaków = napisy.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(poLiczbieZnaków);

        DoubleSummaryStatistics stats = napisy.stream()
                .mapToDouble(String::length)
                .summaryStatistics();

        System.out.println(stats.getAverage());

        napisy.parallelStream();
    }

    public static List<String> przetwórz(List<String> napisy) {
        Stream<String> stream1 = napisy.stream()
                .map(String::toUpperCase)
                .filter(str -> str.length() > 3);
        Stream<String> stream2 = napisy.stream()
                .map(str -> String.valueOf(str.length()));
        return Stream.concat(stream1, stream2)
                .filter(str -> str.length() % 2 == 0)
                .collect(Collectors.toList());

    }

}
