/**
 * Write a class with the name SimpleCalculator. The class needs two fields
 * (instance variables) with names firstNumber and secondNumber both of type
 * double.
 * 
 * Write the following methods (instance methods):
 * A complex number is a number that can be expressed in the form a + bi, where a and b are real numbers, and i is a solution of the equation x2 = −1. Because no real number satisfies this equation, i is called an imaginary number. For the complex number a + bi, a is called the real part, and b is called the imaginary part. To add or subtract two complex numbers, just add or subtract the corresponding real and imaginary parts. For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another, the sum of 3 + i and –1 + 2i is 2 + 3i.

Write a class with the name ComplexNumber. The class needs two fields (instance variables) with name real and imaginary of type double. It represents the Complex Number.

The class needs to have one constructor. The constructor has parameters real and imaginary of type double and it needs to initialize the fields.

Write the following methods (instance methods):
* Method named getReal without any parameters, it needs to return the value of real field.
* Method named getImaginary without any parameters, it needs to return the value of imaginary field.
* Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields. In other words, it needs to do a complex number add operation as described above.
* Method named add with one parameter of type ComplexNumber. It needs to add the ComplexNumber parameter to the corresponding instance variables.
* Method named subtract with two parameters real and imaginary of type double, it needs to subtract parameters from fields, in other words, it needs to do a complex number subtract operation as described above.
* Method named subtract with one parameter other of type ComplexNumber. It needs to subtract the other parameter from this complex number.


TEST EXAMPLE

→ TEST CODE:

ComplexNumber one = new ComplexNumber(1.0, 1.0);
ComplexNumber number = new ComplexNumber(2.5, -1.5);
one.add(1,1);
System.out.println("one.real= " + one.getReal());
System.out.println("one.imaginary= " + one.getImaginary());
one.subtract(number);
System.out.println("one.real= " + one.getReal());
System.out.println("one.imaginary= " + one.getImaginary());
number.subtract(one);
System.out.println("number.real= " + number.getReal());
System.out.println("number.imaginary= " + number.getImaginary());

→ OUTPUT

one.real= 2.0
one.imaginary= 2.0
one.real= -0.5
one.imaginary= 3.5
number.real= 3.0
number.imaginary= -5.0


NOTE: Try to avoid duplicated code.

NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 6 methods.

NOTE: Do not add a main method to the solution code.umber without any parameters, it needs to return the
 * value of firstNumber field. 
 * Method named getSecondNumber without any
 * parameters, it needs to return the value of secondNumber field. 
 * Method named setFirstNumber with one parameter of type double, it needs to set the value
 * of the firstNumber field.
 * Method named setSecondNumber with one parameter of type double,
 * it needs to set the value of the secondNumberfield. 
 * Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * Method named getSubtractionResult without any parameters, 
 * it needs to return the result of subtracting the field values of secondNumber from the firstNumber. 
 * Method named getMultiplicationResult without any parameters, it needs to return the
 * result of multiplying the field values of firstNumber and secondNumber.
 * Method named getDivisionResult without any parameters it needs to return the
 * result of dividing the field values of firstNumber by the secondNumber.
 * In case the value of secondNumber is 0 then return 0.
 * 
 * TEST EXAMPLE
 * 
 * TEST CODE:
 * 
 * SimpleCalculator calculator = new SimpleCalculator();
 * calculator.setFirstNumber(5.0); calculator.setSecondNumber(4);
 * System.out.println("add= " + calculator.getAdditionResult());
 * System.out.println("subtract= " + calculator.getSubtractionResult());
 * calculator.setFirstNumber(5.25); calculator.setSecondNumber(0);
 * System.out.println("multiply= " + calculator.getMultiplicationResult());
 * System.out.println("divide= " + calculator.getDivisionResult());
 * 
 * OUTPUT
 * 
 * add= 9.0 subtract= 1.0 multiply= 0.0 divide= 0.0
 * 
 * TIPS:
 * 
 * add= 9.0 is printed because 5.0 + 4 is 9.0 subtract= 1.0 is printed because
 * 5.0 - 4 is 1.0 multiply= 0.0 is printed because 5.25 * 0 is 0.0 divide= 0.0
 * is printed because secondNumber is set to 0
 * 
 * 
 * NOTE: All methods should be defined as public NOT public static.
 * 
 * NOTE: In total, you have to write 8 methods.
 * 
 * NOTE: Do not add the main method to the solution code.
 */

package Section_6.CodingExercises;

public class SimpleCalculator {
	private double firstNumber;
	private double secondNumber;

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public double getAdditionResult() {
		return firstNumber + secondNumber;
	}

	public double getSubtractionResult() {
		return firstNumber - secondNumber;
	}

	public double getDivisionResult() {
		if (secondNumber == 0) {
			return 0;
		}
		return firstNumber / secondNumber;
	}

	public double getMultiplicationResult() {
		return firstNumber * secondNumber;
	}

	public static void main(String[] args) {
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("add= " + calculator.getAdditionResult());
		System.out.println("subtract= " + calculator.getSubtractionResult());
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		System.out.println("multiply= " + calculator.getMultiplicationResult());
		System.out.println("divide= " + calculator.getDivisionResult());
	}
}