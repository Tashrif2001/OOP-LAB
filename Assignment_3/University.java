package assignment_3;
import java.util.*;

public class University {
	private ArrayList<Person> list;
	public University(ArrayList<Person> persons) {
		this.list = persons;
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
		 int max=0;
		 for(Person per : list) {
			 if(per.age>max)
				 max = per.age;
		 }
		 for(int i=0; i<list.size(); i++) {
			 if(max==list.get(i).age)
				 return list.get(i);
		 }
		return null;
	 }
}
