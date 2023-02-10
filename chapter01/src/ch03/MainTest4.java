package ch03;

public class MainTest4 {
//코드의 시작점 main
	public static void main(String[] args) {

		// 증감 연산자, 감소 연산자
		// ++,-- (how,why)

		int num1 = 1; // 변수의 선언과 동시에 초기화
		num1++;
		System.out.println(num1);// 변수의 값을 1 증가 시킬때사용

		int num2 = 1;
		num2--;
		System.out.println(num2);// 변수의 값을 1 감소 시킬때사용
		System.out.println("==============");

		// 1.증감 연산자가 뒤에 올경우
		int num3 = 10;
		int num4;
		// 11 = 10 + 1
		// num3 값이 num4로 들어간다 그리고 세미클론 이후에 증감 연산자르 수행한다
		num4 = num3++;
		System.out.println(num4);
		System.out.println(num3);// num4 에 값 10을 대입하고 세미클론 기준 1증가

		int num5 = 10;
		int num6;

		num6 = ++num5;
		// 세미클론 기준으로 먼저 num5 변수에 접근해서 +1 증가 이후에
		// num6에 값을 대입한다.
		System.out.println(num6);

		System.out.println("=====================");
		// 감소 연산자 사용해보기

		int n1 = 10;
		int n2;
		
		n2 = n1--;
		System.out.println(n2);
		System.out.println(n1);

		int n3 = 10;
		int n4;

		n4 = --n3;
		System.out.println(n4);
		System.out.println(n3);

	}// end of main

}// end of class
