package ch12;

public class Person extends Human {

	@Override
	public void hunt() {
		// 1000줄은 부모 메서드와 똑같아야함
		super.hunt();// 부모에 있는 메서드를 호출 하라!!
		System.out.println("임마는 사람이야!!!");
		//
	}

}
