package ch08;

public class EmployeeMainTest {
//main
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.setName("이순신");
		System.out.println(employee1.serialNum);
		
		Employee employee2 = new Employee();
		employee2.setName("홍길동");
		
		Employee employee3 = new Employee();
		employee3.setName("티모");
		

		//static 변수만 사용 하면
		//각각 객체가 가지는 상태값을 저장해야한다면
		System.out.println(Employee.serialNum);
		//맴버면수를 사용해야한다
		//이순신
		System.out.println(employee1.getEmployeeid());
		//홍길동
		System.out.println(employee2.getEmployeeid());
		//티모
		System.out.println(employee3.getEmployeeid());
	}//end of main

}//end of class
