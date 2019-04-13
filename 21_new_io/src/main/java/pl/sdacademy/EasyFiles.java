package pl.sdacademy;

import com.google.common.collect.Lists;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class EasyFiles {

    public static void main(String[] args) {

        try {
            readTextFile();
            //writeTextFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readTextFile() throws IOException {
        Charset charset = Charset.forName("UTF-8");
        Path filePath = Paths.get("files", "users.json");
        List<String> lines = Files.readAllLines(filePath, charset);

        lines.forEach(System.out::println);
    }

    private static void writeTextFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = Lists.newArrayList();
        String line = null;
        do {
            line = scanner.nextLine();
            lines.add(line);
        } while (!line.equals("end"));

        Charset charset = Charset.forName("UTF-8");
        Path filePath = Paths.get("files", "easywrite.txt");
        Files.write(filePath, lines, charset);
    }

}
