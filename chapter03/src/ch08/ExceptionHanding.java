package ch08;

import java.util.Scanner;

public class ExceptionHanding {

	public static void main(String[] args) {
		
		//try - catch - finally
		//finally? 언제사용할까?
		Scanner sc = new Scanner(System.in);

		try {
			int reuslt = sc.nextInt();			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();//자원 해제 용도로 많이 사용 된다.			
		}
		
		
		
		
	}//end of main
}//class
