package StarCraft4;

public class MainTest3 {

	public static void main(String[] args) {
		Zealot zealot1 = new Zealot("조각미남 질럿");
		Marine marine = new Marine("섹시꽃남마린");
		
		zealot1.attack(marine);
		marine.showInfo();

	}//main end

}//class end
