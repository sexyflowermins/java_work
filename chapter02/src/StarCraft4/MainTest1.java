package StarCraft4;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zealot zealot1 = new Zealot("전하무적질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		Marine marine1 = new Marine("귀신잡는해병마린1");
		Marine marine2 = new Marine("마린2");
		Zeargling zeargling1 = new Zeargling("저글링1");
		Zeargling zeargling2 = new Zeargling("저글링2");
		
		zealot1.attack(marine2);
		zealot1.showInfo();
		marine1.showInfo();
		marine2.showInfo();
		
		Unit unit = new Zealot("질럿 유닛 테스트 1");
		unit.attack(marine2);
		marine2.showInfo();
		
		
		
	}

}
