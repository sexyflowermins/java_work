package ch08;

public class MainTest2 {

	public static void main(String[] args) {

		// 예외 처리 구문작성
		// 10 /0 연산 시키고 예외 처리까지 작성해주세여
		// try
		// 클래스 설계
		int ten = 10;
		int zero = 0;

		try {
			int result = ten / zero;
			//int result = zero/ten;
			System.out.println("수식 결과는 : " + result);
		} catch (Exception e) {
			System.out.println("수식이 맞지 않습니다");
		} finally {
			System.out.println("finally 실행");
		}
		System.out.println("비정상 종료 되지않았습니다");
	}// end of main

}// end of class
