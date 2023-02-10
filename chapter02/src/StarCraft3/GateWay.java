package StarCraft3;

public class GateWay {

	private String name;
	private int num;

	public GateWay() {
		this.name = "게이트 웨이";
	}

	// 배열 - 자료 구조
	// 질럿 생산 하기
	public Zealot[] createZealot(int num) {
		// 배열
		Zealot[] arr = new Zealot[num];

		System.out.println("질럿을" + num + "마리생산 합니다.");
		// new Zealot("질럿1");

		// index값
		// 모든 프로그래밍에서 인뎃스 시작은 0부터 시작
		for (int i = 0; i < num; i++) {
			//i = 0
			//i = 1
			//i = 2
			arr[i] = new Zealot("질럿1");
		}
		return arr;
	}

	// 드라군 생산하기
}
