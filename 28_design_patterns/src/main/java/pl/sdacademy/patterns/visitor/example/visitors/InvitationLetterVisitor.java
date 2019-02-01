package pl.sdacademy.patterns.visitor.example.visitors;

import pl.sdacademy.patterns.visitor.example.customers.GroupCustomer;
import pl.sdacademy.patterns.visitor.example.customers.NormalCustomer;
import pl.sdacademy.patterns.visitor.example.customers.VipCustomer;
import pl.sdacademy.patterns.visitor.example.model.Invitation;

public class InvitationLetterVisitor implements CustomerVisitor<Invitation> {
    @Override
    public Invitation visit(NormalCustomer customer) {
        return new Invitation("Welcome dear customer! We'd like to invite you for our new promotion...");
    }

    @Override
    public Invitation visit(VipCustomer customer) {
        if (customer.getRank() > 5) {
            return new Invitation(customer.getName() + " -  our lovely, best of the best cutomers! Come for special offers just for you!");
        } else {
            return new Invitation("We have a special offer for you, dear " + customer.getName());
        }
    }

    @Override
    public Invitation visit(GroupCustomer customer) {
        return new Invitation(String.format("We'd like to invite your group for our new promotions: " + String.join(", ", customer.getGroupMembers())));
    }
}
