package pl.sdacademy.exercise.exception;

public class EmailFormatException extends Exception {

    public EmailFormatException() {
    }

    public EmailFormatException(String message) {
        super(message);
    }

    public EmailFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
