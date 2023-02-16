package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionHanding {

	public static void main(String[] args) {

		// 파일 <-- IO<--!!!
		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("temp");// <-- 예외가 발생할수있다라고 알려준다
//		} catch (FileNotFoundException f) {
//			System.out.println("temp 라는 파일이 없습니다");
//		}

//		try-catch-finally

		try {
			fis = new FileInputStream("test1.txt");
			return;
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일명 확인해주세용!! 힛");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 반드시 수행되는 코드
			// 심지어 return 키워드를 만나더라도 실행이된다 !! 아주 강력한 녀석
			System.out.println("finally 실행");
		}
		System.out.println("비정상 종료 되지않음");

	}// end of main

}// end class
