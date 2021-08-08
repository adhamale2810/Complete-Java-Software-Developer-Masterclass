package Section_6.Classes;

public class Car {
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;

	public void setData(int doors, int wheels, String model, String engine, String color) {
		// this keyword refers to the current class
		this.doors = doors;
		this.wheels = wheels;
		this.model = model;
		this.engine = engine;
		this.color = color;
	}

	public int getDoors() {
		return doors;
	}

	public int getWheels() {
		return wheels;
	}

	public String getModel() {
		return model;
	}

	public String getEngine() {
		return engine;
	}

	public String getColor() {
		return color;
	}
}