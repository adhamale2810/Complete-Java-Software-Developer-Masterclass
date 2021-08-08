package Section_7.Composition.House;


public class Bedroom {
	private Wall wall1;
	private Wall wall2;
	private Wall wall3;
	private Wall wall4;
	private Ceiling ceiling;
	private Bed bed;
	private Lamp lamp;
	private Door door;
	private Window window;

	public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp, Door door,
			Window window) {
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.bed = bed;
		this.lamp = lamp;
		this.door = door;
		this.window = window;
	}


	public Lamp getLamp() {
		return this.lamp;
	}

	public void makeBed() {
		bed.make();
	}
}