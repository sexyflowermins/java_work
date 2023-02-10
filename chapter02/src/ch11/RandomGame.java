package ch11;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

	// 준비물
	// 랜덤 번호
	// 멤버 변수
	int[] randomNum = new int[10];

	int randomNum() {

		Random random = new Random();
		// 랜덤값 하나 생성 반환 -->10
		// 0 부터 시작 한다 --> 0~10반환 -->
		int Number = random.nextInt(10) + 1;
		return Number;
	}
	// 입력 받을 값 준비
	
	// 1-5 번까지 현금 입니다 축하합니다

	// 6 헬스장 pt 이용권

	// 789 단백질입니다

	// 10번 헬스장 평생이용권


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		// 램덤 뽑기
		// int ran = randomNum();
		// int ran = randomNum();

		// 한번 누를때마다 랜덤한 상품이 나온다
		for (int i = 1; i <= count; i++) {
//		for(int j) {
//			System.out.println("뽑으신 번호는 : ");
//		}
		}

	
	} // end of main 
} // end of class 
