package pl.sdacademy.patterns.visitor.example.visitors;

import pl.sdacademy.patterns.visitor.example.customers.GroupCustomer;
import pl.sdacademy.patterns.visitor.example.customers.NormalCustomer;
import pl.sdacademy.patterns.visitor.example.customers.VipCustomer;
import pl.sdacademy.patterns.visitor.example.model.Discount;

public class DiscountVisitor implements CustomerVisitor<Discount> {
    @Override
    public Discount visit(NormalCustomer customer) {
        return new Discount(0.1f);
    }

    @Override
    public Discount visit(VipCustomer customer) {
        return new Discount((customer.getRank() > 5) ? 0.2f : 0.15f);
    }

    @Override
    public Discount visit(GroupCustomer customer) {
        float discountAmount = Math.min(0.3f, customer.getGroupMembers().size() * 0.05f);
        return new Discount(discountAmount);
    }
    /*
    NormalCustomer -> 0.1f (10%)
    Vip -> rank > 5 ? 0.2 : 0.15
    Group -> groupsize * 0.05 (maksymalnie 0.3)
     */
}
