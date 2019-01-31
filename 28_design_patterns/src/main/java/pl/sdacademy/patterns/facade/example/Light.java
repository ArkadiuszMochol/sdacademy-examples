package pl.sdacademy.patterns.facade.example;

public interface Light extends Switchable {

    void setIntensivity(int value);
    void blink();
    void setColor(String color);
}
