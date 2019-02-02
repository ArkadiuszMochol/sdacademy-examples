package pl.sdacademy.patterns.facade.example;

public class SmartHomeFacade {

    private AudioSystem audioSystem;
    private CoffeeMaker coffeeMaker;
    private GarageDoor garageDoor;
    private Light light;

    public SmartHomeFacade(AudioSystem audioSystem, CoffeeMaker coffeeMaker, GarageDoor garageDoor, Light light) {
        this.audioSystem = audioSystem;
        this.coffeeMaker = coffeeMaker;
        this.garageDoor = garageDoor;
        this.light = light;
    }

    public void enterHome() {
        System.out.printf("### SmartHomeFacade: the owners is entering the house - lets welcome them! ###");
        garageDoor.open();
        audioSystem.turnOn();
        audioSystem.setVolume(20);
        audioSystem.playMusic(AudioSystem.MusicKind.JAZZ);
        light.turnOn();
        light.setIntensivity(30);
        coffeeMaker.turnOn();
        coffeeMaker.makeCoffee(2);
        coffeeMaker.turnOff();
    }

    public void leaveHome() {
        System.out.println("### SmartHomeFacade: the owners are leaving the home - turn everything off ###");
        audioSystem.turnOff();
        light.turnOff();
        coffeeMaker.turnOff();
        garageDoor.close();
    }

    public void party() {
        System.out.println("### SmartHomeFacade: lets start the party! ###");
        garageDoor.open();
        audioSystem.turnOn();
        audioSystem.setVolume(100);
        audioSystem.playMusic(AudioSystem.MusicKind.HOUSE);
        coffeeMaker.turnOn();
        coffeeMaker.makeCoffee(18);
    }

}
