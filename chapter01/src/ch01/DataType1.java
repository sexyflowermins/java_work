package ch01;

public class DataType1 {

	// 코드의 시작점 main 함수
	public void main(String[] args) {

		// 데이터 타입에 종류 (크게 2가지)
		// 1. 기본 데이터 타입(primitive data type)
		// 2.참조 타입(Reference Type)

		// 정수형(1,10,300) 데이터 타입
		// 크기가 다를수 있다
		byte b;// 1바이트 크기를 담을 수 있고 (8bit)
		short s;// 2바이트 크기를 담을 수 있다(16bit)
		int i;// 4바이트 크기를 담을 수 있다(32bit)
		long l;// 8바이트 크기를 담을 수 있다(64bit)

		b = 127;
		//b = -129;
		// 데이터 타입 byte 는 127 부터 -128 까지 담을수 있다.

		s = 128;
		// s = 200000000;

		// int 약 +- 21억 까지의 정수를 담을수 있다
		i = 2100000000;
		// i = 2200000000;

		//	L value = R value
		//컴퓨터 정수값의 기본단위는 int 이다.
		l = 2200000000L; // <- 점미사 (l)를 붙여주어야 사용 가능(l,L) 대소문자 둘다 가능

		
		//문제 : short 데이터 타입의 범위는
		
		System.out.println("32767-32768");
	}// and of main

} // end of class
