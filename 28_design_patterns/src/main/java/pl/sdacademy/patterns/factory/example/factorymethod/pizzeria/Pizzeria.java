package pl.sdacademy.patterns.factory.example.factorymethod.pizzeria;

import pl.sdacademy.patterns.factory.example.factorymethod.pizza.Pizza;

public abstract class Pizzeria {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        System.out.println("##################");
        pizza.prepare();
        pizza.cook();
        pizza.cut();
        System.out.println("##################");

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
