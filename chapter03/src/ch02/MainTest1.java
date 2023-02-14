package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();
		ToyCar toyCar = new ToyCar();

		// 다형성
		RemoteController controller1 = televison;
		RemoteController controller2 = refrigerator;
		RemoteController controller3 = toyRobot;
		RemoteController controller4 = toyCar;

		// 다형성 -> 배열
		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = televison;
		remoteControllers[1] = refrigerator;
		remoteControllers[2] = toyRobot;
		remoteControllers[3] = toyCar;

		// 문제 1
		// for문 을 활용해서 전원을 전부다 켜주세요
		for (int i = 0; i < remoteControllers.length; i++) {
			// 0-->TV
			remoteControllers[i].turnOn();// 컴 파일 시점, turnOn, turnOff 확인가능
		}

		// index 값이 3번쨰 녀석이면 자기 자신의 타입을 화면에 풀력 해주세요
		for (int i = 0; i < remoteControllers.length; i++) {
			if (i == 3) {
				System.out.println("3번째 인덱스의 녀석은 ToyCar 입니다");
			}
		}
		// 문제3
		// 데이터가 로봇이면 맴버변수 name 출력
		for (int i = 0; i < remoteControllers.length; i++) {
			if (remoteControllers[i] instanceof ToyRobot) {
				// 업캐스팅 된상태이기떄문에
				// 자식 타입으로 바라보기 떄문에 다운캐스팅 개념을 알아야한다
				System.out.println(((ToyRobot) remoteControllers[i]).name);
			}
		}
		// 문제 4
		// 장난감 로봇에 소리 기능을 추가 해 달라는 요청
		// 냉장고에도 소리 나는 기능을 추가 해달라
		// 소리 라는 기능을 인터페이스로 설계

	}// end of main

}// end of class
