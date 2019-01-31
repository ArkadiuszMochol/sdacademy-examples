package pl.sdacademy.patterns.observer.example;

public class Clock implements Subscriber {
    @Override
    public void notify(String data) {
        System.out.println(String.format("Clock update - temp: %s", data));
    }
}
