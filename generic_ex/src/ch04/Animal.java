package ch04;

public class Animal extends Meterial{

	@Override
	public String toString() {
		return "동물입니다";
	}

	@Override
	public void doPrinting() {
		System.out.println("동물을 출력합니다");
	}
	
}
