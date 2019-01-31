package pl.sdacademy.patterns.facade.example;

public interface CoffeeMaker extends Switchable {
    void makeCoffee(int amount);
}
