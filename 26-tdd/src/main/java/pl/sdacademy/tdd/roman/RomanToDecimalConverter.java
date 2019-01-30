package pl.sdacademy.tdd.roman;


import com.google.common.collect.ImmutableMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RomanToDecimalConverter {

    private Map<Character, Integer> romanToDecimalMap = new HashMap<>();

    public RomanToDecimalConverter() {
        romanToDecimalMap.put('I', 1);
        romanToDecimalMap.put('V', 5);
        romanToDecimalMap.put('X', 10);
        romanToDecimalMap.put('L', 50);
        romanToDecimalMap.put('C', 100);
        romanToDecimalMap.put('D', 500);
        romanToDecimalMap.put('M', 1000);
    }

    public int convertToDecimal(String romanNumber) throws RomanNumberFormatException {
        char [] letters = romanNumber.toCharArray();
        List<Integer> values = new ArrayList<>();
        Integer value;
        for (char letter : letters) {
            value = romanToDecimalMap.get(letter);
            if (value == null) {
                throw new RomanNumberFormatException("Cannot convert to decimal - wrong format");
            }
        values.add(value);
    }
    int sum = 0;
        for (int i = 0; i < values.size(); i++) {
        sum += values.get(i);
    }
        return sum;
    }
}
