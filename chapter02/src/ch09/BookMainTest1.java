package ch09;

public class BookMainTest1 {
//매인함수
	public static void main(String[] args) {
		
		//연관된 하나의 데이터를 통으로 관리 하고싶다면 -배열
		Book[] books = new Book[5];
		books[0] = new Book("플러터UI실전","김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다","김진명");
		books[2] = new Book("흐르는 강물처럼","파울로코엘료");
		books[3] = new Book("리딩으로리드하라","이지성");
		books[4] = new Book("사피엔스","유발하라리");
		
		//books[9] = new Book("홍길동전","허균");
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		
		//System.out.println(books[0].getTitle());
		//System.out.println(books[4].getAuthor());
		
		// books.length -->배열의 길이
		for(int i=0;i<books.length;i++) {
			//i-->1,2,3,4,5
			if(books[i] != null) {// 방어적 코드짜기
				System.out.println(books[i].getTitle());			
			}
		}
		//주의 1.
		//인덱스의 크기는 n-1 개이다
		//배열의 길이와 인덱스의 길이는 다르다
		//5
		//5-1
		//4
		
		//주의 2.
		//배열의 길이와 실제 들어가 있는 값에 갯수는 다를수있다.
		
		//문제
		//double 배열 4 선언해서 임의값 넣고 출력해주세여
		//4번쨰 인덱스는 값을 할당하지 마시오
		
		Double[] double1 = new Double[4];
		double1[0] = 32.7;
		double1[1] = 23.7;
		double1[2] = 35.7;
		
		
		for(int i = 0; i < double1.length;i++) {
			if(double1[i] != 0.0)
			System.out.println(double1[i]);
		}

		//문제 2 예제 북의 0번 인덱스와 2번 인덱스를 스왑하라
		Book temp = books[0];
		books[0] = books[2];
		books[2] = temp;
		//문제 3 3번의 값을 삭제해주세요
		
		books[3] = null;
		for (int i = 0; i < books.length; i++) {
			if(books[i] != null)
			books[i].showInfo();
		}
		
		
		
		
	}//end of main

}//end class
