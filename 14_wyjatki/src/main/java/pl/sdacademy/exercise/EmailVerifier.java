package pl.sdacademy.exercise;

import pl.sdacademy.exercise.exception.EmailFormatException;

import java.io.IOException;

public class EmailVerifier {

    private EmailVerifier() {

    };

    public static void verifyEmail(String email) throws EmailFormatException {
        if (!email.contains("@")) {
            throw new EmailFormatException("Brakuje małpy!", new IOException("Brakuje pliku"));
        } else {
            System.out.println("Email " + email + " jest poprawny");
        }
    }

}
