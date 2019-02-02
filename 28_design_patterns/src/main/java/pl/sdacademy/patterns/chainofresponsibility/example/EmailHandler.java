package pl.sdacademy.patterns.chainofresponsibility.example;

interface EmailHandler {
    void processEmail(String email);
    void setNextHandler(EmailHandler handler);
}

