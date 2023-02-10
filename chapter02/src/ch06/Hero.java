package ch06;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean die;
	
	
	
	// getter 메서드 직접 만들어보세여 5개
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getPower() {
		return this.power;
	}
	public double getDefense() {
		return this.defense;
	}
	public boolean getDie() {
		return this.die;
	}
	// setter 메서드 직접 만들어보세여 5개
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		if(hp <= 0) {
			System.out.println("잘못된 입력 값입니다.");
		}else {
		this.hp = hp;
		}
	}
	public void setPower(int power) {
		this.power = power;
	}
	public void setDefense(double defense) {
		this.defense = defense;
	}
	public void setDie(boolean die) {
		this.die = die;
	}
}
