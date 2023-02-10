package StarCraft3;

import java.util.Scanner;

public class MainTest2 {
//메인함수
	public static void main(String[] args) {
		final int ZEALOT = 1; 
		final int MARINE = 2; 
		final int ZEARGLING = 3; 
		final int GAME_END = 4;

		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zeargling zeargling1 = new Zeargling("저글링");
		
		Scanner sc = new Scanner(System.in);
		// 4번 누르기 전까지는 유닛이 게속 나오도록
		int untiChoice = -1;
		do {
			System.out.println("유닛을 선택하세요");
			System.out.println("1.질럿\t2.마린\t3.저글링\t4.종료");			
			//사용자한테 입력 값을 받아야함
			untiChoice = sc.nextInt();
			if(untiChoice == ZEALOT) {
				System.out.println("질럿이 선택 되었습니다.");

			}else if(untiChoice == MARINE) {
				System.out.println("마린을 선택 되었습니다.");

			}else if(untiChoice == ZEARGLING) {
				System.out.println("저글링이 선택 되었습니다.");

			}
		}while(untiChoice != GAME_END);
		System.out.println("게임이 종료 되었습니다.");

	}//end of main

}//end of class
