package pl.sdacademy.patterns.decorator.example;

public class BlackCoffee implements Coffee {

    private static final String DESCRIPTION = "Black coffee";
    private static final float PRICE = 3.99f;

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public float getPrice() {
        return PRICE;
    }
}
