package ch08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionHanding2 {

	public static void main(String[] args) {
		Myfile file = new Myfile();
		try {
			file.inputData("하이~~");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없네요");
		}

	}// end of main

}// end class

class Myfile {
	// throws 던진다-->
	// 누군가가 내가만든 Myfile 를 사용 할때
	// inputData 오류가 날수 있으니 예외처리 흐름은 사용 하는 사람이
	// 알아서 구현해!!
	public void inputData(String str) throws FileNotFoundException {
		FileInputStream fis;

		fis = new FileInputStream("test1.txt");
	}
}