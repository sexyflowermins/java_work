package ch03;

public class GenericPrinterMainTest {
	public static void main(String[] args) {
		Power power = new Power();
		Plastic plastic = new Plastic();

		// 사용 방법
		GenericPrinter<Power> genericPrinter = new GenericPrinter<>();

		// 재료 넣기
		// 최상위 클래스인 Object 를 활용 하는것보다 안정적인 코드를 만들수 있다.
		// 또한 가독성도 높아진다
		// genericPrinter.setMaterial(plastic); // 컴파일 시점에 오류
		genericPrinter.setMaterial(power);

		// 재료 꺼내기
		//다운 캐스팅을 할필요가 없다,
		Power usePower = genericPrinter.getMaterial();
		//Plastic usePower = genericPrinter.getMaterial(); 
		// 잘못된 타입을 대입하면 컴파일 시점에서 오류를 잡아준다
		
		//결론: 보다 가독성 높고 안정적인 프로그래밍을 만들수 있다 
		//같은 변수이름 같은 기능이라면제네릭 프로그래밍을 설계하면된다

	}
}
