package pl.sdacademy.tdd.greeting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class SmartGreetingTest {

    @DisplayName("Should return 'Hello + name' or 'Hello, my friend' if null")
    @ParameterizedTest(name = "Expected greeting is \"{1}\" when name is \"{0}\"")
    @CsvSource(delimiter = ';', value = {
            "Bob; Hello, Bob",
            "John; Hello, John",
            "ADAM; HELLO, ADAM",
            "Bob,Alice; Hello, Bob and Alice",
            "Bob,Alice,John; Hello, Bob, Alice, and John",
            "Bob, JOHN, Alice; Hello Bob and Alice. AND HELLO JOHN"
    })
    void greetWithOneNameTest(String namesString, String expectedGreeting) {
        //given
        SmartGreeting smartGreeting = new SmartGreeting();
        String [] names = namesString.split(",");

        //when
        String greeting = smartGreeting.greet(names);

        //then
        assertThat(greeting).isEqualTo(expectedGreeting);
    }

    @Test
    @DisplayName("Should return 'Hello, my friend' if null passed")
    void greetWithTwoNamesTest() {
        //given
        SmartGreeting smartGreeting = new SmartGreeting();
        String [] names = new String[1];
        names[0] = null;

        //when
        String greeting = smartGreeting.greet(names);

        //then
        assertThat(greeting).isEqualTo("Hello, my friend");
    }

}