package Section_7.Composition.House;

public class Wall {
	private String direction;

	public Wall(String direction) {
		this.direction = direction;
	}

	public void buildWall() {
		System.out.println("Built Wall " + direction);
	}

	public String getDirection() {
		return direction;
	}
}