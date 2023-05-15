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
	        Person oldestPerson = null;
	        for (Person person : list) {
	            if (oldestPerson == null || person.getAge() > oldestPerson.getAge()) {
	                oldestPerson = person;
	            }
	        }
	        return oldestPerson;
	    }
	 public Person getYoungestPerson() {
	        Person youngestPerson = new Person(list.get(0).getFirstName(), list.get(0).getLastName(), list.get(0).age);
	        for (Person person : list) {
	            if (youngestPerson == null || person.getAge() < youngestPerson.getAge()) {
	                youngestPerson = person;
	            }
	        }
	        return youngestPerson;
	    }
}
