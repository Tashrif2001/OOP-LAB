package inheritance;

public class Account {
	private double balance,interestRate;
	private int accountID;
	
	public Account(int accountID, double balance) {
		this.balance = balance;
		this.accountID = accountID;
	}
	public int getAccountID() {
		return accountID;
	}
	public void applyInterest() {
		balance += balance*interestRate;
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
