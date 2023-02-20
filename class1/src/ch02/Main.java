package ch02;

public class Main {

	public static void main(String[] args) {
		Address address = new Address("사상구", "부산", "남영 114호", "716");
		Person person = new Person("홍길등",16 , address);
		
		System.out.println("name : "+ person.getName());
		System.out.println("Address : "+ person.getAddress().toString());
		//person 클래스에서 Address  를 참조 할수 있다
		//Address  에서는 Person 클래스를 참조 할수 없다.

	}//end of main

}//end of class
