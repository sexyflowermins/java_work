package ch01;

import javax.swing.JFrame;

// 생성 방법, 사용 방법을 이미 학습
// 만약에 코드가 JFarme을  상속 받았다면 단일 상속을 지원 하기때문에 다중상속을  할수 없다,
//그래서 인터페이스인 Runnable 구현 방법을 알아야한다.!!
public class RunableTest1 {

	public static void main(String[] args) {
		//사용하는 방법
		System.out.println("main thread 시작");
		SubWorker subWorker = new SubWorker();
		//subWorker.start(); <-- 현재 start 메서드가없다
		//subWorker 기능을 구현 했지 thread 상속을 받은것이 아니다.
		//그래서 thread 기능인 start 메소드가 없는 상태
		
		//!!!
		//생각 하는 방법 -- start 메서드는 thread 가 가지고 있다
		// 쓰레드 생성 할때 생성자에 Runnable 타입을 넣을수 있다고 한다 코드확인
		Thread thread1 = new Thread(subWorker);
		Thread thread2 = new Thread(subWorker);
		
		//시작 시점은 이벤트를 받던지 연산 후에 하던지 여러분들이 실행 시킬수 있다
		thread1.start();
		thread2.start();
		
		
	}//end of main

}//end of class

//설계하는 방법
class SubWorker extends JFrame implements Runnable{

	//쓰레드가 동작해야하는 부분을 run 안에서 작성함
	@Override
	public void run() {
		for(int i = 0;i<200;i++) {
			System.out.print("i : "+i+"\n");
		}
	}
	
	
}