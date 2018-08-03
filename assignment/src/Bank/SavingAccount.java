package Bank;
	import Bank.account;
	import Bank.balanceexception;
	import Bank.transaction;

	public class SavingAccount extends account {

		public SavingAccount() {

		}

		public SavingAccount(String holder) {
			super(holder, 1000);
		}

		@Override
		public void withdrawl(double amount) throws balanceexception {

			if (amount <= (balance - MIN_SAV_BAL)) {
				balance -= amount;
				txns[idx++] = new transaction("Dr", amount, balance);
			} else {
				throw new balanceexception("Insufficient funds");
			}
		}

	}


