/**
 * Write a method named printSquareStar with one parameter of type int named
 * number.
 * 
 * If number is < 5, the method should print "Invalid Value".
 * 
 * The method should print diagonals to generate a rectangular pattern composed
 * of stars (*). This should be accomplished by using loops (see examples
 * below).
 * 
 * 
 * EXAMPLE INPUT/OUTPUT:
 * 
 * EXAMPLE 1
 * 
 * printSquareStar(5); should print the following:
 * 
 * → NOTE: For text in Code Blocks below, use code icon {...} on Udemy
 * *****  5 stars
 * ** **  2 stars space 2 stars
 * * * *  star space star space star
 * ** **  2 stars space 2 stars
 * *****  5 stars
 *  
 * Explanation:
 * 
 * EXAMPLE 2
 * 
 * printSquareStar(8); should print the following:
 * ********  
 * **    **
 * * *  * *
 * *  **  *
 * * *  * *
 * **    **
 * ********
 * 
 * 
 * The patterns above consist of a number of rows and columns (where number is
 * the number of rows to print). For each row or column, stars are printed based
 * on four conditions (Read them carefully):
 * 
 * In the first or last row: print stars
 * 
 * In the first or last column: print stars
 * 
 * When the row number equals the column number: print star
 * 
 * When the column number equals rowCount - currentRow + 1 (where currentRow is
 * current row number):  print star
 * 
 * else:  print space
 * 
 * 
 * HINT: Use a nested loop (a loop inside of a loop).
 * 
 * HINT: To print on the same line, use the print method instead of println,
 * e.g. System.out.print(" "); prints a space and does not "move" to another
 * line.
 * 
 * HINT: To "move" to another line, you can use an empty println call, e.g.
 * System.out.println(); .
 * 
 * NOTE: The method printSquareStar should be defined as public static like we
 * have been doing so far in the course.
 * 
 * NOTE: Do not add a main method to the solution code.
 */

package Section_5.CodingExercises;

public class DiagonalStar {
	public static void main(String[] arts) {
		printSquareStar(5);
	}

	public static void printSquareStar(int number) {
		if (number < 5) {
			System.out.println("Invalid Value");
		} else {
			for (int i = 0; i < number; i++) {
				for (int j = 0; j < number; j++) {
					if (i == 0 || j == 0 || i == j || i == (number - 1) || j == number - 1 || i + j == (number - 1)) {
						System.out.print("*");
					}
					// none of these operations work then just leave a space
					// on that column
					else {
						System.out.print(" ");
					}
				}
				// creates a new row
				System.out.println();
			}
		}
	}
}
