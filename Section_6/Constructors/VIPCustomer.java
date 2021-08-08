package Section_6.Constructors;

public class VIPCustomer {
	private String name;
	private double creditLimit;
	private String customerEmailAddress;

	public VIPCustomer() {
		this("defaultName", 1000.0, "default@email.com");
	}

	public VIPCustomer(String name, double creditLimit, String customerEmailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.customerEmailAddress = customerEmailAddress;
	}

	public VIPCustomer(String name, String customerEmailAddress) {
		this(name, 1000.0, customerEmailAddress);
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
}