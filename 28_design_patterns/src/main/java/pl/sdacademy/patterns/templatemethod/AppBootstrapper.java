package pl.sdacademy.patterns.templatemethod;

import pl.sdacademy.patterns.templatemethod.example.Car;
import pl.sdacademy.patterns.templatemethod.example.DieselCar;
import pl.sdacademy.patterns.templatemethod.example.GasStation;
import pl.sdacademy.patterns.templatemethod.example.LpgCar;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AppBootstrapper {

	static void start() {
		GasStation gasStation = new GasStation(5.20f, 5.60f, false);
		Car diesel = new DieselCar(gasStation);
		diesel.tankProcedure();

		Car lpg = new LpgCar(gasStation);
		lpg.tankProcedure();

		List<String> imiona = Arrays.asList("Ania", "Basia", "Krysia", "Henryk");

		Iterator<String> imionaIterator = imiona.iterator();

		System.out.println("Czy istnieje kolejny element? " + imionaIterator.hasNext());

		imionaIterator.forEachRemaining(System.out::println);



	}
}
