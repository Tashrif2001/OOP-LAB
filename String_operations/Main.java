package string;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    String[] split = s.split(",");
	    String name = split[0].trim();
	    String phone = split[1].replaceAll("[^\\d]", "").trim();
	    String mail = split[2].trim();
	    ArrayList<String> list = new ArrayList<String>();
	    list.add(name);
	    list.add(mail);
	    list.add(phone);
	    Customer c1 = new Customer(list.get(0), list.get(1), list.get(2));
	    
	    System.out.println(c1.toString());
	}

}
