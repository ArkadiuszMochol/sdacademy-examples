package pl.sdacademy.patterns.decorator.example;

public class MilkCoffeeDecorator implements Coffee {

    private static final String ADDITIONAL_DESCRIPTION = " + milk";
    private static final float ADDITIONAL_PRICE = 0.5f;

    private Coffee coffee;

    public MilkCoffeeDecorator(Coffee coffee) {
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
