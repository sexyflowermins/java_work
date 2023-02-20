package ch04;

public class Plastic extends Meterial{
	@Override
	public String toString() {
		return "플라스틱입니다";
	}

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력합니다");
		
	}
}
