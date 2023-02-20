package ch05;

public class BoxMainTest {

	public static void main(String[] args) {
		// Box<String> box = new Box<>();

		Box<Sword> box1 = new Box<>();
		Sword sword = new Sword();
		// sword.put();
		box1.put(sword);
		// System.out.println("===============");
		Sword log = box1.take();
		System.out.println(log);
		log.doPrinting();

		Box<Gun> box2 = new Box<>();
		Gun gun = new Gun();
		box2.put(gun);
		Gun right = box2.take();
		right.doPrinting();

//		String msg = box.take(box);
//		System.out.println("msg : " + msg);
//		System.out.println(box.isEmpty());
//		

	}

}
