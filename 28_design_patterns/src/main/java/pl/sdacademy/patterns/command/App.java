package pl.sdacademy.patterns.command;

import pl.sdacademy.patterns.builder.AppBootstrapper;
import pl.sdacademy.patterns.command.example.*;
import pl.sdacademy.patterns.factory.example.factorymethod.pizza.Pizza;

public class App {

	public static void main(String[] args) {

		Pilot pilot = new Pilot();
		pilot.defineNewCommand(1, new TvCommand(new Tv()));
		pilot.defineNewCommand(2, new AudioCommand(new AudioSystem()));

		pilot.push(1);
		pilot.push(1);
		pilot.push(1);
		pilot.push(1);

		pilot.push(2);


	}
}
