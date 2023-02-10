package ch08;

public class MainTest2 {
//메인함수
	public static void main(String[] args) {
		//클래스 안에 맴버 변수를 사용할려면
		//반드시 먼저 메모리에 올려야 한다.
		
		
		//수행 요청 - 클래스이름.
		System.out.println(NumberPrinter.waitNumber);
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		System.out.println(NumberPrinter.waitNumber);
		
		//static 은문법적으로  class xxx {} 안 에 작성하지만 static 키워드를 가진녀석은
		//잠시 자리만 빌려서 문법만 쓸뿐 메모리를 사용하는 영역은 미리 뜨는 static 영역이다.
		
	}//end of main

}//end of class
