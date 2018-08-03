package Bank;

import lti.reflect.SavingAccount;

public final class AccountFactory {
	public static bank openAccount(String type, String holder) {
		bank acnt = null;
		if (type.equalsIgnoreCase("savings"))
			acnt = new SavingAccount(holder);
		else
			acnt = new CurrentAccount(holder);
		return acnt;

	}
}
