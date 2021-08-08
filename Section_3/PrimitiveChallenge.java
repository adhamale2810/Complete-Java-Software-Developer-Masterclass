package Section_3;

public class PrimitiveChallenge {
	public static void main(String[] args) {
		byte byteNum = 123;
		short shortNum = 1243;
		int intNum = 789;
		long finalNum = 50000L + (10L * (byteNum + shortNum + intNum));
		System.out.println("Final Number: " + finalNum);
	}
}