package pl.sdacademy.patterns.factory;

import pl.sdacademy.patterns.factory.example.factorymethod.pizza.Pizza;
import pl.sdacademy.patterns.factory.example.factorymethod.pizzeria.AmericanPizzeria;
import pl.sdacademy.patterns.factory.example.factorymethod.pizzeria.ItalianPizzeria;
import pl.sdacademy.patterns.factory.example.factorymethod.pizzeria.Pizzeria;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppBootstrapper {

	static void start() {

		List<String> types = Arrays.asList("pepperoni", "serowa", "owoce_morza");

		System.out.println("### Metoda fabrykująca ###");
		final Pizzeria americanPizzeria = new AmericanPizzeria();

		List<Pizza> pizzas = types.stream().map(type -> americanPizzeria.orderPizza(type))
				.collect(Collectors.toList());

		final Pizzeria italianPizzeria = new ItalianPizzeria();
		pizzas.addAll(
				types.stream().map(type -> italianPizzeria.orderPizza(type))
						.collect(Collectors.toList())
		);
	}
}
