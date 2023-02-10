package ch02;

public class Student {

	//생성자 -  constructor
	//객체를 생성 할때 다음과 같은 모양으로 객체를 만들어라고 지시 하는것
	//강제성을 부여하는 거와 같다,
	//생성자는 객체를 생성 할때 반드시 존재 해야한다.!!
	
	String name;
	int number;
	int grade;
	// 생성자 만들어 보기 (사용자 정의 생성자)
	//문법 - 생성자는 리턴타입이 없다 파일 이름과 같다
	//대문자로 시작하고 있다, --> 대소문자 까지
	// 생성자를 선언 하는 문법(설계)
	public Student(String s, int n,int g) {
		name = s;
		number = n;
		grade = g;
	}
	//메게변수가 아무것도 없다 --> 기본생성자
	//사용자 정의 생성자를 만들지 않았다면(개발자가) 자동으로 코드를 넣어준다 ->컴파일러가
	public Student() {
		
	}
	
	
	
}
