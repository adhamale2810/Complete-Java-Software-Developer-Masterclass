package Section_6.Inheritance.Lecture_Challenge;

public class OutLander extends Car {

	private int roadServiceMonths;

	public OutLander(int roadServiceMonths) {
		super(100, 7, 4, 2, false);
		this.roadServiceMonths = roadServiceMonths;
	}

	public void accelerate(int rate) {
		int newVelocity = getCurrentSpeed() + rate;
		if (newVelocity == 0) {
			stop();
			changeGear(1);
		} else if (newVelocity > 0 && newVelocity <= 10) {
			changeGear(1);
		} else if (newVelocity > 10 && newVelocity <= 20) {
			changeGear(2);
		} else if (newVelocity > 20 && newVelocity <= 30) {
			changeGear(3);
		} else {
			changeGear(4);
		}

		if (newVelocity > 0) {
			changeVelocity(newVelocity, getCurrentDirection());
		}
	}

	public int getRoadServiceMonths() {
		return roadServiceMonths;
	}

	public static void main(String[] args) {
		OutLander oLander = new OutLander(36);
		oLander.steer(45);
		oLander.accelerate(30);
		oLander.accelerate(20);
		oLander.accelerate(-42);
		oLander.accelerate(-8);
	}

}