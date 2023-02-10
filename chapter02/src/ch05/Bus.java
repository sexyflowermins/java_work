package ch05;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	int time1;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	
	//기능
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	public void showInfo() {
		System.out.println(this.busNumber + ": 번의 버스를 선택하셨습니다 다음버스는 3분 뒤입니다");
	}
	public void showInfo1() {
		//public void showInfo1(Student studentMin) {
		System.out.println(this.busNumber + ": 번의 버스를 선택하셨습니다 다음버스는 5분 뒤입니다");
		//System.out.println(this.time1 + studentMin.time+"분 소요됩니다");
	}
	public void showInfo2() {
		System.out.println("버스번호 :"+this.busNumber);
	}
	
	
}
