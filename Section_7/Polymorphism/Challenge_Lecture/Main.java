package Section_7.Polymorphism.Challenge_Lecture;

class Car {
	private String name;
	private boolean engine;
	private int cylinders;
	private int wheels;

	public Car(String name, int cylinders) {
		this.engine = true;
		this.name = name;
		this.cylinders = cylinders < 0 ? 0 : cylinders;
		this.wheels = 4;
	}

	public String getName() {
		return name;
	}

	public int getCylinders() {
		return cylinders;
	}

	public String startEngine() {
		return "Car -> startEngine()";
	}

	public String accelerate() {
		return "Car -> accelerate()";
	}

	public String brake() {
		return "Car -> brake()";
	}
}

class Mitsubishi extends Car {
	public Mitsubishi(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String startEngine() {
		return "Mitsubishi -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Mitsubishi -> accelerate()";
	}

	@Override
	public String brake() {
		return "Mitsubishi -> brake()";
	}
}

class Ford extends Car {
	public Ford(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String startEngine() {
		return "Ford -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Ford -> accelerate()";
	}

	@Override
	public String brake() {
		return "Ford -> brake()";
	}
}

class Porsche extends Car {
	public Porsche(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String startEngine() {
		return "Porsche -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Porsche -> accelerate()";
	}

	@Override
	public String brake() {
		return "Porsche -> brake()";
	}
}

public class Main {
	public static void main(String[] args) {
		Mitsubishi mitsubishi = new Mitsubishi("someMitsubishi", 6);
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake() + "\n");

		Ford ford = new Ford("someFord", 6);
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake() + "\n");

		Porsche porsche = new Porsche("somePorsche", 6);
		System.out.println(porsche.startEngine());
		System.out.println(porsche.accelerate());
		System.out.println(porsche.brake());
	}
}