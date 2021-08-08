package Section_6.Constructors;

public class Main {
	public static void main(String[] args) {
		Account user = new Account("A123458951", 0.0, "John Josh", "john@bmail.com", "+91789651321");
		System.out.println("Account Number: " + user.getACNumber());
		System.out.println("Holder Name: " + user.getCustomerName());
		System.out.println("Email ID: " + user.getEmail());
		System.out.println("Contact No: " + user.getPhoneNumber());
		System.out.println("Acconut Balance: " + user.getBalance());
		System.out.println("Balanace after Withdraw: " + user.withdrawMoney(7000));
		System.out.println("Balance after Deposit: " + user.depositMoney(1000));
		System.out.println("Balanace after Withdraw: " + user.withdrawMoney(550.50));

		System.out.println();
		System.out.println("VIP Customers:");
		VIPCustomer customer1 = new VIPCustomer();
		System.out.println(customer1.getName());
		System.out.println(customer1.getCustomerEmailAddress());
		System.out.println(customer1.getCreditLimit());

		System.out.println();
		VIPCustomer customer2 = new VIPCustomer("BOB", "bob@bmail.com");
		System.out.println(customer2.getName());
		System.out.println(customer2.getCustomerEmailAddress());
		System.out.println(customer2.getCreditLimit());

		System.out.println();
		VIPCustomer customer3 = new VIPCustomer("tim", 25000.0, "tim@tmail.com");
		System.out.println(customer3.getName());
		System.out.println(customer3.getCustomerEmailAddress());
		System.out.println(customer3.getCreditLimit());
	}
}