package Section_6.Inheritance.Lecture_Challenge;

public class Car extends Vehicle {
	private int gears;
	private int wheels;
	private int doors;
	private boolean isManual;
	private int currentGear;

	public Car(int size, int gears, int wheels, int doors, boolean isManual) {
		super(size, 0, 0);
		this.gears = gears;
		this.wheels = wheels;
		this.doors = doors;
		this.isManual = isManual;
		this.currentGear = 1;
	}

	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.changeGear changed gear to " + currentGear);
	}

	public void changeVelocity(int speed, int direction) {
		System.out.println("Car.changeVelocity() changed speed to " + speed + " in direction " + direction);
		move(speed, direction);
	}

	public int getGears() {
		return gears;
	}

	public int getWheels() {
		return wheels;
	}

	public int getDoors() {
		return doors;
	}

	public boolean getIsManual() {
		return isManual;
	}

	public int getCurrentGear() {
		return currentGear;
	}
}