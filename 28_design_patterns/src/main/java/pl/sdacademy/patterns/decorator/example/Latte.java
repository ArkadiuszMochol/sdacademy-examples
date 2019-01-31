package pl.sdacademy.patterns.decorator.example;

public class Latte implements Coffee {

    private static final String DESCRIPTION = "Latte coffee";
    private static final float PRICE = 4.99f;

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public float getPrice() {
        return PRICE;
    }
}
