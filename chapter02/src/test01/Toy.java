package test01;

public class Toy {

	String name;
	public void showInfo() {
		System.out.println("상품명 : "+name);
	}
}

class End extends Toy{
	public End() {
		name = "꽝";
	}
}
class CarToy extends Toy{
	public CarToy() {
		name = "벤츠장난감";
	}
}
class BabiToy extends Toy{
	public BabiToy() {
		name = "바비인형";
	}	
}
class SwordToy extends Toy{
	public SwordToy() {
		name = "엑스칼리버";
	}
}