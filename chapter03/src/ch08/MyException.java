package ch08;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyException {
	public static void main(String[] args) {

		TxtFileInputManager inputManager = new TxtFileInputManager("test.txt");

		try {
			String result = inputManager.readTxrFileData();
			System.out.println("result " + result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end main
}// end class

class TxtFileInputManager {

	// 외부 파일을 내 메모리 상으로 가져올수 있는 녀석
	private FileInputStream fis;
	private String fileName;

	public TxtFileInputManager(String fileName) {
		this.fileName = fileName;
	}

	public String readTxrFileData() throws IOException {
		// IOException 부모!
		// FileNorFoundException 보다 부모
		fis = new FileInputStream(fileName);
		Properties prop = new Properties();
		prop.load(fis);
		// KEY=VALUE <-- 데이터를 읽어주는녀석
		// name=홍길동 --> 홍길동 --> 추출
		String name = prop.getProperty("name");
		return name;
	}
}

class MyABException extends IOException{
	//사용자 정의 예외 클래스도 만들수 있다!!
}




