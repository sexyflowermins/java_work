package ch06;

/**
 * 
 * 함수를 선언하는 코드 방법 함수를 사용하는 코드 방법
 *
 */
public class Lion {

	// 정수를 반환 하는 함수
	// 함수를 설계하는 코드 작성
	static int addNumber(int n1, int n2) {
		// 함수 구현부(body)
		int result;// 지역변수
		result = n1 + n2;
		return result; // 리턴 키워드를 만나면 실행의 제어권을 반납한다 .(데이터)

	}

	// 아무 값도 반환 하지 않는 함수 - void
	static void sayHello(String name) {
		System.out.println(name + "반값습니다 ~ ");
	}

	// 매게 변수가 없는 함수를 설계해 보자
	// 리턴 타입은 인트
	static int calcSum() {
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	// calcSum2,정수값 3개를 받아서 덧셈 연산후 결과를 반환 하시오 --> 리턴 타입은 더블로
	static double calcSum2(int a, int b, int c) {
		double result = a + b + c;
		return result;
	}

	// calcSum2 정수값 1개,실수값1,논리값1개 받고 식을 만들어서
	// "정수값 : " [], 실수 값 : [] 논리 값 [] <---- 문자열로 연산 하고
	// 리턴 타입은 String 으로 만들어주세요
	static String calcSum3(int a, double b, boolean c) {
		String result2 = "정수값 :" + a + "\n" + "실수 값 : " + b + "\n" + "논리 값 :" + c;
		// 자바 띄우기 문자 "\n"
		return result2;
	}

	// main - 텅빈 리턴 값이 없다
	public static void main(String[] args) {

		// 함수 호출하기
		// 함수를 사용하는 코드
		int myNumber = addNumber(5, 10);
		System.out.println("myNumber : " + myNumber);

		// 함수 호출 2
		// 함수 호출 할때는 모양 맞추기다
		sayHello("애쉬 ");
		// int a = myNumber;
		sayHello("티모 ");
		sayHello("바론 ");

		int calResult = calcSum(); // <--
		System.out.println(calResult);

		System.out.println(calcSum());

		System.out.println(calcSum2(1, 2, 3));

		//System.out.println(calcSum3(1, 1.2, true));
		String localDataString = calcSum3(1, 1.2, true);
		System.out.println(localDataString);
	}// end of main
	
	//함수란?
	//자바에서 객체와 상관없이 독립적으로 어떠한 기능을 수행 하는 일련에 코드 묶음이다,
	
	
}// end of class
