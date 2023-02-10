package ch12;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("섹시꽃남 민우가 모니터 출력을 합니다");
	}
	
	@Override
	public void typing() {
			System.out.println("섹시꽃남 민우가 타자를 칩니다");
	}
}
