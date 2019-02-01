package pl.sdacademy.patterns.factory.example.abstractfactory.factory;

import pl.sdacademy.patterns.factory.example.abstractfactory.ingredients.Cheese;
import pl.sdacademy.patterns.factory.example.abstractfactory.ingredients.Dough;
import pl.sdacademy.patterns.factory.example.abstractfactory.ingredients.Meat;
import pl.sdacademy.patterns.factory.example.abstractfactory.ingredients.Sauce;

public interface PizzaIngredientsFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Meat createMeat();
}
