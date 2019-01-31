package pl.sdacademy.patterns.observer.example;

public class WeatherStation implements Subscriber {

    @Override
    public void notify(String data) {
        System.out.println(String.format("Weather station temp: %s", data));
    }
}
