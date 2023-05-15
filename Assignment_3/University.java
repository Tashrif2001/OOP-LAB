package assignment_3;
import java.util.*;

public class University {
	private ArrayList<Person> list;
	public University(Person person) {
		this.list = new ArrayList<>();
	}
	 public String getFullNames() {
		 ArrayList<String>names = new ArrayList<>();
		 for(Person per : list) {
			 names.add(per.getFullName());
		 }
		 String out="";
		 for(int i=0; i<names.size(); i++) {
			 if(i!=names.size()-1)
				 out = out + names.get(i) + ",";
			 else
				 out = out + names.get(i);
		 }
		 return out;
	}
	 
	 public Person getOldestPerson() {
		 for(Person per : list) {
			 if()
		 }
	 }
}
