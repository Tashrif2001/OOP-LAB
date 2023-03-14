package library;

public class Book {
    private String title,author,isbn;
    private int num_chapter,num_page;
    
    public Book(String title, String author, int num_chapter, int num_page, String isbn) {
    	this.title= title;
    	this.author= author;
    	this.num_chapter= num_chapter;
    	this.num_page= num_page;
    	this.isbn= isbn;
    }
    public Book(String title, String author) {
    	this.title= title;
    	this.author= author;
    	this.num_chapter= 0;
    }
    public Book() {
    	this.title="";
    	this.author= "";
    	this.isbn="";
    	this.num_chapter=0;
    	this.num_page=0;
    }
    public String getTitle() {
    	return title;
    }
    public String getAuthor() {
    	return author;
    }
    public int getChapter() {
    	return num_chapter;
    }
    public int getPage() {
    	return num_page;
    }
    public String getIsbn() {
    	return isbn;
    }
    public void setTitle(String title) {
    	this.title= title;
    }
    public void setAuthor(String author) {
    	this.author= author;
    }
    public void setChapter(int num_chapter) {
    	this.num_chapter = num_chapter;
    }
    public void setPage(int num_page) {
    	this.num_page = num_page;
    }
    public void getIsbn(String isbn) {
    	this.isbn = isbn;
    }
    public double getAvgPages() {
    	return num_page/num_chapter;
    }
}
