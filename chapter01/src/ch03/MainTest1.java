package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		char myA = 'A';
		char youer = 'a';
		System.out.println((int) myA);// 65
		System.out.println((int) youer);// 97

		System.out.println("==================");
		System.out.println((short) myA);

		// 대입연산자 (=), 연산에 방향은 오른쪽에서 왼쪽으로 연산이 된다.
		int number = 10;
		// 변수에 변수를 대입 할수 있다.
		int number2 = number;
		System.out.println(number2);

		// 부호 연산자(+,-)
		System.out.println("==================");
		System.out.println(-number);
		
		System.out.println(number);
		// 부호 연산자는 부호를 변경하는 연산자 이다
		//단. 변수에 있는 실제 값을 변경한 상태는 아니다
		//실제 값을 변경 하려면 대입 연산자를 사용하면 된다.
		
		number = -number;
		System.out.println(number);
	}

}
