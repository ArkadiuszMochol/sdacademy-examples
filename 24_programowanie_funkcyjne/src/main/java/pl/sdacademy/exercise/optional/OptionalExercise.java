package pl.sdacademy.exercise.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExercise {

    public static void main(String[] args) {
        String text = "Ala ma kota";
        //text = null;

        Optional<String> optText = Optional.ofNullable(text);
        Optional<Integer> optInt = optText.map(txt -> txt.length());
        int result = optInt.orElse(0);

        System.out.println(result);

        int result2 = Optional.ofNullable(text)
                .map(txt -> txt.length())
                .filter(len -> len > 5)
                .orElse(0);

        System.out.println(result2);

        String upperLongText = Optional.ofNullable(text)
                .filter(txt -> txt.length() > 5)
                .map(String::toUpperCase)
                .orElse("N/A");

        System.out.println(upperLongText);

    }

}
