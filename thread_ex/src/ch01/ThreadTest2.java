package ch01;

public class ThreadTest2 {
//메인쓰레드
	public static void main(String[] args) {
		// 사용하는 방법 연습
		// 현재쓰레드가 누구야? 알아보는 명령어
		System.out.println("---------main 쓰레드 시작-----------");
		System.out.println(Thread.currentThread());

		// 작업자 하나 만들어내기(메인 쓰레드가 일함)
		Workered worker1 = new Workered("워커1");
		// 너가 위임 받은 일을 시작해--> start();
		worker1.start();

		// 쓰레드(작업자) 하나더 생성 해보기
		Workered worker2 = new Workered("워커2");
		worker2.start();

		System.out.println("---------main 쓰레드 종료-----------");

	}// end of main

}// end of class

//쓰레드 만들어 보기
//-상속을 활용한 쓰레드만들어보기
//쓰레드를 상속한 클래스 이다 . 즉 Worker 는 Thread 이기도 하다 다향성
class Worker extends Thread {

	private String name;

	public Worker(String name) {
		this.name = name;
	}

	// 약속 부분
	// start 라는 매서드를 통해서 쓰레드에게 일 시작 해라고 명령어를 줄수있다
	// 그럼 쓰레드는 이 run 메서드 안에 있는 부분을 수행 시킨다라고 -- 약속 되어있다
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker :" + name + " : " + i);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}// end of run

}
