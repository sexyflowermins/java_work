package ch12;

//public abstract class Human extends Animal {  --> 1.번 해결방안
//1.추상 메서드를 포함 하게 되면  추상 클래스로 만들어주면 된다
public class Human extends Animal {

	// 2.번
	// 부모클래스에 있는 추상 메서드를 자식 클래스에서
	// 일반 메서드로 재 정의 하였다
	@Override
	public void hunt() {
		// 1000줄
		System.out.println("Human 사냥을 합니다");
	}

}
