package StarCraft2;

import java.util.Iterator;

public class MainTest1 {

	public static void main(String[] args) {
		Zealot zealot1 = new Zealot("섹시꽃남질럿1");
		Zealot zealot2 = new Zealot("존잘질럿2");
		Marine marine1 = new Marine("3대500마린1");
		Marine marine2 = new Marine("로니콜먼마린2");
		Zeargling zeargling1 = new Zeargling("조각미남저글링1");
		Zeargling zeargling2 = new Zeargling("조각몸매저글링2");
		

		zealot1.attackMarine(marine2);			
		
		for (int i = 0; i < 5; i++) {
			marine1.attackZealot(zealot1);			
		}
		
		
		System.out.println(marine1.getHp());
		zealot1.showInfo();
		marine1.showInfo();
		marine2.showInfo();
		
		
		
	}

}
