package pl.sdacademy.patterns.visitor.example.visitors;

import pl.sdacademy.patterns.visitor.example.customers.GroupCustomer;
import pl.sdacademy.patterns.visitor.example.customers.NormalCustomer;
import pl.sdacademy.patterns.visitor.example.customers.VipCustomer;

public interface CustomerVisitor<T> {
    T visit(NormalCustomer customer);
    T visit(VipCustomer customer);
    T visit(GroupCustomer customer);
}