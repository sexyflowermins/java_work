package ch04;

//전사 클래스 설계하기
public class Warrior {

	// 상태
	int lebel;
	int stat;
	int hp;

	// 기능
	public Warrior(int lebel) {
		this.lebel = lebel;
		this.hp = this.lebel * 10_000;
	}

	public void attack(int power) {
		System.out.println("전사가" + power + "번 공격을 합니다.");
		this.hp -= power * 1000;

		System.out.println("전사의 HP가" + power * 1000 + "감소 합니다.");
		System.out.println("전사의 남은HP는" + this.hp + " 입니다.");

	}

	public void shield(int move) {
		System.out.println("전사가" + move + "번 방어를 합니다.");
		this.hp += move * 500;

		System.out.println("전사의 HP가" + move * 500 + "증가 합니다.");
		System.out.println("전사의 남은HP는" + this.hp + " 입니다.");
	}

	public void portion() {
		if (this.hp <= 1000000) {

			System.out.println("전사의 남은HP가 " + this.hp + "로 1000000 이하입니다 포션을 먹으세요");
		}
	}

}
