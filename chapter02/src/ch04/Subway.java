package ch04;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int count) {
		this.passengerCount += count;
		this.money += (1_2500*count);
		System.out.println(count +"명의 승객이 탑니다.");
	}
	
	public void takeOut(int count) {
		this.passengerCount -= count;
		System.out.println(count +"명의 승객이 내립니다.");
	}	
	
	public void showInfo() {
		System.out.println("상태창");
		System.out.println("지하철 호선 번호 : "+this.lineNumber);
		System.out.println("승객수 : "+this.passengerCount);
		System.out.println("수익금 : "+this.money);
	}
}
