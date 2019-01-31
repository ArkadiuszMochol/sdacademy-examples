package pl.sdacademy.patterns.observer.example;

public interface Observable {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
}
