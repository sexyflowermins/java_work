package ch07;

public class Student {

	// 학번과 이름을 정의 해주시고
	private String number;
	private String name;

	public Student(String number, String name) {
		this.number = number;
		this.name = name;
	}

	// toString --> 학번과 이름이 화면에 출력할수 있도록 설계
	@Override
	public String toString() {

		return "이름은 : " + "[" + this.name + "]" + " 학번은 : " + "[" + this.number + "]";
	}

	// equals 메서드를 제정의 해주세요
	// 이름이 같다면 동명이인 입니다
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Student) {
			Student targetStudent = (Student) obj;
			if (this.name == targetStudent.name) {
				// System.out.println("동명이인 입니다");
				return true;
			}
		}
		return false;
	}

}// end class
