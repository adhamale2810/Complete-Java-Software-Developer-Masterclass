package Section_8.ArrayList;

import java.util.ArrayList;

public class GroceryList {

	private static ArrayList<String> groceryList = new ArrayList<String>();

	// Implement Encapsulation
	public static void addGroceryItem(String item) {
		groceryList.add(item);
	}

	public static void updateGroceryItem(String str1, String str2) {

		if (groceryList.contains(str1)) {
			int position = groceryList.indexOf(str1);
			groceryList.set(position, str2);
		} else {
			System.out.println("null");
			return;
		}
	}

	public static void removeGroceryItem(String item) {
		if (groceryList.contains(item)) {
			int position = groceryList.indexOf(item);
			groceryList.remove(position);
		} else {
			System.out.println("null");
		}
	}

	public static String searchGroceryItem(String item) {
		// boolean exists = groceryList.contains(item);
		int position = groceryList.indexOf(item);
		if (position >= 0) {
			return groceryList.get(position);
		}
		return null;
	}

	public static void printGroceryList() {
		System.out.println("Elements in the list: " + groceryList.size());
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i + 1) + ". " + groceryList.get(i));
		}
	}

	public static void main(String[] args) {

	}
}