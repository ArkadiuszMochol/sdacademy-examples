package pl.sdacademy.tdd.roman;

public class RomanNumberFormatException extends Exception {

    public RomanNumberFormatException() {
    }

    public RomanNumberFormatException(String message) {
        super(message);
    }

    public RomanNumberFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
