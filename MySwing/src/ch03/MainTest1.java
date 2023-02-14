package ch03;

public class MainTest1 {

	// 내부클래스 사용

	public static void main(String[] args) {
		// 외부파일에서 MyDrawPanel사용할일이없고
		// MyFrame1 에서만 사용하는 녀석이라면 내부 클래스에서 설계할수있다.
		new MyFrame1();
	}

}
