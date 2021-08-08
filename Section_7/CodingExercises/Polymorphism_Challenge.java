package Section_7.CodingExercises;

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

class Holden extends Car {
	public Holden(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String startEngine() {
		return "Holden -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Holden -> accelerate()";
	}

	@Override
	public String brake() {
		return "Holden -> brake()";
	}
}