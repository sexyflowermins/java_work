package ch04;

public class ForMainTest2 {
//코드의 시작점 main
	public static void main(String[] args) {

		// 이중 for문을 사용하여 2~9단까지 출력해주세요
		// for 문의 지정하는 변수는 포문의 중괄호가 끝이 나면 사용할수없다
		for (int j = 2; j < 10; j++) {
			System.out.println(" ");
			for (int i = 1; i < 10; i++) {
				System.out.println(j + " * " + i + "=" + (j * i));
			}
		} // end of for

		int num = 5;
		
		for (int a = 1; a <= num; a++) {
			
			for (int b = 1; b < a * 2; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}// end of main

}// end of class
