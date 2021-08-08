package Section_3;

public class FloatDouble {
	public static void main(String[] args) {
		float minFloatValue = Float.MIN_VALUE;
		float maxFloatValue = Float.MAX_VALUE;
		System.out.println("Maximum Float Value: " + maxFloatValue);
		System.out.println("Minimum Float Value: " + minFloatValue);
		System.out.println();

		double minDoubleValue = Double.MIN_VALUE;
		double maxDoubleValue = Double.MAX_VALUE;
		System.out.println("Maximum Double Value: " + maxDoubleValue);
		System.out.println("Minimum Double Value: " + minDoubleValue);
		System.out.println();

		// double is the default data type for a floating point number
		// type casting 5.25 to float value
		float myFloatValue = (float)5.25;
		double myDoubleValue = 5.25;

		System.out.println("Float Value: " + myFloatValue);
		System.out.println("Double Value: " + myDoubleValue);
	}
}