package ch07;

public class MainTest3 {

	public static void main(String[] args) {
		Student student1 = new Student("21605034", "김민우");
		Student student2 = new Student("21604534", "김민우");
		Student student3 = new Student("21605054", "김미니");
		System.out.println(student1);
		System.out.println("------------------------------");

		if (student1.equals(student2)) {
			System.out.println("동명이인 입니다");
		} else {
			System.out.println("동명이인이 아닙니다");
		}

		boolean result1 = student1.equals(student3);
		boolean result2 = student1.equals(student2);
		System.out.println(result1);
		System.out.println(result2);

	}

}
