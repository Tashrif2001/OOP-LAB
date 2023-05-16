package assignment_3;
import java.util.*;

public class UniversityTest {

	public static void main(String[] args) {
		Person p1 = new Person("Tashrif", "Prottasha", 22);
		Person p2 = new Student("Redwan", "Sami", 11);
		Person p3 = new Employee("Rifat", "Tusher", 2);
		Person p4 = new Employee("Nandan", "Bhowmick", 20);
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		University u1 = new University(list);
		System.out.println(list.get(1).getFullName());
		System.out.println(u1.getNumberOfEmployees());
	    System.out.println(u1.getYoungestPerson().getFullName());
	}

}
