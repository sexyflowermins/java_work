package test01;

import java.util.Random;
import java.util.Scanner;

public class MainTest {



	public static void main(String[] args) {

		Toy toy1 = new CarToy();
		Toy toy2 = new BabiToy();
		Toy toy3 = new SwordToy();
		Toy toy4 = new End();

		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 뽑으시겠습니까");
		int user = sc.nextInt();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int[] ranNumbers = new int[50];
		// 0 ~ 9
		for (int i = 0; i < user; i++) {
			ranNumbers[i] = randomNumber();
			// System.out.println(ranNumbers[i]);
			if (ranNumbers[i] == 11) {
				System.out.println(ranNumbers[i] + " 번을 뽑으셨습니다 " + toy1.name + " 입니다 ");
				count1++;
			} else if (ranNumbers[i] == 37) {
				System.out.println(ranNumbers[i] + " 번을 뽑으셨습니다 " + toy2.name + " 입니다 ");
				count2++;
			} else if (ranNumbers[i] == 15) {
				System.out.println(ranNumbers[i] + " 번을 뽑으셨습니다 " + toy3.name + " 입니다 ");
				count3++;
			} else {
				System.out.println(toy4.name);
			}
		}
		System.out.println("====================");
		if(count1  > 0) {
			System.out.println(toy1.name+"이 "+count1 + " 번 당첨 되었습니다");
		}
		if(count2  > 0) {
			System.out.println(toy2.name+"이 "+count2 + " 번 당첨 되었습니다");
		}
		if(count3  > 0) {
			System.out.println(toy3.name+"가 "+count3 + " 번 당첨 되었습니다");
		}
		// 사용자 입려값 받기
		//

	}// end of main

	// 랜덤 번호 하나 뽑기
	// 함수 : 랜덤
	public static int randomNumber() {
		Random random = new Random();
		return random.nextInt(45) + 1;
	}

}// end of class
