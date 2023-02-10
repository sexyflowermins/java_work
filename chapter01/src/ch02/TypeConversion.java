package ch02;

/**
 * 여러줄 주석
 * @author GGG
 */
public class TypeConversion {
//main 함수 <-- 한줄 주석

	public static void main(String[] args) {
		// 형 변환
		// 자동 형 변환
		// 강제 형 변환
		int iNumber1 = 100;
		System.out.println(iNumber1);
		
		//자동 형 변환 
		double dNumber1 = iNumber1;
		System.out.println(dNumber1);//형이 변환 되었기 때문에 자신에 맞는 형태로 출력됨
		
		//문제 만들어보기
		System.out.println("+++++++++++++++++++++++");
		double dNumber2 = 0.0012345;
		System.out.println(dNumber2);
		//int iNumber2 = dNumber2; 큰거에서 작은걸로 바로는 못넣음
		
		//강제 형 변 환
		int iNumber2 = (int)dNumber2; // 개발자가 컴파일러한테 괜찮으니깐 강제로 넣어!
		//강제 형변환의 주의점 0이나옴 0.0012345가 아니라
		System.out.println(iNumber2);
		
		int iNumber3 = (int)10.95;// 강제형 변환시 소수점 단위는 그냥 버려버림
		System.out.println(iNumber3);
		
		double a;
		int b;

		//1.a 에 값 0.5를 담아보세요
		a = 0.5;
		//2.b에 10.5 리터널 값을 넣어보세요
		b = (int)10.5;
		//강제형 변환시 데이터 손실이 생길수도 있다
	}// end of main

}// end of class
