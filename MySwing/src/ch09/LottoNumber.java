package ch09;

import java.util.Arrays;
import java.util.Random;

//기능
//랜덤 번호 발생 하는 클래스 
public class LottoNumber {

	public int[] getLottoNumber() {
		int[] lotto = new int[6];
		Random ran = new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = ran.nextInt(45) + 1;
			for (int e = 0; e < i; e++) {
				if (lotto[i] == lotto[e]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}
}
