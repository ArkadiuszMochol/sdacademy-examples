package pl.sdacademy.patterns.visitor.example.customers;

import pl.sdacademy.patterns.visitor.example.visitors.CustomerVisitor;

import java.util.List;

public class GroupCustomer extends Customer {

    List<String> groupMembers;

    public GroupCustomer(List<String> groupMembers) {
        this.groupMembers = groupMembers;
    }

    @Override
    public <T> T accept(CustomerVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public List<String> getGroupMembers() {
        return groupMembers;
    }

    @Override
    public String toString() {
        return "GroupCustomer{" +
                "groupMembers=" + groupMembers +
                "} " + super.toString();
    }
}
