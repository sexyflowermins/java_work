package ch01;

public class Refrigerator extends HomeAppliances {

	@Override
	public void turnOn() {
		System.out.println("냉장고를 작동시킵니다");

	}

	@Override
	public void turnOff() {
		System.out.println("냉장고의 작동을끕니다");

	}

}
