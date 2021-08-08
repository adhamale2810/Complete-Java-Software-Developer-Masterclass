package Section_3;

public class ByteShortIntLong {
	public static void main(String[] args) {
		int myMinValue = Integer.MIN_VALUE;
		int myMaxValue = Integer.MAX_VALUE;

		System.out.println("Minimum Value: " + myMinValue);
		System.out.println("Maximum Value: " + myMaxValue);
		System.out.println("Busted Max Value: " + (myMaxValue + 1));
		System.out.println("Busted Min Value: " + (myMinValue - 1));
		System.out.println();

		byte minByteValue = Byte.MIN_VALUE;
		byte maxByteValue = Byte.MAX_VALUE;
		System.out.println("Maximum Byte Value: " + maxByteValue);
		System.out.println("Minimum Byte Value: " + minByteValue);
		System.out.println();

		short minShortValue = Short.MIN_VALUE;
		short maxShortValue = Short.MAX_VALUE;
		System.out.println("Maximum Short Value: " + maxShortValue);
		System.out.println("Minimum Short Value: " + minShortValue);
		System.out.println();

		long minLongValue = Long.MIN_VALUE;
		long maxLongValue = Long.MAX_VALUE;
		System.out.println("Minimum Long Value: " + minLongValue);
		System.out.println("Maximum Long Value: " + maxLongValue);
		System.out.println();

		// Type Casting
		byte myByteValue = (byte)(minByteValue/2);
		short myShortValue = (short)(minShortValue/2);
		System.out.println(myByteValue);
		System.out.println(myShortValue);
		System.out.println();
	}
}