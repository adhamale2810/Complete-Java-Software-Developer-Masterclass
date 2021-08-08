package Section_7.Composition.House;

public class Window {
	private boolean tinted;
	private int height;
	private int width;

	public Window(boolean tinted, int height, int width) {
		this.tinted = tinted;
		this.height = height;
		this.width = width;
	}

	public void installWindow() {
		System.out.println("Window: height " + height + " width " + width + " isTinted " + tinted);
		System.out.println("Window created");
	}

	public void openWindow() {
		System.out.println("Window -> Opening");
	}

	public void closeWindow() {
		System.out.println("Window -> Closing");
	}

	public boolean getTintedOrNot() {
		return tinted;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
}