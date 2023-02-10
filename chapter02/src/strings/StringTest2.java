package strings;

public class StringTest2 {

	public static void main(String[] args) {
		//상수풀이라는 개념을 이해하였다,
		//실제 주소값을 찎어보자!!!
		//Student sKim = new Student();
		//System.out.println(sKim);<----- 주소값
		//Object 클래스 일때 확인가능
		
		String str1 ="반가워";// 1번 방식 --> 상수 풀 영역에 올라간다 
		String str2 =new String("반가워");// 2번 방식 --> 동적 메모리영역에 올라간다
		String str3 = new String("반가워");// 2번과 3번이 같을까요?
		String str4 ="반가워";//1번과 4번이 같을까요?
		
		//현재 String 주소값을 찍어보는 방법은?

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		//상수 풀에 생성된 문자열은 불변(immutable)이다
		str4 = str4 +" 홍길동";
		System.out.println(System.identityHashCode(str4));
		str1+=" : 하이";
		System.out.println(System.identityHashCode(str1));
		//상수풀 영역에 한번 생성된 문자열 값은 변경이 불가능 하다
		//str1+=" : 하이"; <-----------새로생선된다 -> 상수 풀 영역에
		
		
		//가,나,다,라,마,<------------ 계속 상수 풀영역에 메모리 사용한다
		//그래서 메모리를 효율적으로 사용하기 위해서
		//StringBuilder 클래스와 String Buffer 클래스를 알아야한다
		
		
		
	}

}
