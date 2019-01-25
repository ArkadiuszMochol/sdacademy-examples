package pl.sdacademy.tdd.exception;

public class MyCustomException extends Exception {

    public MyCustomException() {
    }

    public MyCustomException(String message) {
        super(message);
    }

    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
