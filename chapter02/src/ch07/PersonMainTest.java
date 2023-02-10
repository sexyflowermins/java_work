package ch07;

class Person {

	// this란 3가지
	// 1. 자기 자신으 가리킨다.
	// 2. 생성자에서 다른생성자를 호출할때 사용할수있다
	// 3. 자기자신의 주소(참조값,주소값)을 반환 시킬수 있다

	// 상태
	private String name;
	private int age;
	private String phone;
	private String gender;

	public Person(String name, int age) {
		// 자기 자신을 가리키는 this
		this.name = name;
		this.age = age;
	}

	// 생성자는 객체가 메모리에 올라갈때 제일 먼저 실행하는 코드이다
	public Person(String name, int age, String phone) {
		// new this();
		// 생성 자에서 다른생성자를 호출함
		this(name, age);
		this.phone = phone;
	}

	public Person(String name, int age, String phone, String gender) {
		this(name, age, phone);
		this.gender = gender;
	}

// 자기자신을 반환하는 this 는 빌더패턴을 만들어 낼수 있다.
	public Person getPerson() {
		// 3. 자기 자신의 주소값을 반환 시킬수 있다.
		return this;
	}

	public void showInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}

}// end of Person class

//XXX.java 파일 안에 여러개의 클래스 파일을 작성할수 있다
//단. XXX.java 파일 안에 public 을 가지는 클래스는 단하나만 선언 할수있다
//default 접근 제어 지시자 --> ch07에 있는 클래스 들은 사용가능
class PersonMainTest {
	// 메인함수
	// 메인함수는 메인함수 앞에 static 잠시 자리를 빌려서 사용한다.
	public static void main(String[] args) {
		Person person1 = new Person("홍길동", 100);
		person1.showInfo();

	}// end of main
}// end of PersonMainTest class