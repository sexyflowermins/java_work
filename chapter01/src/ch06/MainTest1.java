package ch06;

public class MainTest1 {

	// 1리턴값이 int 매개변수 n1,n2,n3 이름은 intAdd
	static int intAdd(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	// 2리턴값이 double 매개변수 n1n2 이름은 double
	static double doubleAdd(double n1, double n2) {
		return n1 + n2;
	}

	// 3번 리턴값이 void 매개변수는 String article, 함수 이름은 printArticle 출력
	// 이름 그대로 출력기능만을 위하여 
	static void printArticle(String article) {
		System.out.println(article);
	}

	// 테스트 - 실행 코드 main
	public static void main(String[] args) {
		System.out.println(intAdd(1, 2, 3));
		System.out.println(doubleAdd(10, 10));

		// 오류 발생
		// System.out.println(printArticle("반가워~~"));
		//자체가 출력 가능
		printArticle("반가워");
	}
}
