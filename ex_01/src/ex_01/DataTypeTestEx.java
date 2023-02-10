package ex_01;

public class DataTypeTestEx {
//main
	public static void main(String[] args) {
		// 정수형->int가 기본값이라 long에 접미사(int는 21억이 최대)
		int a = 2100000000;
		long b = 2200000000l;
		// 문자형
		char c = 'A';
		// char c2 = 'AB'; // 문자 2개를 사용하지 못함
		// 실수형 -> 더블이 기본값이라 float에 접미사
		float d = 0.12345678f;
		double e = 200.0035;
		// 논리형 -> 참거짓을 사용
		boolean f = false;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

	}// end of main

}// end of class
