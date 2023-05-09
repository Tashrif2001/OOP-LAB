package inheritance;

public class Main {

	public static void main(String[] args) {
		Account account = new Account(2345253,1200);
		Bank b = new Bank();
		b.add(account);
		System.out.println(b.showAccount());
		b.remove(2345253);
		System.out.println(b.showAccount());
	}

}
