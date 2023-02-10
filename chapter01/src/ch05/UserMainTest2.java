package ch05;

import java.util.Scanner;

public class UserMainTest2 {
//메인함수
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 여러분들이 정의한 클래스를 가지고 값 할당 코드 작성
		User us1 = new User();

		us1.name = "SexyFlowerMins";
		us1.id = "Flower";
		us1.pw = "21605034";
		us1.add = "사랑시 고백구 행복동";
		us1.phone = "01023234646";
		System.out.println("이름 : " + us1.name);
		System.out.println("아이디 : " + us1.id);
		System.out.println("비밀번호 : " + us1.pw);
		System.out.println("주소 : " + us1.add);
		System.out.println("전화번호 : " + us1.phone);

		System.out.println("================");

		// 정보를 출력해주세요
		us1.name = scanner.nextLine();
		System.out.println("이름 : " + us1.name);
		us1.id = scanner.nextLine();
		System.out.println("아이디 : " + us1.id);
		us1.pw = scanner.nextLine();
		System.out.println("비밀번호 : " + us1.pw);
		us1.add = scanner.nextLine();
		System.out.println("주소 : " + us1.add);
		us1.phone = scanner.nextLine();
		System.out.println("전화번호 : " + us1.phone);

	}// end of main

}// end of class
