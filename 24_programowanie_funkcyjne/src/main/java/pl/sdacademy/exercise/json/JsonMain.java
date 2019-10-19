package pl.sdacademy.exercise.json;

import com.google.gson.Gson;
import pl.sdacademy.exercise.json.model.JsonUser;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JsonMain {

    private static final Gson GSON = new Gson();

    public static void main(String[] args) {

        List<String> fileLines = null;
        try {
            fileLines = Files.readAllLines(Paths.get("files", "users.json"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //fileLines.forEach(System.out::println);
        String json = String.join(System.lineSeparator(),fileLines);
        //System.out.println(json);

        JsonUser [] users = GSON.fromJson(json, JsonUser[].class);

        System.out.println(users);

        for (JsonUser user : users ) {
            System.out.println(user);
        }

        List<String> usernames =  Stream.of(users)
                .map(usr -> usr.getUsername())
                .collect(Collectors.toList());
        System.out.println(usernames);
    }

}
