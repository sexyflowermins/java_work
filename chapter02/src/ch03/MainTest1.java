package ch03;

//객체지향 프로그래밍란
//객체와 객채간에 관계를 형성하고 상호 작용하게 코드를 설계해 나가는것
public class MainTest1 {

	public static void main(String[] args) {
		//1번 3,홍길동
		//2번 3,이순신
		Student studentHong = new Student(1,3,"홍길동");
		Student studentLee = new Student(2,3,"이순신");
		
		//변수로 접근해서 데이터 추가
		//컴파일 시점에 오류를 확인할수 없는 상태 였다.(실행 시점에 오류가 확인
		//메모리에 올라가지 않은상태 -- 
		//해결 방법 -1번 내부에서 초기화 하는 방법 -2번 외부에서 초기화하기
		studentHong.Korea.subjectName = "국어";
		studentHong.Korea.score = 90;
		studentHong.showInfo();
		//System.out.println(studentHong.Korea);
		
		//이순에 과목 국어 수학 이름 데이터를 입력
		//이순에 과목 점수 국어 100, 수학 5점 입력
		//출력하는 코드를 작성
		
		
		studentLee.Korea.subjectName = "국어";
		studentLee.Korea.score = 100;
		
		studentLee.math.subjectName = "수학";
		studentLee.math.score = 5;
		studentLee.showInfo2();
		
			
	}

}
