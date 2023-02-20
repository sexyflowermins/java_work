package ch04;

public class MainTest {
	public static void main(String[] args) {
		
		GenericPrinter<Power> genericPrinter1 =new GenericPrinter<>();
		GenericPrinter<Plastic> genericPrinter2 =new GenericPrinter<>();
		GenericPrinter<Animal> genericPrinter3 =new GenericPrinter<>();
		//GenericPrinter<Water> genericPrinter3 =new GenericPrinter<>();
		
		//재료 넣기 
		genericPrinter1.setMaterial(new Power());
		genericPrinter2.setMaterial(new Plastic());
		genericPrinter3.setMaterial(new Animal());
		//문제 
		//제네릭을 활용 한 프로그램을 작성하고 테스트 해주세요
		
		genericPrinter1.getMaterial();
		Power power =new Power();
		System.out.println(power);
		
		
		
	}
} 
