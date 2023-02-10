package ch02;

import java.util.Scanner;

public class HumanMainTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Human human = new Human();

		// 스캐너를 활용해서 값을 할당해 주세요
		// 스캐너를 통해서 showInfo메소드 호출 기능을 만들어보기
		human.name = sc.nextLine();
		human.height = sc.nextInt();
		human.weight = sc.nextInt();
		human.isMan = sc.nextBoolean();

		System.out.println("===========상태창===========");
		System.out.println("이사람의 이름은 :" + human.name);
		System.out.println("이사람의 키는 :" + human.height);
		System.out.println("이사람의 몸무게 :" + human.weight);
		System.out.println("이사람의 성별은 :" + human.isMan);

		// 심화 0번을 입력시
		// 마지막에는 showInfo매소드 호출해서 값을 확인해주세요
		if (sc.nextInt() == 0) {
			human.showInfo();
		}
	}

}
