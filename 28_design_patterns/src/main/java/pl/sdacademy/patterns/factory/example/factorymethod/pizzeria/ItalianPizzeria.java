package pl.sdacademy.patterns.factory.example.factorymethod.pizzeria;

import pl.sdacademy.patterns.factory.example.factorymethod.pizza.ItalianCheesePizza;
import pl.sdacademy.patterns.factory.example.factorymethod.pizza.ItalianPepperoniPizza;
import pl.sdacademy.patterns.factory.example.factorymethod.pizza.ItalianSeafoodPizza;
import pl.sdacademy.patterns.factory.example.factorymethod.pizza.Pizza;

public class ItalianPizzeria extends Pizzeria {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("serowa")) {
            return new ItalianCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ItalianPepperoniPizza();
        } else if (type.equals("owoce_morza")) {
            return new ItalianSeafoodPizza();
        } else {
            throw new IllegalArgumentException("Nieznany typ pizzy! " + type);
        }
    }
}
