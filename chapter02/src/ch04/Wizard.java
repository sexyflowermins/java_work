package ch04;

//마법사 클래스 설계하기
public class Wizard {

	int lebel;
	int stat;
	int mp;

	public Wizard(int lebel) {
		this.lebel = lebel;
		this.mp = this.lebel * 10_000;
	}

	public void sunCool(int power) {
		System.out.println("마법사가" + power + "번 마법을 사용니다.");
		this.mp -= power * 100000;

		System.out.println("마법사의 MP가" + power * 10000 + "감소 합니다.");
		System.out.println("마법사의 남은MP는" + this.mp + " 입니다.");
	}

	public void evade(int move) {
		System.out.println("마법사가" + move + "번 회피를 합니다.");
		this.mp += move * 1000;

		System.out.println("마법사의 mp가" + move * 1000 + "증가 합니다.");
		System.out.println("마법사의 남은mp는" + this.mp + " 입니다.");
	}

	public void portion() {
		if (this.mp <= 1000000) {

			System.out.println("마법사의 남은mp가 " + this.mp + "로 1000000 이하입니다 포션을 먹으세요");
		}
	}

}
