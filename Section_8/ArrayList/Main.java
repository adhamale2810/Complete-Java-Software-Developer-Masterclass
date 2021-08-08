package Section_8.ArrayList;

import java.util.*;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		while (!quit) {
			printInstructions();
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
				case 0:
					printInstructions();
					break;
				case 1:
					addItem();
					break;
				case 2:
					updateItem();
					break;
				case 3:
					removeItem();
					break;
				case 4:
					searchItem();
					break;
				case 5:
					printList();
					break;
				case 6:
					quit = true;
					break;
				default:
					System.out.println("Invalid Input");
					break;
			}
		}
	}

	private static void printInstructions() {
		System.out.println("0. Read Instructions");
		System.out.println("1. Add Item");
		System.out.println("2. Update Item");
		System.out.println("3. Remove Item");
		System.out.println("4. Search Item");
		System.out.println("5. Print List");
		System.out.println("6. Quit");
	}

	private static void addItem() {
		System.out.print("Enter New Item: ");
		GroceryList.addGroceryItem(sc.nextLine());
	}

	private static void updateItem() {
		System.out.println("Enter Item to Update: ");
		String str1 = sc.nextLine();
		System.out.println("Enter New Item: ");
		String str2 = sc.nextLine();
		GroceryList.updateGroceryItem(str1, str2);
	}

	private static void removeItem() {
		System.out.print("Enter Item: ");
		GroceryList.removeGroceryItem(sc.nextLine());
	}

	private static void searchItem() {
		System.out.print("Enter Item to search: ");
		System.out.println(GroceryList.searchGroceryItem(sc.nextLine()));
	}

	private static void printList() {
		System.out.println();
		GroceryList.printGroceryList();
		System.out.println();
	}
}