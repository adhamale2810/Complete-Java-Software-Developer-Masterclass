package Section_7.Composition.House;

public class Bed {
	private String style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilt;

	public Bed(String style, int pillows, int height, int sheets, int quilt) {
		this.style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilt = quilt;
	}

	public String getStyle() {
		return style;
	}

	public int getPillows() {
		return pillows;
	}

	public int getHeight() {
		return height;
	}

	public int getSheets() {
		return sheets;
	}

	public int getQuilt() {
		return quilt;
	}

	public void make() {
		System.out.println("Bed -> Making");
		System.out.println("Style: " + style);
		System.out.println("Pillows: " + pillows);
		System.out.println("Height: " + height);
		System.out.println("Sheets: " + sheets);
		System.out.println("Quilt: " + quilt);
		System.out.println("Bed -> Made");
	}
}