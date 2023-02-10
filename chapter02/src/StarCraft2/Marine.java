package StarCraft2;

public class Marine {

	private String name;
	private int power;
	private int hp;
	private int up;
	
	private int attackCount; 
	
	public Marine(String name) {
		this.name = name;
		this.power = 4;
		this.hp =  70;
		attackCount = 0;
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
		attackCount++;
		checkCount();
		System.out.println(this.name+"이 "+zealot.getName()+"을 공격합니다");	
		zealot.beAttacked(this.power);
	}
	
	private void checkCount() {
		if(attackCount >= 5) {
			System.out.println("레벨업");
			power += 4; 
		}
		if(attackCount == 5) {
			attackCount = 0;
		}
	}
	
	//마린이 저글링을 공격합니다
	public void attackZergling(Zeargling zeargling) {
		attackCount++;
		checkCount();
		System.out.println(this.name+"이 "+zeargling.getName()+"을 공격합니다");	
		zeargling.beAttacked(this.power);
	}
	
	
	//자기 작신이 공격을 당합니다
	public void beAttacked(int power) {
		if(this.hp <= 0) {
			System.out.println(this.name+"사망하였습니다");
			return;// 값을 반환 할떄 사용 할수 있고 실행의 종료를 시킬수 있다.
		}
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
