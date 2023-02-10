package ch04;

public class GameTest {

	public static void main(String[] args) {
		Warrior warrior = new Warrior(170);

		warrior.attack(1000);
		System.out.println("--------------");
		warrior.shield(500);
		System.out.println("--------------");
		warrior.portion();
		System.out.println("=====================================================");

		Wizard wizard = new Wizard(430);

		wizard.sunCool(35);
		System.out.println("--------------");
		wizard.evade(50);
		System.out.println("--------------");
		wizard.portion();
	}

}
