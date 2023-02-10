package ex11;

public class Warrior extends Hero{
	
	public Warrior(String name, int hp) {
		//부모클래스에 사용자정의 생성자가 있다면 
		//부모생성자를 반드시 호출 하여야한다
		//System.out.println("111111111"); 부모정의 생성자가 있으면 먼저호출해주어야한다
		super(name,hp);//부모생성자를 호출 하는 녀석이다.
		System.out.println("Warrior 생성자 마지막 줄 코드");
	}
	void comboAttack() {
		System.out.println(name+"가 2단 공격을 합니다");
	}
	public static void main(String[] args) {
		Warrior warrior = new Warrior("야스오", 100);
		warrior.comboAttack();
		
		//메서드 오버로딩
		//System.out.printIn()이다
		
	}
}
