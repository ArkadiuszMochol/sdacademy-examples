package pl.sdacademy.patterns.decorator.example;

public interface Coffee {
    String getDescription();
    float getPrice();
    default void describe()  {
        System.out.println(String.format("%s (cost: %.2f)", getDescription(), getPrice()));
    }
}
