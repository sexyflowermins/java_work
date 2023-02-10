package ch01;

public class MainTest2 {

	public static void main(String[] args) {
		Student studentA = new Student();
		
		studentA.studentId = 1;
		studentA.studentName = "김민우";
		studentA.address = "부산시 사상구";
		studentA.studentNum = 90;
		studentA.studentTop = 3;

		studentA.study1();
		studentA.test();
		studentA.showInfo2();
	}

}
