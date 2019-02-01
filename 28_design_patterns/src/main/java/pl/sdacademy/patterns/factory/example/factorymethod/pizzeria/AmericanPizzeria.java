package pl.sdacademy.patterns.factory.example.factorymethod.pizzeria;

import pl.sdacademy.patterns.factory.example.factorymethod.pizza.*;

public class AmericanPizzeria extends Pizzeria {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("serowa")) {
            return new AmericanCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new AmericanPepperoniPizza();
        } else if (type.equals("owoce_morza")) {
            return new AmericanSeafoodPizza();
        } else {
            throw new IllegalArgumentException("Nieznany typ pizzy! " + type);
        }
    }
}
