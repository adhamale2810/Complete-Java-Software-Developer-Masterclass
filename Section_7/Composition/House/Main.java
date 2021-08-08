package Section_7.Composition.House;

public class Main {
	public static void main(String[] args) {
		Wall wall1 = new Wall("East");
		Wall wall2 = new Wall("West");
		Wall wall3 = new Wall("North");
		Wall wall4 = new Wall("South");

		Ceiling ceiling = new Ceiling(100, "White");

		Door door = new Door(50, 30, "Wood");

		Window window = new Window(true, 10, 5);

		Bed bed = new Bed("Modern", 4, 20, 2, 2);

		Lamp lamp = new Lamp("Classic", true, 5);

		Bedroom bedroom = new Bedroom(wall1, wall2, wall3, wall4, ceiling, bed, lamp, door, window);

		bedroom.makeBed();
		bedroom.getLamp().installLamp();
		bedroom.getLamp().turnOn();
		bedroom.getLamp().turnOff();
	}
}