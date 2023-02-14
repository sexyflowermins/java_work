package ch07;

/**
 * 
 * @author GGG Object 클래스 이해하시 자바는 단일 상속만을 지원한다 하지만모든클래스의 최상위 클래스 Object 클래스는
 *         예외이다.
 */
public class Book {

	private int bookId;
	private String title;
	private String author;

	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	// 코드 힌트 살펴보기
	// extends Object 키워드릴작성하지 않아도 컴파일러가 .class 파일만들어줌

	// toString() <-- 메서드는 최상위 메서드인 Object 클래스의 메서드이다.
	@Override
	public String toString() {
		return "[" + this.title + "]";
	}

	// equals 메서드 제정의 하기
	// 책 제목과 작가이름이 같다면 같은 책이라고 판별 해보자!!!
	@Override
	public boolean equals(Object obj) {
		// 만약 외부에서 주입된 값에 title 과 author 이 같다면 true 리턴
		// 아니라면 false 를 리턴하자
		// book이라는 데이터 타입만 확인하자
		if (obj instanceof Book) {
			Book targetBook = (Book) obj;
			if (this.title == targetBook.title && this.author == targetBook.author) {
				System.out.println("같은 책 제목입니다");
				return true;
			}
		}
		return false;
	}

}
