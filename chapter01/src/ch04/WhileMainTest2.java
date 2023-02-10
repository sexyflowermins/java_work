package ch04;

import java.util.Scanner;

public class WhileMainTest2 {
//코드의 시작점 main(메인 쓰레드)
	public static void main(String[] args) {
		
//		do {
//			
//		}while();
		//사용자가 0을 입력하면 프로그램을 종료하는 코드를 만들어 주세여
		//System.out.println("값을 입력해 주세여");
		Scanner sc =new Scanner(System.in);
		int userInput = -1;
		
		
		int num = 1;
		int sum = 0;
		do {
			System.out.println("값을 입력해주세요");
			userInput = sc.nextInt();
			//한번 코드를 수행하고 
			//다시 사용자 입력 값을받고 싶다면
			sum += userInput;
			System.out.println("연산된 값 : "+ sum);
		}while(true);
		
		//System.out.println("연산의 결과값: "+ sum);
		
		
		
		
		
		
		
		
		
		
		
		
		// 작업자 힘드니까 1초 잠들어
//		while (true) {
//			System.out.print("--");
//			// 예외처리
//			try {
//				// 쓰래드
//				Thread.sleep(100);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		} // end of while

	}// end of main

}// end of class
