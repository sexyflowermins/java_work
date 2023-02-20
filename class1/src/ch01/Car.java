package ch01;

public class Car {
	
	private Engine engine;
	
	public Car(Engine engine) {
		//자동차 클래스는 엔진 클래스에 의존 합니다 -> 엔진클래스가 있어야 생성이 된다
		this.engine = engine;
	}
	
	public void start() {
		engine.start(); //생성자에 값을 주지않으면nullPoint ..... 
		System.out.println("Car started");
	}
}
