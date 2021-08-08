package Section_8.Arrays;

import java.util.Scanner;

public class Array {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = getIntegers(5);
		System.out.println("Elements:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Average: " + getAverage(arr));
	}

	public static int[] getIntegers(int number) {
		int[] values = new int[number];
		System.out.println("Enter Numbers:");
		for (int i = 0; i < values.length; i++) {
			values[i] = sc.nextInt();
		}
		return values;
	}

	public static double getAverage(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (sum / arr.length);
	}
}