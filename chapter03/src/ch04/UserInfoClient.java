package ch04;

public class UserInfoClient {

	//main --> 실행하는 코드작성
	public static void main(String[] args) {
		
		// 사용자 한테 정보를 입력 받는다!!
		//String userName, String pw
		//스캐너 활용 --> 이름 한글자이상. 비밀번호 특문 포함
		String inputUserName = "홍길동";
		String inputUserPw = "1234";
		// 위에 받은 데이터를 Object 타임으로 변환 -> DTO
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
//		userInfo.showInfo();
		
		//위에는 클라이언트 쪽 코드(개발자가 작성)
		/////////////////////////////////////
		//만약에 동작이 사용자의 정보를 입력하는 기능이 필요하다면
		//필요한 객체를 가져와서 사용하기만 하면 됩니다.
		UserInfoMysqlDao dao = new UserInfoMysqlDao();
		
		//dao.insertUserInfo(userInfo);
		//dao.updateUserInfo(userInfo);
		
		
		
//		dao.insertUserInfo(userInfo);//저장 하는기능
//		dao.updateUserInfo(userInfo);//수정하는 기능
//		dao.deleteUserInfo(inputUserName);// 삭제하는기능
//		dao.selecteUserInfo(inputUserName);//조회하는 기능

	}//end of main

}//end of class
