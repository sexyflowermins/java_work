package Ex;

import java.util.Arrays;
import java.util.Random;

//기능
//랜덤 번호 발생 하는 클래스 
//6개 번호를 리턴하는 기능 정렬 까지 책임
public class LottoNumber {

	final int LOTTO_NUMBER_SIXE = 6;

	// 6개 난수 발생 해서 배열을 리턴하는기능
	public int[] craeteNumber() {
		int[] lottoWinNum = new int[LOTTO_NUMBER_SIXE];
		Random random = new Random();
		for (int i = 0; i < lottoWinNum.length; i++) {
			lottoWinNum[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lottoWinNum[i] == lottoWinNum[j]) {
					i--;
				}
			} // end of inner
		}
		Arrays.sort(lottoWinNum);
		return lottoWinNum;
	}
}
