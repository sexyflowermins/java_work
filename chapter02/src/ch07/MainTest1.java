package ch07;

public class MainTest1 {

	public static void main(String[] args) {
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		Student studentE = new Student("Edward", 20000);
		
		Bus bus1 = new Bus(100);
		Subwey wey1 = new Subwey(1);
		
		
		studentJ.takeBus(bus1);
		studentT.takeSubwey(wey1);
		
		studentJ.showInfo();
		studentT.showInfo();
		
	}

}
