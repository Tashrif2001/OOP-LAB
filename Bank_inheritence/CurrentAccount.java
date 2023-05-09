package inheritance;

public class CurrentAccount extends Account{

	public CurrentAccount(int accountID,double balance) {
		super(accountID,balance);
		this.setInterestRate(0.00);
	}

}
