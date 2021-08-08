package Section_7.CodingExercises.Composition_Challenge;

public class Bed {
	private String style;
	private int height;
	private int sheets;
	private int quilt;
	private int pillows;

	public Bed(String style, int height, int sheets, int quilt, int pillows) {
		this.height = height;
		this.pillows = pillows;
		this.quilt = quilt;
		this.sheets = sheets;
		this.style = style;
	}

	public void make(){
		System.out.println("bed is being made");
	}

	public String getStyle(){
		return style;
	}

	public int getHeight(){
		return height;
	}
	
	public int getSheets(){
		return sheets;
	}

	public int getPillows(){
		return pillows;
	}

	public int getQuilt(){
		return quilt;
	}
}