package pl.sdacademy.patterns.visitor;

import com.sun.javafx.collections.MappingChange;
import pl.sdacademy.patterns.visitor.example.customers.Customer;
import pl.sdacademy.patterns.visitor.example.customers.GroupCustomer;
import pl.sdacademy.patterns.visitor.example.customers.NormalCustomer;
import pl.sdacademy.patterns.visitor.example.customers.VipCustomer;
import pl.sdacademy.patterns.visitor.example.model.Invitation;
import pl.sdacademy.patterns.visitor.example.visitors.InvitationLetterVisitor;

import java.security.acl.Group;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppBootstrapper {

	static void start() {
		List<Customer> customers = Arrays.asList(
				new NormalCustomer(),
				new VipCustomer("Frank", 3),
				new VipCustomer("Jessie", 9),
		        new GroupCustomer(Arrays.asList("Ann", "John", "Nancy"))
		);

		final InvitationLetterVisitor invitationLetterVisitor = new InvitationLetterVisitor();

		Map<Customer, Invitation> customersWithInvitations = customers.stream()
				.collect(Collectors.toMap(customer -> customer, customer -> customer.accept(invitationLetterVisitor)));

		System.out.println(customersWithInvitations);
	}
}
