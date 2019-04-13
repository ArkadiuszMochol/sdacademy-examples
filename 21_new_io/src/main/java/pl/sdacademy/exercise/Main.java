package pl.sdacademy.exercise;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> fileLines = null;
        try {
            fileLines = Files.readAllLines(Paths.get("files", "users.json"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        fileLines.forEach(System.out::println);
        fileLines.add("TU BYŁEM SEBA");

        try {
            Files.write(Paths.get("files", "users-copy.json"), fileLines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
