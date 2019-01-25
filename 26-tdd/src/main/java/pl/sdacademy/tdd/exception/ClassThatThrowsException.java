package pl.sdacademy.tdd.exception;

import java.io.IOException;

public class ClassThatThrowsException {

    public void methodThrowsSimpleException() throws MyCustomException {
        throw new MyCustomException();
    }

    public void methodThatThrowsExceptionWithMessage() throws MyCustomException {
        throw new MyCustomException("This is exception message");
    }

    public void methodThatThrowsExceptionWithCause() throws MyCustomException {
        throw new MyCustomException("This is exception message", new IOException("Cannot write to disk"));
    }
}
