package pl.sdacademy.patterns.facade.example;

public class CoffeeMakerImpl implements CoffeeMaker {
    @Override
    public void makeCoffee(int amount) {
        System.out.println("CoffeeMaker: making" + amount + " coffee(s)");
    }

    @Override
    public void turnOff() {
        System.out.println("CoffeeMaker: turning off");
    }

    @Override
    public void turnOn() {
        System.out.println("CoffeeMaker: turning on");
    }
}
