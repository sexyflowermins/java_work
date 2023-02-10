package ch04;

public class ForMainTest1 {
//코드의 시작점 main
	public static void main(String[] args) {

		// 화면 구구단 2단을 출력 하시오
		int num = 2;
		System.out.println(num + " * 1 =" + (num * 1));
		System.out.println(num + " * 2 =" + (num * 2));
		System.out.println(num + " * 3 =" + (num * 3));
		System.out.println(num + " * 4 =" + (num * 4));
		System.out.println(num + " * 5 =" + (num * 5));
		System.out.println(num + " * 6 =" + (num * 6));
		System.out.println(num + " * 7 =" + (num * 7));
		System.out.println(num + " * 8 =" + (num * 8));
		System.out.println(num + " * 9 =" + (num * 9));

		System.out.println("================");
		num = 3;
		System.out.println(num + " * 1 =" + (num * 1));
		System.out.println(num + " * 2 =" + (num * 2));
		System.out.println(num + " * 3 =" + (num * 3));
		System.out.println(num + " * 4 =" + (num * 4));
		System.out.println(num + " * 5 =" + (num * 5));
		System.out.println(num + " * 6 =" + (num * 6));
		System.out.println(num + " * 7 =" + (num * 7));
		System.out.println(num + " * 8 =" + (num * 8));
		System.out.println(num + " * 9 =" + (num * 9));

		System.out.println("================");
		num = 4;
		System.out.println(num + " * 1 =" + (num * 1));
		System.out.println(num + " * 2 =" + (num * 2));
		System.out.println(num + " * 3 =" + (num * 3));
		System.out.println(num + " * 4 =" + (num * 4));
		System.out.println(num + " * 5 =" + (num * 5));
		System.out.println(num + " * 6 =" + (num * 6));
		System.out.println(num + " * 7 =" + (num * 7));
		System.out.println(num + " * 8 =" + (num * 8));
		System.out.println(num + " * 9 =" + (num * 9));
		System.out.println("================");
		// 구구단 5단을 출력하시오
//		for(초기화식;조건식;증감식) {
//			
//		}
		// i변수의 유효한 범위
		num = 5;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + "=" + (num * i));
		} // end of for

		for (int j = 6; j < 10; j++) {
			System.out.println("================");
			for (int i = 1; i < 10; i++) {
				System.out.println(j + " * " + i + "=" + (j * i));
			}
		}

	}// end of main

}// end of class
