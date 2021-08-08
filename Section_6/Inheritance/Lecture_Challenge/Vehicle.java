package Section_6.Inheritance.Lecture_Challenge;

public class Vehicle {
	private int size;
	private int currentDirection;
	private int currentSpeed;

	public Vehicle() {
		this(0, 0, 0);
	}

	public Vehicle(int size, int currentDirection, int currentSpeed) {
		this.size = size;
		this.currentDirection = currentDirection;
		this.currentSpeed = currentSpeed;
	}

	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("Vehicle.Steer steering at " + currentDirection);
	}

	public void move(int speed, int direction) {
		currentSpeed = speed;
		currentDirection = direction;
		System.out.println("Vehicle.Move() moving at " + currentSpeed + " in the direction " + currentDirection);
	}

	public void stop() {
		this.currentSpeed = 0;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public int getSize() {
		return size;
	}
}