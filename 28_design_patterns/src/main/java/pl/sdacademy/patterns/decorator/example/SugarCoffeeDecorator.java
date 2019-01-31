package pl.sdacademy.patterns.decorator.example;

public class SugarCoffeeDecorator implements Coffee {

    private static final String ADDITIONAL_DESCRIPTION = " + sugar";
    private static final float ADDITIONAL_PRICE = 0.5f;

    private Coffee coffee;

    public SugarCoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ADDITIONAL_DESCRIPTION;
    }

    @Override
    public float getPrice() {
        return coffee.getPrice() + ADDITIONAL_PRICE;
    }
}
