package Section_5;

public class WhileDowhileStatements {
	public static void main(String[] args) {
		/**
		 * Create a while loop to check if number is even
		 * keep a count of total number of even numbers found
		 * and break once 5 such numbers are found
		 * and at end, display the total number of even numbers found.
		 */
		int count = 0;
		int start = 4;
		int end = 20;
		while(start <= end){
			start++;
			if(!isEvenNumber(start)){
				continue;
			}
			count++;
			System.out.println("Number is " + start);
			if(count == 5){
				break;
			}
		}
		System.out.println("Total number of even numbers found: " + count);
	}

	/**
	 * Create a method called isEvenNumber that takes a parameter of type int its
	 * purpose is to determine if the argument passed to the method is an even
	 * number or not. return true if an even number, otherwise return false;
	 */

	public static boolean isEvenNumber(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}