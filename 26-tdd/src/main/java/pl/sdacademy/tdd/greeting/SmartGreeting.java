package pl.sdacademy.tdd.greeting;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SmartGreeting {

    String greet(String... names) {
//        if (Objects.isNull(name)) {
//            return "Hello, my friend";
//        }
//        return String.format("Hello, %s", name);4
        if (names.length == 1) {
            String name = names[0];
            return handleOneName(name);
        } else if (names.length == 2){
            return String.format("Hello, %s and %s", names[0], names[1]);
        } else {
            return handleMoreThanThreeNames2(names);
        }
    }

    private String handleOneName(String name) {
        String greeting = Optional.ofNullable(name)
                .map(nm -> "Hello, " + nm)
                .orElse("Hello, my friend");

        return Optional.ofNullable(name)
                .filter(StringUtils::isAllUpperCase)
                .map(nm -> "HELLO, " + nm)
                .orElse(greeting);
    }

    private String handleMoreThanThreeNames(String [] names) {
        String greeting = "Hello";
        for(int i = 0 ; i < names.length; i++) {
            if(i == names.length - 1) {
                greeting += ", and " + names[i];
            } else {
                greeting += ", " + names[i];
            }
        }
        return greeting;
    }

    private String handleMoreThanThreeNames2(String [] names) {
        names[names.length-1] =  "and " + names[names.length-1];
        return "Hello, " + String.join(", ", names);
    }

}
