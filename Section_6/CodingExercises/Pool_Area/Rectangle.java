package Section_6.CodingExercises.Pool_Area;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle(double width, double length) {
		this.width = width < 0 ? 0 : width;
		this.length = length < 0 ? 0 : length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double getArea() {
		return length * width;
	}
}