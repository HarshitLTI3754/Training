package Bank;
public class CurrentAccount extends account {

	int overdraft = 10000;

	public CurrentAccount() {

	}

	public CurrentAccount(String holder) {
		super(holder, 5000);
	}

	@Override
	public void deposit(double amount) {
		overdraft += amount;
		if (overdraft > OVERDRAFT_AMT) {
			balance += overdraft - OVERDRAFT_AMT;
			overdraft = o;
		}
	}

	@Override
	public void withdrawl(double amount) throws balanceexception {
		if (amount <= (balance + overdraft)) {
			balance -= amount;
			if (balance < MIN_CUR_BAL) {
				overdraft += balance;
			} else {
				balance = balance + OVERDRAFT_AMT;
				System.out.println("available balance :" + balance);
			}

		}

		else
			throw new balanceexception("Insufficient funds");

	}

}
