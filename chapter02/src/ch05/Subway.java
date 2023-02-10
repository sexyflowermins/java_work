package ch05;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	//생성자 - 리턴 타입없고 , 클래스 이름과 같다
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		this.money +=money;
		this.passengerCount++;
	}
	public void showInfo() {
		System.out.println(this.lineNumber + "호선의 다음 열차는 6분뒤 입니다");
	}
	public void showInfo1() {
		System.out.println(this.lineNumber + "호선의 다음 열차는 4분뒤입니다");
	}
	public void showInfo2() {
		System.out.println("지하철 호선 :"+this.lineNumber);
	}
}
