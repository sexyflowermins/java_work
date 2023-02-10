package ch05;

public class UserMainTest {
//메인함수
	public static void main(String[] args) {
	//메모리를 올리고
		//값을 할당
		//화면에 출력
		User us1 = new User();
		
		
		us1.name = "SexyFlowerMins";
		us1.id = "Flower";
		us1.pw = "21605034";
		us1.add ="사랑시 고백구 행복동";
		us1.phone = "01023234646";
		
		System.out.println(us1.name);
		System.out.println(us1.id);
		System.out.println(us1.pw);
		System.out.println(us1.add);
		System.out.println(us1.phone);
		
		
		
		
	}//end of main
	
}//end of class
