package Section_4;

public class MethodOverloading {
	public static void main(String[] args) {
		int newScore = calculateScore("Tim", 500);
		System.out.println("Final Score: " + newScore);
		calculateScore(75);
		calculateScore();
		System.out.println("Calculator:");
		System.out.println("6 inches = " + calcFeetAndInchectoCentimeters(6) + " cms");
		System.out.println("6 feet 2 inches = " + calcFeetAndInchectoCentimeters(6,2) + " cms");
	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score);
		return score * 1000;
	}

	public static int calculateScore(int score) {
		System.out.println("Unnamed player " + " scored " + score);
		return score * 1000;
	}

	public static void calculateScore() {
		System.out.println("No Player Name, No Player Score");
	}

	/**
	 * Create a method called calcFeetAndInchectoCentimeters It needs to have two
	 * parameters. feet is the first parameter, and inches is the second parameter.
	 * 
	 * You should validate that the first parameter feet is >= 0. You should
	 * validate that the second parameter inches is >=0 and <=12. return -1 from the
	 * method if either of the above is not true.
	 * 
	 * If the parameters are valid, then calculate how many centimetres comprise the
	 * feet and inches passed to this method and return that value.
	 * 
	 * Create a 2nd method of the same name, but with only one paramete inches is
	 * the parameter validate that its >=0. return -1 if it is note true.
	 * 
	 * But if it is valid, then calculate how many feet are in the inches and then
	 * here is the tricky part Call the other overloaded method passing the correct
	 * feet and inches calculated so that it can calculate correctly.
	 * 
	 * hints: Use double for your number datatypes is probably a good idea 1 inch =
	 * 2.54cm and one foot = 12 inches.
	 */

	public static double calcFeetAndInchectoCentimeters(double feet, double inches) {
		if (feet >= 0 && (inches >= 0 && inches <= 12)) {
			double cms = (feet * 12 * 2.54) + (inches * 2.54);
			return cms;
		}
		return -1;
	}

	public static double calcFeetAndInchectoCentimeters(double inches) {
		if (inches>=0) {
			double cms = inches * 2.54;
			return cms;
		}
		return -1;
	}
}