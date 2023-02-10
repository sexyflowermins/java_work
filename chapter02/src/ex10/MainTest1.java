package ex10;

//다른 패키지에 .java 이라면 import 해야 사용 할수있다
import ch06.Bank;

public class MainTest1 {

	public static void main(String[] args) {
		
		Bank bankA = new Bank();
		//bankA.balance 접근 불가
        //why : 다른 패키지에서  default접근 제어 지시자를 접근할수없다
		bankA.name = "홍길동";
		//name 의 접근제어 지시자는 public 이기때문에
		//같은 프로젝트 안이라면 어디서든지 접근 가능하다
	}

}
