package ch07;

public class Subwey {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subwey(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money +=money;
		this.passengerCount++;
	}
	
	
}
