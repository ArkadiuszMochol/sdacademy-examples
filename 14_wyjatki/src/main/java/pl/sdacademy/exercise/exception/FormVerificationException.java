package pl.sdacademy.exercise.exception;

public class FormVerificationException extends Exception {

    public FormVerificationException() {
    }

    public FormVerificationException(String message) {
        super(message);
    }

    public FormVerificationException(String message, Throwable cause) {
        super(message, cause);
    }
}
