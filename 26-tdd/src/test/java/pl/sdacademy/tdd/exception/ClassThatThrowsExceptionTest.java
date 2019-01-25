package pl.sdacademy.tdd.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class ClassThatThrowsExceptionTest {

    private ClassThatThrowsException objectThowsException;

    @BeforeEach
    void init() {
        objectThowsException = new ClassThatThrowsException();
    }

    @Test
    void methodThrowsSimpleException() {

        //when
        Throwable thrown = catchThrowable(() -> objectThowsException.methodThrowsSimpleException());

        //then
        assertThat(thrown).isInstanceOf(MyCustomException.class)
                .hasNoCause();
    }

    @Test
    void methodThatThrowsExceptionWithMessage() {

        //when
        Throwable thrown = catchThrowable(() -> objectThowsException.methodThatThrowsExceptionWithMessage());

        //then
        assertThat(thrown).isInstanceOf(MyCustomException.class)
                .hasMessageContaining("message");
    }

    @Test
    void methodThatThrowsExceptionWithCause() {

        //when
        Throwable thrown = catchThrowable(() -> objectThowsException.methodThatThrowsExceptionWithCause());

        //then
        assertThat(thrown).isInstanceOf(MyCustomException.class)
                .hasMessageContaining("message")
                .hasCauseInstanceOf(IOException.class);
    }
}