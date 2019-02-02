package pl.sdacademy.patterns.facade;

import pl.sdacademy.patterns.facade.example.*;

public class AppBootstrapper {

	static void start() {
		SmartHomeFacade smartHomeFacade = new SmartHomeFacade(
				new AudioSystemImpl(),
				new CoffeeMakerImpl(),
				new GarageDoorImpl(),
				new LightImpl());

		smartHomeFacade.enterHome();

		smartHomeFacade.party();

		smartHomeFacade.leaveHome();
	}
}
