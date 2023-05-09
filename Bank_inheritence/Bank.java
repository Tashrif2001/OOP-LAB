package inheritance;
import java.util.*;
public class Bank {
	private ArrayList<Account> list;
	public Bank() {
		this.list = new ArrayList<Account>();
	}
	public void add(Account account) {
		list.add(account);
	}
	public void remove(int accountID) {
//		for(Account x : list) {
//			if(x.getAccountID()==accountID) {
//				list.remove(x);
//				return;
//			}
//		}
//		System.out.println("Not found");
		list.removeIf(account -> account.getAccountID()==accountID);
	}
	public double showAccount() {
		if(list.isEmpty()) {
			System.out.println("Empty");
			return 0.00;
		}
		else
		return this.list.get(0).getBalance();
	}
	
}
