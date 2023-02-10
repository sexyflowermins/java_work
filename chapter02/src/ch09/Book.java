package ch09;

public class Book {

	private String title;
	private int totalPage;
	private String author;

	// private

	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Book(int totalPage, String title, String author) {
		this(title, author);
		this.totalPage = totalPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void showInfo() {
		System.out.println(">>>책정보<<<");
		System.out.println("재목 : " + title);
		System.out.println("저자 :" + author);
	}

}
