package pl.sdacademy.patterns.observer;

import pl.sdacademy.patterns.observer.example.*;

public class AppBootstrapper {

	static void start() {
		TemperatureService tempSensor = new TemperatureService();
		tempSensor.simulateTemperatureChange(10);

		Subscriber clock = new Clock();
		Subscriber weatherStation = new WeatherStation();

		tempSensor.subscribe(clock);
		tempSensor.subscribe(weatherStation);

		tempSensor.simulateTemperatureChange(25);

		tempSensor.unsubscribe(clock);
		tempSensor.simulateTemperatureChange(30);
	}
}
