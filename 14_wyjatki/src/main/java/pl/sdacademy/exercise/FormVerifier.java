package pl.sdacademy.exercise;

import pl.sdacademy.exercise.exception.EmailFormatException;
import pl.sdacademy.exercise.exception.FormVerificationException;

public class FormVerifier {

    private FormVerifier() {};

    public static void verifyForm(Form form) throws FormVerificationException {

        try {
            EmailVerifier.verifyEmail(form.getEmail());
        } catch (EmailFormatException e) {
            throw new FormVerificationException("Błąd formularze", e);
        }

    }

}
