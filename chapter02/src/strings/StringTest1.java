package strings;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="반가워";// 1번 방식 --> 상수 풀 영역에 올라간다 
		String str2 =new String("반가워");// 2번 방식 --> 동적 메모리영역에 올라간다
		String str3 = new String("반가워");// 2번과 3번이 같을까요?
		String str4 ="반가워";//1번과 4번이 같을까요?
		
		// 값을 출력해보자
		System.out.println("str1"+str1);
		System.out.println("str2"+str2);
		
		//1방식과 2번 방식은 메모리 위치시키는 곳이 다르다
		//==연산은  값을 비교(기본데이터타입),클래스타입은 주소값을 비교한다
		
		
		//검증하기
		if(str1 == str2) {
			System.out.println("주소값이 같아요");
		}else {
			System.out.println("주소값이 달라요");
		}
		//검증하기
		if(str2 == str3) {
			System.out.println("주소값이 같아요");
		}else {
			System.out.println("주소값이 달라요");
		}
		//검증하기
		if(str1 == str4) {
			System.out.println("주소값이 같아요");
		}else {
			System.out.println("주소값이 달라요");
		}
		
		//결론
		//리터럴값으로 생성한 문자열은 상수 풀이라는 영역에 올라가고
		//동일한 문자열을 사용한다면 새로 생성 하지 않고 재활용하여 사용한다.
		//검증하기
		if(str1.equals(str2)) {
			System.out.println("문자열 같아요");
		}else {
			System.out.println("문자열이 달라요");
		}
		
		
		
		
	}//main

}//class
