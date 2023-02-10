package ch04;

import java.util.Scanner;

public class IfMainTest2 {
//코드의 시작점 main
	public static void main(String[] args) {

		System.out.println("성적을 입력하세요");

		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		// 100 ~ 90 --> A 학점입니다
		// 89 ~ 80 이상 B 학점입니다
		// 79 ~ 70 이상 C 학점입니다
		// 69 ~ 60 이상 D 학점입니다
		// 나머지는 F 학점입니다
		char reuslt = 'Z';
		
		if (point <= 100 && point >= 90) {
			reuslt = 'A';
		} else if (point <= 89 && point >= 80) {
			reuslt = 'B';
		} else if (point <= 79 && point >= 70) {
			reuslt = 'C';
		} else if (point <= 69 && point >= 70) {
			reuslt = 'D';
		} // end of if
		
		//방어적 코드를 작성
		if(reuslt == 'Z') {
			System.out.println("값을 잘못 입력 하였습니다");
		}else {
			
			System.out.println(reuslt + "학점입니다");
		}


	}// end of main

}// end of class
