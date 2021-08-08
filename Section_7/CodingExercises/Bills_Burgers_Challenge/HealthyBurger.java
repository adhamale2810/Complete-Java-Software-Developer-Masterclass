package Section_7.CodingExercises.Bills_Burgers_Challenge;

public class HealthyBurger extends Hamburger {
	private String addition5Name;
	private double addition5Price;
	private String addition6Name;
	private double addition6Price;

	public HealthyBurger(String meat, double price) {
		super("Healthy", meat, price, "Brown Rye");
	}

	public void addition5(String addition5Name, double addition5Price) {
		this.addition5Name = addition5Name;
		this.addition5Price = addition5Price;
	}

	public void addition6(String addition6Name, double addition6Price) {
		this.addition6Name = addition6Name;
		this.addition6Price = addition6Price;
	}

	@Override
	public double makeHamburger() {
		double healthyPrice = super.makeHamburger();
		if (this.addition5Name != null) {
			System.out.println(this.addition5Name + " added for an extra " + this.addition5Price);
			healthyPrice += this.addition5Price;
		}

		if (this.addition6Name != null) {
			System.out.println(this.addition6Name + " added for an extra " + this.addition6Price);
			healthyPrice += this.addition6Price;
		}
		return healthyPrice;
	}
}