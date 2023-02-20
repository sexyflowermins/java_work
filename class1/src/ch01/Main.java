package ch01;

public class Main {

	public static void main(String[] args) {
		//자바에서 의존 관계 란 한 클래스가 다른 클래스를 사용하는 관계를 말한다
		//자동차 클래스가 엔진 클래스를 사용한다면 자동자클래스는 엔진 클래스의 
		//의존한다라고도 말할수 있다
		Engine engine = new Engine();
		Car car = new Car(engine);
		car.start();
		
		
		
	}//end of main

}//end of class
