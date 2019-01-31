package pl.sdacademy.patterns.facade;

import pl.sdacademy.patterns.facade.example.*;

public class AppBootstrapper {

	static void start() {
		SmartHome smartHome = new SmartHome(
				new AudioSystemImpl(),
				new CoffeeMakerImpl(),
				new GarageDoorImpl(),
				new LightImpl());

		smartHome.enterHome();

		smartHome.party();

		smartHome.leaveHome();
	}
}
