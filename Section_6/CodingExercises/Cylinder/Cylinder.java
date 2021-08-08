package Section_6.CodingExercises.Cylinder;

public class Cylinder extends Circle {
	private double height;

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height < 0 ? 0 : height;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return super.getArea() * height;
	}

	public static void main(String[] args) {
		Circle circle = new Circle(3.75);
		System.out.println("circle.radius= " + circle.getRadius()); // 3.75
		System.out.println("circle.area= " + circle.getArea()); // 44.178646691106465
		Cylinder cylinder = new Cylinder(5.55, 7.25);
		System.out.println("cylinder.radius= " + cylinder.getRadius()); // 5.55
		System.out.println("cylinder.height= " + cylinder.getHeight()); // 7.25
		System.out.println("cylinder.area= " + cylinder.getArea()); // 96.76890771219959
		System.out.println("cylinder.volume= " + cylinder.getVolume()); // 701.574580913447
	}
}