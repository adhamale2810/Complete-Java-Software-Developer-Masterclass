package Section_5;

public class ForStatement {
	public static void main(String[] args) {
		// using the for statement, call the calculateInterest method with
		// the amount of 10000 with an interest rate of 2,3,4,5,6,7,8
		// then print the results to the console window
		for (int r = 2; r <= 8; r++) {
			System.out.println("10,000 at " + r + "% rate: " + calculateInterest(10000, r));
		}

		int count = 0;
		System.out.println("First 10 Prime Numbers:");
		for (int i = 2; i <= 50; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println(i);
				if (count == 10) {
					System.out.println("Exiting for Loop.");
					break;
				}
			}
		}
	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

	// Create a for statement using any range of numbers
	// Determine if the number is Prime Number using isPrime method
	// if it is prime, print it out and increment the count of
	// number of primes found,
	// if the count is 3 exit the for loop
	// Use break statement to exit

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}