package pl.sdacademy.patterns.factory.example.abstractfactory.factory;

import pl.sdacademy.patterns.factory.example.abstractfactory.ingredients.*;

public class AmericanPizzaIngredientsFactory implements PizzaIngredientsFactory {
    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new BarbequeSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Meat createMeat() {
        return new BeefMeat();
    }
}
