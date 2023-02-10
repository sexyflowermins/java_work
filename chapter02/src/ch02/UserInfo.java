package ch02;

public class UserInfo {

	String userId;
	String userName;
	String phone;
	
	//사용자 정의 생성자를 만들어주세요 매개변수 3개 한번에 사용
	public UserInfo(String userId,String userName,String phone) {
		this.userId = userId;
		this.userName = userName;
		this.phone = phone;
	}
	
	//사용자 정의 생성자 만들기 userId : userName;
	public UserInfo(String userId,String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	//사용자 정의 생성자 만들기 userId;
	public UserInfo(String userId) {
		this.userId = userId;
	}
	//기본생성자 만들기
	public UserInfo() {
		
	}
	
	public void Info5() {
		System.out.println("=========상태창=========");
		System.out.println("유저의 ID값은 : " + userId);
		System.out.println("유저의 이름은 : " + userName);
		System.out.println("유저의 주소은 : " + phone);
		System.out.println("=======================");
	}
}
