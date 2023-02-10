package ch04;

public class MainTest1 {
//코드의 시작점 main
	public static void main(String[] args) {
		Bus bus = new Bus(100);
		bus.take(1);//태우다
		bus.take(1);//태우다
		bus.take(3);//태우다
		
		bus.takeOut(1);
		bus.showInfo();

		Subway subway = new Subway(50);
		subway.take(15);
		subway.take(17);
		subway.take(10);
		
		subway.takeOut(9);
		subway.takeOut(2);
		subway.showInfo();
	}//end of main

}//end of class
