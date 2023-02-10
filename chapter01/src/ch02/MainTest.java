package ch02;

public class MainTest {
//main
	public static void main(String[] args) {

		//long - 8byte
		//int - 4byte
		//작은 상자에서 큰상자로 들어갈때는 자동 형변환
		long l = 100; // 자동 형 변환
		//R value -->는 정수값에 기본 연산 단위인 int 형이다
		//L value --> long 데이터 타입 int 형 데이터를 넣는 과정이기 때문에 자동 형 변환
		System.out.println(" l : " + l);
		
		//문법을 작성하고 오류를 확인한는사점 --> 컴파일 시점
		//실행버튼 명령어를 통해서 실행 하면 --> 런타임시점
		
	}//end of main

}//end of class
