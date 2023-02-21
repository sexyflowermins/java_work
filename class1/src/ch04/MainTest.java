package ch04;

import java.util.ArrayList;
import java.util.Iterator;

public class MainTest {

	public static void main(String[] args) {
		
		//학생생성
		Student student1 = new Student(1, "Alice", "alice@gmail.com");
		Student student2 = new Student(2, "Bob", "bob@gmail.com");
		
		//과정생성
		Course course1 = new Course(1, "Math", "Math");
		Course course2 = new Course(2, "English", "English");
		
		//1번 학생이 Math 과정을 등록한다
		Enrollment enrollment1 = new Enrollment(1, student1, course1);
		Enrollment enrollment2 = new Enrollment(2, student2, course2);
		Enrollment enrollment3 = new Enrollment(3, student1, course2);
		
		//학생의 데이터에 내가 등록한 정보를 저장 시킬수 있다.
//		ArrayList<Enrollment> list = new ArrayList<>();
//		list.add(enrollment1);
//		student1.setEnrollments(list);
		//학생의 기능을 이용
		student1.addEnrollment(enrollment1); //0번째 인덱스 저장
		student1.addEnrollment(enrollment3); //1번째 자료구조에 저장
		
		student2.addEnrollment(enrollment2);//Bob 등록 신청 정보 저장
		
		//문제 1
		//밥가 신청한 과정에 이름을 출력하시오
		System.out.println(student2.getEnrollments().get(0).getCourse().getName());
		for(int i = 0;i<student2.getEnrollments().size();i++) {
			String studentName = student2.getName();
			Course course = student2.getEnrollments().get(0).getCourse();
			String courseName = course.getName();
			System.out.println(studentName+",courseName : " + courseName);
		}
		
		//문제 1
		//엘리스가 신청한 과정에 이름을 출력하시오
		System.out.println(student1.getEnrollments().get(0).getCourse().getName());
		System.out.println(student1.getEnrollments().get(1).getCourse().getName());
		for(int i = 0;i<student1.getEnrollments().size();i++) {
			String studentName = student1.getName();
			Course course = student1.getEnrollments().get(0).getCourse();
			String courseName = course.getName();
			System.out.println(studentName+",courseName : " + courseName);
		}
		//문제3 위 코드는 학생과 과목을 Enrollment 클래스를 통해서 연결하는 예제 코드이다
		System.out.println("---------------------------");
		//Enrollment 학생 정보와 과목정보를 반복문을 통해서 출력해 주세요
			System.out.println("학생이름 : "+student1.getName());
			System.out.println("수강 과목 : "+student1.getEnrollments().get(0).getCourse().getName());
			System.out.println("---------------------------");
			//문제4 ArrayList 생성해서 저장해주세요
			ArrayList<Enrollment> enrollmentList = new ArrayList<>();
			enrollmentList.add(enrollment1);
			enrollmentList.add(enrollment2);
			enrollmentList.add(enrollment3);
			//System.out.println(enrollmentList.toString());
			for (Enrollment e : enrollmentList) {
				System.out.println(e.getStudent().getName());
				System.out.println(e.getCourse().getName());
				System.out.println("=======================");
			}
			
			//foreach 문 써서 엘리스가 수강하고 있는 과목명을 한번더 출력하시오
			//student1 로 접근
			System.out.println("=======================");
			for (Enrollment enrollment : student1.getEnrollments()) {
				System.out.println(enrollment.getCourse().getName());
			}
			
	}
}
