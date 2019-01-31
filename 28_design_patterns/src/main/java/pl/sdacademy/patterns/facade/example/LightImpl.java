package pl.sdacademy.patterns.facade.example;

public class LightImpl implements Light {

    @Override
    public void setIntensivity(int value) {
        System.out.println("Ligth: setting intensivity: " + value);
    }

    @Override
    public void blink() {
        System.out.println("Light: start blinking");
    }

    @Override
    public void setColor(String color) {
        System.out.printf("Light: setting color to " + color);

    }

    @Override
    public void turnOff() {
        System.out.println("Light: turn on");
    }

    @Override
    public void turnOn() {
        System.out.println("Light: turn off");
    }
}
