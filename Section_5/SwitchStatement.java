package Section_5;

public class SwitchStatement{
	public static void main(String[] args) {
		int switchValue = 4;
		switch (switchValue) {
			case 1:
				System.out.println("Number is 1");	
				break;
			case 2:
				System.out.println("Number is 2");
				break;
			case 3: case 4: case 5:
				System.out.println("Number is either 3 or 4 or 5");
				System.out.println("Actual Number is " + switchValue);
				break;
			default:
				System.out.println("Number Invalid");
				break;
		}
	}
}