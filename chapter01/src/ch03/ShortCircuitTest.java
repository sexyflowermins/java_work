package ch03;

public class ShortCircuitTest {
// 코드의 시작점 main
	public static void main(String[] args) {

		int num1 = 5;
		int i = 0;
		// F && T
		boolean value = ((num1 += 10) > 10) && ((i += 2) < 10);
		System.out.println(value);
		System.out.println("==================");
		System.out.println(num1);
		System.out.println(i);

		// short circuit evaluation 계산에서 앞자리에서 계산이 끝나면 뒤에 껀 취급안함
		System.out.println("==================");
		// F || T
		value = ((num1 += 10) > 10) || ((i += 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

		System.out.println("==================");
		// 문제

		// 문제 short circuit evaluation 평가 문제를 직접 2문제 만들어 주세요
		// 그리고 도전 과제 -> 실습 및 리뷰에 문제를 올려주세요

		// 1번 short circuit evaluation 사용을 하기 위하여 && 사용했을때
		// n1의 값은 변하였는데 n2의 값이 변하지 않았습니다. 이유의 대한 설명과 해당 수정사항을 적어주세요
		// 단 : n1의 값은 10이고 n2의 값은 20일때

		int n1 = 10;
		int n2 = 20;

		boolean value1 = ((n1 += 20) > 20) && ((n2 += 2) > 20);
		System.out.println(value1);
		System.out.println(n1);
		System.out.println(n2);

		System.out.println("==================");
		//2번  short circuit evaluation 의 기능을 알아보기 위하여 ||을 사용한 문제이다 
		// 하지만 n1과 n2의 연산이 적용되어 출력이되어서 short circuit evaluation의
		// 기능을 알아 보지 못하고 있습니다 해결방법과 설명은?
		
		int n3 = 10;
		int n4 = 20;

		boolean value2 = ((n3 += 15) > 20) || ((n4 += 2) > 20);
		System.out.println(value2);
		System.out.println(n3);
		System.out.println(n4);
		
	}// end of main

}// end of class
