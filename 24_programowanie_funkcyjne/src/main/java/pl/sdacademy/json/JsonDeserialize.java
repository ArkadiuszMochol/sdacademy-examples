package pl.sdacademy.json;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JsonDeserialize {

   private static Gson GSON = new Gson();

    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        Path filePath = Paths.get("files", "users.json");
        List<String> lines = null;
        try {
            lines = Files.readAllLines(filePath, charset);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String jsonString = String.join(System.lineSeparator(), lines);

        User [] users = GSON.fromJson(jsonString, User[].class);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
