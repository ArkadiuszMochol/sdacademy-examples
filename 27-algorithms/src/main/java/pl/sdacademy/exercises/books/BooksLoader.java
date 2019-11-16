package pl.sdacademy.exercises.books;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import pl.sdacademy.exercises.books.model.Book;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BooksLoader {

    private static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
                @Override
                public LocalDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss.SSSX");
                    return LocalDate.parse(jsonElement.getAsString(), formatter);
                }
            })
            .create();

    public static List<Book> loadBooks(String path) {
        List<Book> data = Collections.emptyList();
        try {
            JsonReader reader = new JsonReader(new FileReader(path));
            data = Arrays.asList(GSON.fromJson(reader, Book[].class));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }


}
