package pl.sdacademy.patterns.decorator;

import pl.sdacademy.patterns.decorator.example.*;

public class AppBootstrapper {

	static void start() {

		Coffee blackCoffee = new BlackCoffee();
		blackCoffee.describe();

		Coffee blackCoffeeWithMilk = new MilkCoffeeDecorator(blackCoffee);
		blackCoffeeWithMilk.describe();

		Coffee latte = new Latte();
		latte.describe();

		Coffee latteExtraMilk = new MilkCoffeeDecorator(latte);
		Coffee latteExtraMilkAndSugar = new SugarCoffeeDecorator(latteExtraMilk);
		latteExtraMilkAndSugar.describe();

		Coffee latteeExtraMilkDoubleSugar = new SugarCoffeeDecorator(latteExtraMilkAndSugar);
		latteeExtraMilkDoubleSugar.describe();

	}
}
