package pl.sdacademy.exercise.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambda {

    interface StringOperation {
        Integer statistic(String text);
    }

    interface MathOperation {
        Integer operate(Integer number);
    }

    //zadanie: utwórz interfejs MathOperation z jedną metodą Integer operate(Integer number).
    // utwórz dwie lambdy implementujące ten interfejs - pierwsza zwróci wartość powiększoną o dwa
    // a druga kwadrat (potęgę 2) przekazanej liczby

    public static void main(String[] args) {
        StringOperation length = new StringOperation() {
            @Override
            public Integer statistic(String text) {
                return text.length();
            }
        };

        StringOperation lengthLambda = text -> text.length();
        Consumer cons = System.out::println;

        int dlugoscNapisu = length.statistic("Ala ma kota");
        System.out.println(dlugoscNapisu);

        dlugoscNapisu = lengthLambda.statistic("Ala ma kota");
        System.out.println(dlugoscNapisu);

        Consumer<String> wypisywacz = text -> System.out.println(text);
        //wypisywacz.accept("Lambda text");
        Consumer<String> zapisywacz = text -> {
            try {
                Files.write(Paths.get("files", "test.txt"), Arrays.asList(text));
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        //zapisywacz.accept("Lambda text");

        Consumer<String> wypisywaczozapisywacz = wypisywacz.andThen(zapisywacz);
        wypisywaczozapisywacz.accept("Inny lambda tekst");

        MathOperation addTwo = number -> number + 2;
        MathOperation square = number -> number * number;
        MathOperation one = number -> number / number;
        System.out.println(addTwo.operate(5));
        System.out.println(square.operate(5));

        System.out.println(one.operate(4));
        System.out.println(one.operate(6));

        Function<Integer, Integer> addTwoFunction = number -> number + 2;
        Function<Integer, Integer> squareFunction = number -> number * number;

        System.out.println(addTwoFunction.apply(10));
        System.out.println(squareFunction.apply(10));

        Function<Integer, Integer> combinedFunction = addTwoFunction.compose(squareFunction);
        //Function<Integer, Integer> combinedFunction = addTwoFunction.andThen(squareFunction);

        System.out.println(combinedFunction.apply(10));

    }


}
