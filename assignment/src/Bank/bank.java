package Bank;

public interface bank {
	void summary();

	double getbalance();

	void deposit(double amount);

	void withdrawl(double amount) throws balanceexception;

	void statement();

	int INIT_ACNT_NO = 1001;

	double MIN_SAV_BAL = 1000;
	double INIT_CUR_BAL = 5000;
	double MIN_CUR_BAL = 1000;

	double OVERDRAFT_AMT = 10000;

}
