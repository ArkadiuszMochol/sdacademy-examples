package pl.sdacademy.exercise;

import pl.sdacademy.exercise.exception.EmailFormatException;
import pl.sdacademy.exercise.exception.FormVerificationException;

public class Main {

    public static void main(String[] args) {

        Form form  = new Form("Ola", "ola@example.com", "bydgoszcz", 15);

        try {
            FormVerifier.verifyForm(form);
            throw new RuntimeException();

        } catch (FormVerificationException e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Source of problem: " + e.getCause().getMessage());
        } finally {
            System.out.println("To wykona się zawsze! ");
        }
    }
}
