package StarCraft4;

public class GateWayMainTest {

	public static void main(String[] args) {
		
		GateWay gateway1 = new GateWay();
		Zealot[] zealots = gateway1.createZealot(30);
		System.out.println(zealots[0]);
		System.out.println(zealots[1]);
		System.out.println(zealots[2]);
		System.out.println(zealots[3]);
		System.out.println(zealots[4]);
		System.out.println(zealots[5]);

	}

}
