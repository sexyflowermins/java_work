package ch06;

//코딩 어린이들이 많이 하는실후
public class Hero2 {

	// 식을 바로 사용 할수없다
	// 메서드 선언을 중첩으로 할수 없다
	//생성자에는 리턴 타입이 없다(선언부)
	//클래스 스코프 안에 사용 할수 있는 문법 
	// 변수 사용
	// 생성자 사용 가능
	// 메서드 사용 가능 
	//함수 사용 가능
	//내부 클래스 -->
	
	//private String name = 1 * 2 + 10;// <-- 사용불가 --> 메서드나 생성자 안에서 사용 가능
	private int hp;
	private int power;
	private double defense;
	private boolean die;

	public String getName() {
		//메서드안에 메서드를 선언할수없다
		//public void printArticle() {
			// 중괄호 범위를 잘 알아야한다
		//}
		//return this.name;
		return null;
	}
	// 함수이다 클래스 스코프 범위 밖에서는 문법을 작성할수없다
	public static int addNumber(int n1, int n2) {
		return n1+n2;
	}
}
