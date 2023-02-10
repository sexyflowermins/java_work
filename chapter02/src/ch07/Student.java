package ch07;

public class Student {

	String name;
	int grade;
	int money;
	
	public Student(String name,int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		System.out.println("bus 메소드 실행");
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubwey(Subwey wey) {		
		System.out.println("bus 메소드 실행");
		wey.take(1200);
		this.money -= 1200;
	}
	
	public void takeTexi(Texi texi) {		
		System.out.println("bus 메소드 실행");
		texi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println("학생의 이름은 :"+this.name);
		System.out.println("학생의 소지금 :"+this.money);
		System.out.println("---------------------");
	}
	
	
	
	
	
	
	
	
}
