package ch03;

public class Student {

	int studentId;
	int grade;
	//참조타입
	String name;
	//참조타입
	Subject Korea;
	Subject math;
	
//생성자
	public Student(int studentId, int grade, String name) {
		this.studentId = studentId;
		this.grade = grade;
		this.name = name;
		
		this.Korea = new Subject();
		this.math = new Subject();
	}
	
	//메서드
	public void showInfo() {
		System.out.println("**상태창**");
		System.out.println(this.name +" : 입니다");
		System.out.println(this.grade +" : 학년 입니다");
		System.out.println(this.studentId +" : 번 입니다");
		System.out.println(this.Korea.subjectName+"에 점수는"+this.Korea.score);
		//System.out.println(this.math.subjectName+"에 점수는"+this.math.score);
	}
	public void showInfo2() {
		System.out.println("**상태창**");
		System.out.println(this.name +" : 입니다");
		System.out.println(this.grade +" : 학년 입니다");
		System.out.println(this.studentId +" : 번 입니다");
		System.out.println(this.Korea.subjectName+"에 점수는"+this.Korea.score);
		System.out.println(this.math.subjectName+"에 점수는"+this.math.score);
	}

}
