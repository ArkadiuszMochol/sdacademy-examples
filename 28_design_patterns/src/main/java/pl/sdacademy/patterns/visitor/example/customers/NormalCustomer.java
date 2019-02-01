package pl.sdacademy.patterns.visitor.example.customers;

import pl.sdacademy.patterns.visitor.example.visitors.CustomerVisitor;

public class NormalCustomer extends Customer {
    @Override
    public <T> T accept(CustomerVisitor<T> visitor){
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "NormalCustomer{} " + super.toString();
    }
}
