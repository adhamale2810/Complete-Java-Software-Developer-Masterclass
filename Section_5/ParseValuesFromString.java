package Section_5;

public class ParseValuesFromString {
	public static void main(String[] args) {
		String numberString = "2018.125";
		System.out.println("Number as a String: " + numberString);

		double number = Double.parseDouble(numberString);
		System.out.println("Number: " + number);

		numberString += 1;
		number += 1;
		System.out.println("Adding 1 to String: " + numberString);
		System.out.println("Adding 1 to Number: " + number);
	}
}