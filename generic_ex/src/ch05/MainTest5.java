package ch05;

import java.util.Scanner;

public class MainTest5 {

	// 윤년 계산하기
	// 4의 배수의 해는 윤년
	// 4의 배수이면서 100의 배수인 해는 윤년이 아님
	// 100의 배우이면서 400의 배수인해는 윤년
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("알아보고 싶은 년도가 윤년일 까요 아닐까요 입력 해주세요");
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + "년도는 윤년이네요");
		} else if (year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + "년도는 윤년이네요");
		} else {
			System.out.println(year + "년도는 평년이네요");
		}
	}
}
