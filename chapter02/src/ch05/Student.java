package ch05;

public class Student {

	String name;
	int money;
	int time;
	int choose;
	
	public Student(String name,int money) {
		this.name = name;
		this.money = money;
	}
	
	//학생이 버스를 탄다
	public void takeBus(Bus targetBus) {
		//지역 선언
		System.out.println("targetBus 메서드 실행됨");
		//targetBus.showInfo();
		//요금을 넣어야한다
		targetBus.take(1_200);
		this.money -= 1_200;
	}
	
	//학생이 지하철을 탄다
	public void takeSubway(Subway targetSubway) {
		System.out.println("targetSubway 메서드 실행됨");
		targetSubway.take(1_250);
		this.money -= 1_250;
	}
	
	//상태창 보기
	public void showInfo() {
		System.out.println("학생의 이름은 :"+this.name);
		System.out.println("학생의 소지금 :"+this.money);
		System.out.println("---------------------");
		
	}
	
}
