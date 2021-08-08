package Section_6.Classes;

public class Main {
	public static void main(String[] args) {
		Car porsche = new Car();
		porsche.setData(2, 4, "Carerra", "v8", "Red");
		System.out.println("Porsche");
		System.out.println("Model: " + porsche.getModel());
		System.out.println("Engine: " + porsche.getEngine());
		System.out.println("Color: " + porsche.getColor());
		System.out.println("Doors: " + porsche.getDoors());
		System.out.println("Wheels: " + porsche.getWheels());
	}
}