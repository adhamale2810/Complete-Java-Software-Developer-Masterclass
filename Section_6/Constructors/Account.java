package Section_6.Constructors;

public class Account {
	private String number;
	private double accountBalance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;

	// Constructor only has an access specifier and has same name as that of the
	// class
	// it is called automatically during creation of object
	public Account() {
		// this("A123458951", 0.0, "default name", "default", "+91789651321");
		// another way of calling constructor by using this keyword
		System.out.println("Default Empty Constructor Called");
	}

	public Account(String number, double accountBalance, String customerName, String customerEmailAddress,
			String customerPhoneNumber) {
		this.number = number;
		this.accountBalance = accountBalance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getACNumber() {
		return number;
	}

	public double getBalance() {
		return accountBalance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getEmail() {
		return customerEmailAddress;
	}

	public String getPhoneNumber() {
		return customerPhoneNumber;
	}

	public double depositMoney(double deposit) {
		if (deposit > 0) {
			accountBalance += deposit;
			return accountBalance;
		}
		return -1;
	}

	public double withdrawMoney(double withdraw) {
		if (accountBalance < withdraw || withdraw < 0) {
			return -1;
		}
		accountBalance -= withdraw;
		return accountBalance;
	}

}