package inheritance;

public class SavingsAccount extends Account{

	public SavingsAccount(int accountID,double balance) {
		super(accountID,balance);
		this.setInterestRate(0.04);
	}
	@Override
	public void withdraw(double amount) {
		if(amount<super.getBalance()) {
			super.withdraw(amount);
		}
		else
			System.err.println("Please input a valid amount less than " + super.getBalance());
	}
}
