package string;
import java.util.*;
public class Customer {
    private String name, mail, phone;
    
    public Customer(String name, String mail, String phone) {
    	this.name= name;
    	this.mail=mail;
    	this.phone = phone;
    }

	public String getName() {
		return name;
	}
	public String getMail() {
		return mail;
	}
	public String getPhone() {
		return phone;
	}
	@Override
	public String toString() {
		String format = String.format("Name: %s\nMail: %s\nPhone: %s", name, mail, phone);
		return format;
	}
}
