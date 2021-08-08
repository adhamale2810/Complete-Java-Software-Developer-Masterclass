package Section_7.CodingExercises.Bills_Burgers_Challenge;

public class Hamburger {
	private String name;
	private String breadRollType;
	private String meat;
	private double price;
	private double totalPrice;

	private String addition1Name;
	private double addition1Price;

	private String addition2Name;
	private double addition2Price;

	private String addition3Name;
	private double addition3Price;

	private String addition4Name;
	private double addition4Price;

	public Hamburger(String name, String meat, double price, String breadRollType) {
		this.breadRollType = breadRollType;
		this.meat = meat;
		this.price = price;
		this.totalPrice = price;
	}

	public String getBreadRoll() {
		return breadRollType;
	}

	public String getMeat() {
		return meat;
	}

	public double getPrice() {
		return price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void addition1(String name, double additionPrice) {
		this.addition1Name = name;
		this.addition1Price = additionPrice;
	}

	public void addition2(String name, double additionPrice) {
		this.addition2Name = name;
		this.addition2Price = additionPrice;
	}

	public void addition3(String name, double additionPrice) {
		this.addition3Name = name;
		this.addition3Price = additionPrice;
	}

	public void addition4(String name, double additionPrice) {
		this.addition4Name = name;
		this.addition4Price = additionPrice;
	}

	public double makeHamburger() {
		System.out.println(this.meat + " on a " + this.breadRollType + " roll hamburger, price: " + this.price);
		if (this.addition1Name != null) {
			System.out.println(this.addition1Name + " added for an extra " + this.addition1Price);
			this.totalPrice += this.addition1Price;
		}
		if (this.addition2Name != null) {
			System.out.println(this.addition2Name + " added for an extra " + this.addition2Price);
			this.totalPrice += this.addition2Price;
		}
		if (this.addition3Name != null) {
			System.out.println(this.addition3Name + " added for an extra " + this.addition3Price);
			this.totalPrice += this.addition3Price;
		}
		if (this.addition4Name != null) {
			System.out.println(this.addition4Name + " added for an extra " + this.addition4Price);
			this.totalPrice += this.addition4Price;
		}
		return this.totalPrice;
	}
}