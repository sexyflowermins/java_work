package ex13;

import java.util.Random;

public class MainTest {

	public static void main(String[] args) {
		Random random = new Random();
		int random1 = random.nextInt(19);
		// 우리반 학생 이름 들을배열에 담아주세요
		// 랜덤 클래스를 사용해서
		// 한명을 추출해주세요
		String[] name = new String[20];
		name[0] = "김민우";
		name[1] = "강민정";
		name[2] = "김경은";
		name[3] = "김미정";
		name[4] = "김유주";
		name[5] = "김지현";
		name[6] = "김효린";
		name[7] = "박성희";
		name[8] = "배진석";
		name[9] = "손주이";
		name[10] = "오세훈";
		name[11] = "이서영";
		name[12] = "이지운";
		name[13] = "이현서";
		name[14] = "전대영";
		name[15] = "정다운";
		name[16] = "편용림";
		name[17] = "한범진";
		name[18] = "백다운";
		name[19] = "이치승";

		for (int i = 0; i < name.length; i++) {
			if (i == random1) {
				System.out.println(name[i]);
			}
		}

	}// main

}// class
