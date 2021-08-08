/**
 * Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
 * 
 * The method should not retuen any value
 * 
 * Using a switch statement print "Sunday", "Monday",....,"Saturday" if the int 
 * parameter day is 0,1,.....,6 respectively, otherwise it should print "Invalid day".
 * 
 * Bonus:
 * Write a second solution using if then else, instead of using Switch.
 */

package Section_5;

public class DayOfWeekChallenge {
	public static void main(String[] args) {
		System.out.println("Switch Case:");
		printDayOfTheWeek(0);
		printDayOfTheWeek(1);
		printDayOfTheWeek(2);
		printDayOfTheWeek(3);
		printDayOfTheWeek(4);
		printDayOfTheWeek(5);
		printDayOfTheWeek(6);
		printDayOfTheWeek(7);
		System.out.println();

		System.out.println("IF then ELSE:");
		ifPrintDayofTheWeek(0);
		ifPrintDayofTheWeek(1);
		ifPrintDayofTheWeek(2);
		ifPrintDayofTheWeek(3);
		ifPrintDayofTheWeek(4);
		ifPrintDayofTheWeek(5);
		ifPrintDayofTheWeek(6);
		ifPrintDayofTheWeek(7);
	}

	public static void printDayOfTheWeek(int day) {
		switch (day) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid day");
				break;
		}
	}

	public static void ifPrintDayofTheWeek(int day) {
		if (day == 0) {
			System.out.println("Sunday");
		} else if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else {
			System.out.println("Invalid day");
		}
	}
}
