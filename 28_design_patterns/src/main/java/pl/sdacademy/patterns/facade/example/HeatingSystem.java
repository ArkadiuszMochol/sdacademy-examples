package pl.sdacademy.patterns.facade.example;

public interface HeatingSystem extends Switchable {
    void setTemperature(int temperature);
}
