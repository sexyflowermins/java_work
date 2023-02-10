package ch04;

public class WhileMainTest1 {
//코드의 시작점 main
	public static void main(String[] args) {

		// 1~1000 까지 연산 코드

		int num = 1;
		int sum = 0;
		int userInput = 345;
		
		while (num <= userInput) {
			System.out.println("현재값 : " + num); // 무한 루프에 조심해야함
			//sum = sum + num;
			sum += num;
			num++; // 증감 연산자
		}
		System.out.println("연산의 대한 결과 값은 : " + sum);

	}// end of main

}// end of class
