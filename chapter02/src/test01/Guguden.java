package test01;

import java.util.Scanner;

public class Guguden {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int start = 0;
		int end = 0;
		System.out.println("몇단부터 시작하시겠습니까");
		start = sc.nextInt();
		System.out.println("몇단까지 출력하시겠습니까");
		end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			System.out.println(i + "단을 출력 합니다.");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
