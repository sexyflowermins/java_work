package ch02;

public class MainTest1 {
	public static void main(String[] args) {
		Power power = new Power();
		Plastic plastic = new Plastic();
		ThreeDPrinter3 threeDPrinter3 = new ThreeDPrinter3();
		// 재료넣기
		threeDPrinter3.setMaterial(power);
		//재료 꺼내보기
		
		Plastic userPlastic = (Plastic)threeDPrinter3.getMaterial();
		
		//Object <-- 불편한 점들이 존재한다
		//다운캐스팅 처리 해야하고
		//런타임 시점에 잘못된 처리를 하게된다면 예외를 발생시킬수있다.
		
		
	}
}
