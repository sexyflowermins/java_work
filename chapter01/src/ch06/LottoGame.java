package ch06;

//Random  가지고오다-->LottoGame .java 파일로 
import java.util.Random;

public class LottoGame {

	// 반드시 어떠한 기능을 만들지 정의 하고 코드르 작성해 주세요
	// 랜덤 숫자 하나를 반환 하는 기능을 만들어보자
	static int randomNum() {
		// .......
		// JDK 가 만들어 준도구를 이용해보자
		Random random = new Random();
		// 랜덤값 하나 생성 반환 -->45
		// 0 부터 시작 한다 --> 0~44 반환 --> 46 ---->0~45
		//
		int resultNumber = random.nextInt(45) + 1;

		return resultNumber;
	}

	// 코드 실행 main 함수
	public static void main(String[] args) {
		// System.out.println(randomNum());
		int r1 = randomNum();
		int r2 = randomNum();
		int r3 = randomNum();
		int r4 = randomNum();
		int r5 = randomNum();
		int r6 = randomNum();

		System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5 + " : " + r6);
	}// end of main

}// end of class
