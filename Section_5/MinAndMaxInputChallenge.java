/**
 * Read the numbers from the console entered by the user and print the minimum and maximum 
 * number the user has entered.
 * Before the user enters the number, print the message "Enter number".
 * If the user enters an Invalid Number, break out of the loop and print the minimum 
 * and maximum number.
 * Hint:
 * 	Use an endless while loop
 */

package Section_5;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		boolean hasInt = false;
		while (true) {
			System.out.print("Enter Number: ");
			hasInt = sc.hasNextInt();
			if (hasInt) {
				int number = sc.nextInt();
				if (number > max) {
					max = number;
				}
				if (number < min) {
					min = number;
				}
			} else {
				break;
			}
		}
		System.out.println("Max Number: " + max);
		System.out.println("Min Number: " + min);

		sc.close();
	}
}