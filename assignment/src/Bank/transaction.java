package Bank;

public class transaction {

	private String type;
	private double amount, balance;

	public transaction() {

	}

	public transaction(String type, double amount, double balance) {
		super();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return type + "\t" + amount + "\t" + balance;
	}

}
