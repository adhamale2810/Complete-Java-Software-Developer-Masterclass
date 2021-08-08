package Section_7.Composition.House;

public class Lamp {
	private String style;
	private boolean battery;
	private int globRating;

	public Lamp(String style, boolean battery, int globRating) {
		this.style = style;
		this.battery = battery;
		this.globRating = globRating;
	}

	public void installLamp(){
		System.out.println("Lamp: style " + style + " hasBattery " + battery + " globalRating " + globRating);
		System.out.println("Lamp Created");
	}

	public void turnOn() {
		System.out.println("Lamp -> Turning On");
	}

	public void turnOff() {
		System.out.println("Lamp -> Turning Off");
	}

	public String getStyle() {
		return style;
	}

	public boolean getBattery() {
		return battery;
	}

	public int getGlobRating() {
		return globRating;
	}
}