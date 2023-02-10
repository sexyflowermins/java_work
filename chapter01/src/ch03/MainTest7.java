package ch03;

//예약어 - 수입 하다, 가져오다 자바 개발자들이 사용하라고  미리 만들어둠
//java 라는 패키지 안에 util 안에 Scanner를 가지고옴
import java.util.Scanner;

public class MainTest7 {
//코드의 시작점 main
	// 메인쓰래드
	public static void main(String[] args) {
		// 삼항 연산자
		// 조건식 ? 결과1 : , 결과2

		int num1 = (5 < 3) ? 10 : 20;
		// System.out.println(num1);

		int max = 0;
		System.out.println("입력 받은 두 수중 큰수를 출력하시오");

		// JDK 에 만들어 둔 도구
		// 입력 장치(키보드에 있는 어떠한 값을 받아 들여 주는 녀석)
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 1 : ");
		int x = sc.nextInt(); // 정수값만 받을수 있는 녀석이다

		System.out.println("입력 2 : ");
		int y = sc.nextInt();

		System.out.println("======================");
		// 여기까지 코드가 내려온다면 x 값이 담겨있고 y 값이 담겨 있는 상태이다.

		// x값 y값 을 비교해서 두수중에 큰수를 화면에 출력 하시오
		// 삼항 연산자 max = 조건식 ? 참:거짓;
		max = (x > y) ? x : y;
		System.out.println("입력 받은 두 수중 큰 숫자는" + max + "입니다");

	}// end of main

}// end of class
