package ch02;

public class UserInfoMainTest {

	public static void main(String[] args) {
		// 기본 생성자는 사용자 정의 생성자가 하나라도 있으면 만들어 주지않는다
		UserInfo userInfo1 = new UserInfo();
		userInfo1.userId = "Flower";
		userInfo1.userName = "김민우";
		userInfo1.phone = "010-3837-0000";
		System.out.println(userInfo1.userId);
		System.out.println(userInfo1.userName);
		System.out.println(userInfo1.phone);
		
		
		UserInfo userInfo2 = new UserInfo("Flower");
		System.out.println(userInfo2.userId);
		
		UserInfo userInfo3 = new UserInfo("Flower", "김민우");
		System.out.println(userInfo3.userId);
		System.out.println(userInfo3.userName);
			
		UserInfo userInfo4 = new UserInfo("Flower", "김민우","010-3837-0000");
		System.out.println(userInfo4.userId);
		System.out.println(userInfo4.userName);
		System.out.println(userInfo4.phone);
		

		userInfo1.Info5();
		
	}//end of main

}//end of class
