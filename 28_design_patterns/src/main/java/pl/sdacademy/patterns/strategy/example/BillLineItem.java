package pl.sdacademy.patterns.strategy.example;

public class BillLineItem {

    private String name;
    private int price;

    public BillLineItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
