package ch04;

import java.util.Scanner;

public class IfMainTest1 {
//코드의 시작점 main
	public static void main(String[] args) {
		// 제어문 -if
		// 주어진 조건에따라서 실행이 이루어 지도록 구현
		// 만약에 ...... d이라면

		boolean flag = true;

		// if 문 단독 - 출력이 될수도 있고 안될수도 있다
		if (5 > 3) {
			System.out.println("조건식의 결과가 true 이면 여기 코드가 실행됩니다");
		} // end of if

		// if else 문
		flag = false;
		if (flag) {
			System.out.println("true 면 실행 !!!!");
		} else {
			System.out.println("false면 실행@@@");
		}

		System.out.println("성적을 입력 하시오");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();

		// 문제 90이상이면 A
		// 80점 이상이면 B
		if (point >= 90) {
			System.out.println("A입니다");
		} else {
			System.out.println("B입니다");
		}

		System.out.println("=============");

		if (point >= 90) {
			System.out.println("A입니다");
		} else if (point >= 80) {
			System.out.println("B입니다");
		} else if (point >= 70) {
			System.out.println("C입니다");
		} else if (point >= 60) {
			System.out.println("D입니다");
		} else {
			System.out.println("F입니다");
		}// end of if

	}// end of main

}// end of class
