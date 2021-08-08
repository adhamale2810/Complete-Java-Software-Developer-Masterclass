/*
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * Create a Scanner like we did in the previous video
 * Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * If hasNextInt() returns false, print the message "Invalid Number".
 * Continue reading until you have read 10 numbers.
 * Use the nextInt() method to get the number and add it to the sum.
 * Before the user enters a number, print the message: "Enter the number #x:", where x represents the count.
 */

package Section_5;

import java.util.Scanner;

public class UserInputChallenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int sum = 0;
		int number;
		while (true) {
			System.out.print("Enter Number #" + count + " : ");
			boolean hasInt = sc.hasNextInt();
			if (hasInt) {
				number = sc.nextInt();
				sum += number;
				count++;
				if (count == 10) {
					break;
				}
			} else {
				System.out.println("Invalid Number");
			}
			sc.nextLine();
		}
		System.out.println("Sum: " + sum);

		sc.close();
	}
}