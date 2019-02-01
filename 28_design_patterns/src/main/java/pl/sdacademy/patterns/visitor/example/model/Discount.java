package pl.sdacademy.patterns.visitor.example.model;

public class Discount {

    private float discount;

    public Discount(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "discount=" + discount +
                '}';
    }
}
