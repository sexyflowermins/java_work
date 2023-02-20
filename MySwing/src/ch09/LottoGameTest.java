package ch09;

public class LottoGameTest {

	public static void main(String[] args) {

		LottoNumber lottoNumber = new LottoNumber();
		int[] ran = lottoNumber.getLottoNumber();
		System.out.println("로또 번호 뽑기 를 시작합니다");
		for (int i = 0; i < lottoNumber.getLottoNumber().length; i++) {
			System.out.print(ran[i] + "\t");
		}
	}
}
