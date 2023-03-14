package library;

public class Main {

	public static void main(String[] args) {
        Book book1 = new Book("Sherlock Homeless", "Sir Arthur", 6, 1200,"1324713");
        System.out.println("The book " + book1.getTitle() + ", written by " + book1.getAuthor() + ", has average " + book1.getAvgPages() + " pages per chapter.");
        book1.setTitle("Sherlock Holmes");
        System.out.println("The book " + book1.getTitle() + ", written by " + book1.getAuthor() + ", has average " + book1.getAvgPages() + " pages per chapter.");
	}

}
