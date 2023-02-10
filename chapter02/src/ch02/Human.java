package ch02;

public class Human {

	String name;
	int height;
	int weight;
	boolean isMan;
	//생성자는 객체가 메모리에 올라갈때 가장먼저 수행되는 코드 이다.
	public Human() {
		//필요하면 초기화 값을 식을 사용가능 또는 메소드 호출도 가능하다
//		 if(this.isMan == true) {
//			 System.out.println("Man");
//		 }else {
//			 System.out.println("girl");
//
//		 }
//		this.name = "아무개";
//		showInfo(); //필요하다면 메서드 호출도 가능하다
		
	}
	//식을 추가해줄수도 있다
	public void showInfo() {
		System.out.println("===========상태창===========");
		System.out.println("키 : "+height);
		System.out.println("몸무게 : "+weight);
		System.out.println("성별 : "+ isMan);
		System.out.println("이름 : "+ name);
	}
	
}
