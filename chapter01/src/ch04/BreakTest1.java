package ch04;

public class BreakTest1 {
//코드의 시작점 main
	public static void main(String[] args) {
		// 중간에 멈추는 Break 문

		for (int i = 1; i < 11; i++) {
			System.out.println("i :" + i);
			// 만약 i 값이 소수 7 이면 멈추어라
			if (i % 7 == 0) {
				break;// 중간에 멈추고 반복문 하나를 빠져나옴
			} // end of if
		} // end of for
	}// end of main

}// end of class
