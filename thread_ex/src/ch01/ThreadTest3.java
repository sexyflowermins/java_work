package ch01;

public class ThreadTest3 {
	public static void main(String[] args) {
		System.out.println("시작");
		Workers worker1 = new Workers("김민우");
		Workers worker2 = new Workers("섹시꽃남 민우");
		worker1.start();
		worker2.start();
		
		
		
		System.out.println("끝");
	}// end main
}// end class

class Workers extends Thread {
	private String name;

	public Workers(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 1; i <= 17; i++) {
			System.out.println("일용직 노동자 : " + name + "가" + i + "가지의 일을 합니다");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
