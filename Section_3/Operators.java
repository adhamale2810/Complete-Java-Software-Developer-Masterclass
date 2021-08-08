package Section_3;

public class Operators {
	public static void main(String[] args) {
		int result = 1 + 2; // 1 + 2 = 3
		System.out.println("1 + 2 : " + result); // 3

		int previousResult = result;
		System.out.println("Previous Result : " + previousResult); // 3

		result = result - 1;
		System.out.println("3 - 1 : " + result); // 2

		result = result * 10;
		System.out.println("2 * 10 : " + result); // 20

		result = result / 5;
		System.out.println("20 / 5 : " + result); // 4

		result = result % 3;
		System.out.println("4 % 3 : " + result); // 1

		// result = result + 1
		result++;
		System.out.println("1 + 1 : " + result); // 2

		// result = result - 1
		result--;
		System.out.println("2 - 1 : " + result); // 1

		// result = result + 2;
		result += 2;
		System.out.println("1 + 2 : " + result); // 3

		// result = result * 10
		result *= 10;
		System.out.println("3 * 10 : " + result); // 30

		// result = result / 3
		result /= 3;
		System.out.println("30 / 3 : " + result); // 10

		// result = result - 2
		result -= 2;
		System.out.println("10 - 2 : " + result); // 8

		boolean isAlien = false;
		if (isAlien == false)
			System.out.println("Not an Alien");
		System.out.println("And I am scared of Aliens");

		int topScore = 100;
		if (topScore == 100) {
			System.out.println("You got the Highest Score!");
		}

		int secondScore = 60;
		if ((topScore > secondScore) && (topScore < 100)) {
			System.out.println("Greater than Second top Score and less than 100");
		}

		if ((topScore > 90) || (secondScore <= 90)) {
			System.out.println("Greater than 90 or Less than or Equal to  90");
		}

		boolean isCar = true;
		if (isCar) {
			System.out.println("Prints only if true");
		}

		boolean wasCar = isCar ? true : false;
		if (wasCar) {
			System.out.println("Prints only if the previous line gets printed");
		}

		int age = 20;
		boolean ageOfClient = age == 20 ? true : false;
		if(ageOfClient){
			System.out.println("Age of Client is 20");
		}
	}
}