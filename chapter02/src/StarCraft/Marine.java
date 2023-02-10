package StarCraft;

public class Marine {

	private String name;
	private int power;
	private int hp;
	
	
	public Marine(String name) {
		this.name = name;
		this.power = 4;
		this.hp =  70;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPower() {
		return this.power;
	}
	public int getHp() {
		return this.hp;
	}
	//마린이 질럿을 공격합니다
	public void attackZealot(Zealot zealot) {
		System.out.println(this.name+"이 "+zealot.getName()+"을 공격합니다");	
	}
	
	
	//마린이 저글링을 공격합니다
	public void attackZergling(Zeargling zeargling) {
		System.out.println(this.name+"이 "+zeargling.getName()+"을 공격합니다");	
	}
	
	
	//자기 작신이 공격을 당합니다
	public void beAttacked(int power) {
		System.out.println(this.name + "공격을 당합니다.");
		this.hp -= power;
	}
	
	public void showInfo() {
		System.out.println("===상태창===");
		System.out.println("이름 :" + this.name);
		System.out.println("공격력 :" + this.power);
		System.out.println("생명력 :" + this.hp);
	}
}
