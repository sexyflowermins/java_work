package ch08;

public class NumberPrinter2 {

	private int id;
	//private static int waitNumber;
	public static int waitNumber;

	// 생성자는 맨먼저 실행 되고 한번만 수행이 된다
	public NumberPrinter2(int id) {
		this.id = id;
		//this.waitNumber = 1;
	}

	// 번호 표를 출력 합니다.
	public void printWaitNumber() {
		System.out.println(" 대기 순번 " + waitNumber);
		waitNumber++;
	}

	
	//static 가 붙으면 거의 함수라고 보면됨
	//static 메서드 안에서는 맴버 변수를 활용할수없다
	//객체가 메모리에 올라갔다라는 보장을 하지 못하기 때문이다
	public static int getWaitNumber() {
		//id =100;
		return waitNumber;
	}
	
	
	//테스트코드
	public static void main(String[] args) {
		//정적 변수는 클래스 이름으로 접근 가능하다.
		NumberPrinter2.waitNumber ++;
		NumberPrinter2.waitNumber ++;
		NumberPrinter2.waitNumber ++;
		System.out.println(NumberPrinter2.waitNumber);
		
		NumberPrinter2 numberPrinter2 = new NumberPrinter2(1);
		System.out.println(NumberPrinter2.waitNumber);
		System.out.println("----------------------");
		System.out.println(numberPrinter2.getWaitNumber());
		//클래스 이름으로 static 메서드에 접근 해서 호출할수 있다.
		//객체가 생성 되기전에 사용이 가능하다
		NumberPrinter2.getWaitNumber();
	}
}
