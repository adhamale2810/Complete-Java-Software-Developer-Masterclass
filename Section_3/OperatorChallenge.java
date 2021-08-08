package Section_3;

public class OperatorChallenge {
	public static void main(String[] args) {
		double val1 = 20.00;
		System.out.println("Value 1: " + val1);
		double val2 = 80.00;
		System.out.println("Value 2: " + val2);
		double addmulti = (val1 + val2) * 100;
		System.out.println("Final Number: " + addmulti);
		double remainder = addmulti % 40.00;
		System.out.println("Remainder: " + remainder);
		boolean check = (remainder == 0) ? true : false;
		System.out.println("Boolean Value: " + check);
		if (!check) {
			System.out.println("Got some remainder");
		}
	}
}