package pl.sdacademy.patterns.command;

import pl.sdacademy.patterns.command.example.*;

public class App {

	public static void main(String[] args) {

		Pilot pilot = new Pilot();
		pilot.defineNewCommand(1, new TvCommand(new Tv()));
		pilot.defineNewCommand(2, new AudioCommand(new AudioSystem()));
		pilot.defineNewCommand(3, new GateCommand(new Gate()));

		pilot.push(1);
		pilot.push(1);
		pilot.push(1);
		pilot.push(3);
		pilot.push(3);

		pilot.push(2);
		pilot.push(2);


	}
}
