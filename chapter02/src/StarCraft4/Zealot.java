package StarCraft4;

public class Zealot extends Unit implements StarCraftIn {

	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		this.hp =  80;
	}

	@Override
	public void attack() {
		System.out.println(this.name+"이 "+getName()+"찌르기을 공격합니다");
		beAttacked(this.power);		
	}

	@Override
	public void beAttacked() {
		System.out.println(this.name + "공격을 당합니다.");
		this.hp -= power;	
	}

	@Override
	public void typeAttack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void typeBeAttacked() {
		// TODO Auto-generated method stub
		
	}


	// 자기 자신이 공격을 당합니다



	

}
