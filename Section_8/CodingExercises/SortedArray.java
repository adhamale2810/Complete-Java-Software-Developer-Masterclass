package Section_8.CodingExercises;

import java.util.Scanner;

public class SortedArray {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int count;
		System.out.print("Enter number of elements: ");
		count = sc.nextInt();
		int[] arr = getIntegers(count);
		printArray(arr);
		System.out.println("Sorted Array:");
		int[] sorted = sortIntegers(arr);
		printArray(sorted);
	}

	public static int[] getIntegers(int count) {
		int[] arr = new int[count];
		System.out.println("Enter the Numbers:");
		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element " + i + " contents " + arr[i]);
		}
	}

	public static int[] sortIntegers(int[] arr) {
		int[] sorted = arr;
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < sorted.length - 1; i++) {
				if (sorted[i] < sorted[i + 1]) {
					temp = sorted[i];
					sorted[i] = sorted[i + 1];
					sorted[i + 1] = temp;
					flag = true;
				}
			}
		}
		return sorted;
	}
}