package Section_5;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Year of Birth");
		boolean hasNextInt = scanner.hasNextInt();
		if (hasNextInt) {
			int year = scanner.nextInt();
			scanner.nextLine(); // handle next line character i.e. Enter Key

			System.out.println("Enter Your Name");
			String name = scanner.nextLine();
			int age = 2021 - year;

			if (year >= 0 && year == 100) {
				System.out.println("Name: " + name);
				System.out.println("Age: " + age);
			} else {
				System.out.println("Invalid Year of Birth");
			}
		} else {
			System.out.println("Unable to parse Year Of Birth");
		}

		scanner.close();
	}
}