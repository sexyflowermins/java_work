package ch04;

import java.util.Scanner;

public class ContinueMainTest2 {
//코드의 시작점
	public static void main(String[] args) {

		// 스캐너를 사용해서 사용자의 정수 값을 입력 받아서 배수에 갯수를 출력하는 프로그램을 만들어 보세요
		// 테스트 값은 1000,(3을 입력하면 ) 3의 배수의 갯수를 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		final int MULTIPLE = sc.nextInt();
		System.out.println("몇까지 확인하시겠습니까");
		final int MAX = sc.nextInt();
		int num = 0;
		int sum = 0;

		for (num = 1; num <= MAX; num++) {
			if (num % MULTIPLE == 0) {
				// 만약에 3의 배수이면 화면에 출력 하지 마시오
				sum++;
				continue;
			}
			//System.out.println("num : " + num);
		}

		System.out.println(MULTIPLE+"의 배수의 갯수는"+sum+"입니다");
	}// end of main

}// end of class
