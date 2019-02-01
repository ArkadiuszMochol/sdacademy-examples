package pl.sdacademy.patterns.visitor.example.customers;

import pl.sdacademy.patterns.visitor.example.visitors.CustomerVisitor;

public abstract class Customer {
    public abstract <T> T accept(CustomerVisitor<T> visitor);

    @Override
    public String toString() {
        return "Customer{}";
    }
}
