package ch03;

public class MainTest3 {
//코드의 시작점 main 함수(메인 쓰레드)
	public static void main(String[] args) {
		// 복합 대입 연산자
		// 다른 연산자와 대입 연산자를 함께 사용하는것
		int num1 = 1;
		num1 = num1 + 10;
		System.out.println(num1);

		int num2 = 1;
		num2 += 10; // 1번을 간소화 한것
		System.out.println(num2);

		int num3 = 1;
		// num3 = num3 - 10;
		num3 -= 10;
		System.out.println(num3);

		// 복합 대입연산자 변경
		// num1 = num1 * 2;
		num1 *= 2;
		System.out.println(num1);

		// num2 = num2 / 2;
		num2 /= 2;
		System.out.println(num2);

		// num3 = num3 % 2;
		num3 %= 2;
		System.out.println(num3);

	}// end of main

}// end of class
