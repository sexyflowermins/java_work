package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		Father father = new Father(account);
		Mother mother = new Mother(account);
		
		// 아버지 입금하기
		father.start();
		//어머니 출금
		mother.start();
		
	}

}
