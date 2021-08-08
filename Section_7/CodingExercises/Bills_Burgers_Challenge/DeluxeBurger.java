package Section_7.CodingExercises.Bills_Burgers_Challenge;

public class DeluxeBurger extends Hamburger {
	private double chipsPrice;
	private double drinksPrice;

	public DeluxeBurger(String breadRollType, String meat, double price, double chipsPrice, double drinksPrice) {
		super("Deluxe", breadRollType, price, meat);
		this.chipsPrice = chipsPrice;
		this.drinksPrice = drinksPrice;
	}

	public double getChipsPrice() {
		return chipsPrice;
	}

	public double getDrinksPrice() {
		return drinksPrice;
	}

	@Override
	public void addition1(String name, double additionPrice) {
		System.out.println("Invalid");
	}

	@Override
	public void addition2(String name, double additionPrice) {
		System.out.println("Invalid");
	}

	@Override
	public void addition3(String name, double additionPrice) {
		System.out.println("Invalid");
	}

	@Override
	public void addition4(String name, double additionPrice) {
		System.out.println("Invalid");
	}

	@Override
	public double makeHamburger() {
		double deluxePrice = super.makeHamburger();
		System.out.println("Chips added for an extra " + this.chipsPrice);
		deluxePrice += this.chipsPrice;
		System.out.println("Drinks added for an extra " + this.drinksPrice);
		deluxePrice += this.drinksPrice;
		return deluxePrice;
	}
}