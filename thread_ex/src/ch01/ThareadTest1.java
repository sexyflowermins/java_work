package ch01;

public class ThareadTest1 {
// 메인쓰레드
	public static void main(String[] args) {
		//작업단위 쓰레드 동작
		for(int i = 0;i<30;i++) {
			//System.out.print("i : "+i+"\t");
			System.out.print("-");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}//end of main

}//end of class
