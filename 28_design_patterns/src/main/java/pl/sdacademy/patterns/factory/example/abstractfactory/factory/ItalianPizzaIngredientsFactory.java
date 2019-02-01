package pl.sdacademy.patterns.factory.example.abstractfactory.factory;

import pl.sdacademy.patterns.factory.example.abstractfactory.ingredients.*;

public class ItalianPizzaIngredientsFactory implements PizzaIngredientsFactory {
    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new OliveSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ParmezanCheese();
    }

    @Override
    public Meat createMeat() {
        return new PepperoniMeat();
    }
}
