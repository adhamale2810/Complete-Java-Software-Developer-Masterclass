/**
 * Write a method with the name sumDigits that has one int parameter called number.
 * 
 * If the parameter is >=10, then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * 
 * The numbers from 0-9 have 1 digit, so we don't want to process them, also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 */

package Section_5;

public class DigitSumChallenge{
	public static void main(String[] args){
		System.out.println(sumDigits(125));
		System.out.println(sumDigits(-1));
		System.out.println(sumDigits(-111));
		System.out.println(sumDigits(9));
		System.out.println(sumDigits(10));
	}

	public static int sumDigits(int number){
		int sum = 0;
		if(number<10 || number<0){
			return -1;
		}else{
			while(number>0){
				sum += number%10;
				number /= 10;
			}
			return sum;
		}
	}
}