package ex13;

public class MainTest2 {

	public static void main(String[] args) {

		int[] myNumbers = new int[10];

		myNumbers[0] = 10;
		myNumbers[1] = 4;
		myNumbers[2] = 100;
		myNumbers[3] = 23;
		myNumbers[4] = 51;
		myNumbers[5] = 1;
		myNumbers[6] = 6;
		myNumbers[7] = 88;
		myNumbers[8] = 42;
		myNumbers[9] = 31;

		// 오름 차순으로 정렬 해주세요
		// for , if 문 활용
		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = 1; j <= 100; j++) {
				if (myNumbers[i] < j) {
					System.out.println(myNumbers[i]);
				}
			}
		}
	}// main
}
