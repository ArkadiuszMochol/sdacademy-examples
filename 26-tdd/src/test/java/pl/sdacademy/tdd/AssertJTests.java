package pl.sdacademy.tdd;

import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.*;

public class AssertJTests {

    @Test
    public void equalityTest() {

        //given
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "notHello";

        //then
        assertThat(str1).isNotBlank();
        assertThat(str1).isEqualToIgnoringCase(str2);
        assertThat(str1).isNotEqualTo(str3);
    }

    @Test
    public void collectionsTest() {
        //given
        List<String> strings = Arrays.asList("Hello", "Adam", "George");

        //then
        assertThat(strings)
                .contains("Hello")
                .containsAnyOf("Ola", "Adam", "Ewa")
                .doesNotContain("Dog");
    }

    @Test
    public void datesTest() {
        //given
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minus(1, ChronoUnit.DAYS);
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);

        //then
        assertThat(today).isAfter(yesterday);
        assertThat(yesterday).isBefore(today);
        assertThat(today).isBetween(yesterday, tomorrow);
    }

}
