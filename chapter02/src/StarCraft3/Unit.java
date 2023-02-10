package StarCraft3;

public class Unit {

	protected String name;
	protected int power;
	protected int hp;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void showInfo() {
		System.out.println("===상태창===");
		System.out.println("이름 :" + this.name);
		System.out.println("공격력 :" + this.power);
		System.out.println("생명력 :" + this.hp);
	}
	public void beAttacked(int power) {
		System.out.println(this.name + "공격을 당합니다.");
		this.hp -= power;
	}

	public void attack(Unit unit) {
		System.out.println(this.name+"이 "+unit.getName()+"을 공격합니다");
		unit.beAttacked(this.power);
	}
}
