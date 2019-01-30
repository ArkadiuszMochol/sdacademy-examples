package pl.sdacademy.tdd.roman;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class RomanToDecimalConverterTest {

    @ParameterizedTest
    @CsvSource({
            "VI, 6",
            "III, 3",
            "MMVI, 2006",
            "MCMXLIV, 1944",
            "DC, 600"
    })
    void convertToDecimal(String romanNumber, int expectedDecimal) throws Exception {
        //given
        RomanToDecimalConverter romanToDecimalConverter = new RomanToDecimalConverter();

        //when
        int decimal = romanToDecimalConverter.convertToDecimal(romanNumber);

        //then
        assertThat(decimal).isEqualTo(expectedDecimal);
    }

    @ParameterizedTest
    @ValueSource(strings = {"BMCXL", "MMVKI"})
    void throwExceptionIfUnknownLetterIsPassed(String wrongRomanNumber) {
        //given
        RomanToDecimalConverter romanToDecimalConverter = new RomanToDecimalConverter();

        //when trying to convert roman number with unsupported letters
        Throwable thrown = catchThrowable(() -> romanToDecimalConverter.convertToDecimal(wrongRomanNumber));

        //then throw exception of type 'RomanNumberFormatException' with
        // with message "Cannot convert to decimal - wrong format"
        assertThat(thrown).isInstanceOf(RomanNumberFormatException.class)
                .hasMessageContaining("wrong format")
                .hasMessageContaining("Cannot convert");
    }


}