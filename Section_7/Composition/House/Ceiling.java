package Section_7.Composition.House;

public class Ceiling {
	private int height;
	private String color;

	public Ceiling(int height, String color) {
		this.height = height;
		this.color = color;
	}

	public int getHeight() {
		return height;
	}

	public String getColor() {
		return color;
	}

	public void installCeiling() {
		System.out.println("Ceiling: height " + height + " Color " + color);
		System.out.println("Ceiling created");
	}
}