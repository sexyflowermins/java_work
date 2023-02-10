package ch05;

import java.util.Scanner;

public class MainTast3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 객체 생성
		Student studentMin = new Student("김민우",47000);
		Bus bus1 = new Bus(169);
		Bus bus2 = new Bus(133);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		//1단계 = 사용해보기
//		bus1.showInfo();
//		bus2.showInfo();
//		subway.showInfo();	
		studentMin.showInfo();

		//2단계 = 실행의 흐름 만들어보기
		System.out.println("몇분에 집에서 나오셨습니까");
		studentMin.time = sc.nextInt();
	
		
		if(studentMin.time <= 10) {
			System.out.println("버스를 타고 가시는게 가장빠르십니다");
			System.out.println("두 버스중 어느버스를 이용하시겠습니까");
			bus1.showInfo2();
		    bus2.showInfo2();
		    studentMin.choose = sc.nextInt();
		    if(studentMin.choose == 169) {
		    bus1.showInfo();
		    }else if(studentMin.choose == 133){
		    	bus2.showInfo1();
		    }
		    studentMin.takeBus(bus1);
		}else if(studentMin.time > 10) {
			System.out.println("지하철를 타고 가시는게 가장빠르십니다");
			System.out.println("어느 호선의 지하철을 이용하시겠습니까");
			subway1.showInfo2();
			subway2.showInfo2();
		    studentMin.choose = sc.nextInt();
		    if(studentMin.choose == 1) {
		    subway1.showInfo();
		    }else if(studentMin.choose == 2) {
		    	subway2.showInfo1();
		    }
		    studentMin.takeSubway(subway1);
		}//end if		
		
			
		System.out.println("------------");
		studentMin.showInfo();
	}

}
