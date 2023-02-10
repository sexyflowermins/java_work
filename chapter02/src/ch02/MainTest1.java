package ch02;

public class MainTest1 {
//메인함수
	public static void main(String[] args) {
		//기본생성자
		Student studentHong = new Student(); // 컴파일러가 알아서 넣어줌
		studentHong.grade = 1;
		studentHong.name = "홍길동";
		studentHong.number = 1234;
		//객체를 생성할때 반드시 하나 이상에 생성자가 있어야함
		
		Student studentKim = new Student("홍길동", 1234, 1);
		System.out.println(studentKim.name);
		System.out.println(studentKim.grade);
		System.out.println(studentKim.number);
		//객체를 생성 할때 강제성을 부여하는것
		
		//사용자 정의 생성자를 하나라도 만들었다면 컴파일러는 기본생성자를 만들어 주지 않는다.
		
		//생성자 --> 2개 (생성자는 여러개 만들수 있다)
		//생성자 오버 로딩 (생성자를 여러개 만들어 주는 기법)
	}//end of main

}//end of class
