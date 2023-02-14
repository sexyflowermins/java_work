package ch06;

import java.util.Scanner;

public class UserInfoClient {
	static String dbName = "Oracle";

	// main --> 실행하는 코드작성
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 오라클 DAO만들기
		// 스캐너를 통해서 사용자이름,비번 입력 받기
		System.out.println("사용자의 이름을 입력해주세여");
		String inputUserName = sc.nextLine();
		System.out.println("사용자의 비밀번호를 입력해주세요");
		String inputUserPw = sc.nextLine();

		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);

		// 흐름 만들기 1
		// 1저장기능

		IUserInfoDao dao;
		if (UserInfoClient.dbName.equals("Oracle")) {
			dao = new UserInfoOracleDao();
		} else if (UserInfoClient.dbName.equals("MYSQL")) {
			dao = new UserInfoMysqlDao();
		} else {
			dao = new UserInfoMsSqlDao();
		}
		dao.insertUserInfo(userInfo);
		// 2 수정기능
		dao.updateUserInfo(userInfo);

	}// end of main

}// end of class
