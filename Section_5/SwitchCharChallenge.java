/**
 * Create a new switch statement using char instead of int
 * create a new char variable
 * create a switch statement testing for
 * A, B, C, D, or E
 * display a message if any of these are found and then break
 * Add a default which displays a message saying not found
 */

package Section_5;

public class SwitchCharChallenge {
	public static void main(String[] args) {
		char switchValue = 'A';
		switch (switchValue) {
			case 'A':
				System.out.println("Character is 'A'");
				break;
			case 'B':
				System.out.println("Character is 'B'");
				break;
			case 'C':
				System.out.println("Character is 'C'");
				break;
			case 'D':
				System.out.println("Character is 'D'");
				break;
			case 'E':
				System.out.println("Character is 'E'");
				break;
			default:
				System.out.println("Not Found");
				break;
		}


		String month = "January";
		switch(month){
			case "January": case "February": case "March": case "April": case "May": case "June": case "July":
			case "August": case "September": case "October": case "November": case "December":
				System.out.println("Month is "+ month);
				break;
			default:
				System.out.println("Not a Month");
				break;
		}
	}
}