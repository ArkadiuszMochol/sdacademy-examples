package pl.sdacademy.patterns.visitor.example.customers;

import pl.sdacademy.patterns.visitor.example.visitors.CustomerVisitor;

public class VipCustomer extends Customer {

    private String name;
    private int rank;

    public VipCustomer(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public <T> T accept(CustomerVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                "} " + super.toString();
    }
}
