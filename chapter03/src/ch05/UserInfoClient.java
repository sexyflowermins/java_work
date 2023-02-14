package ch05;

public class UserInfoClient {

	static String dbName = "MSSQL";
	//main --> 실행하는 코드작성
	public static void main(String[] args) {
		
		
		// 사용자 한테 정보를 입력 받는다!!
		//String userName, String pw
		//스캐너 활용 --> 이름 한글자이상. 비밀번호 특문 포함
		String inputUserName = "홍길동";
		String inputUserPw = "1234";
		// 위에 받은 데이터를 Object 타임으로 변환 -> DTO
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);

		IUserInfoDao dao;
		if(UserInfoClient.dbName.equals("MYSQL")) {
			dao = new UserInfoMysqlDao();
		}else {
			dao = new UserInfoMsSqlDao();
		}
		
		//저장기능
		dao.insertUserInfo(userInfo);
		


	}//end of main

}//end of class
