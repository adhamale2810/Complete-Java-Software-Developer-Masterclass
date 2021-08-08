package Section_7.Composition.House;

public class Door {
	private int height;
	private int width;
	private String material;

	public Door(int height, int width, String material) {
		this.height = height;
		this.width = width;
		this.material = material;
	}

	public void installDoor(){
		System.out.println("Door Installed");
	}

	public void openDoor() {
		System.out.println("Door -> Opening");
	}

	public void closeDoor() {
		System.out.println("Door -> Closing");
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public String getMaterial() {
		return material;
	}
}