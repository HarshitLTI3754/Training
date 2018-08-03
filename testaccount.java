import Bank.account;
import Bank.balanceexception;


public class testaccount {

	public static void main(String[] args) {

		account ac = new Bank.SavingAccount("xyz");
		ac.summary();

		ac.deposit(2000);
		ac.deposit(4000);

		try {
			ac.withdrawl(7000);
		} catch (balanceexception e) {
			e.printStackTrace();
		}

	}

}
