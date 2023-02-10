package ch06;

public class Bank {

	// 아무것도 지정하지않으면 default (접근제어지시자)
	// int balance;
	//private -> class Bank 에서만 접근 가능하다
	private int balance;
	public String name;

	// 입금하다
	public void deposit(int money) {
		balance += money;
		showInfo();
	}

	// 출금하다
	public void withdraw(int money) {
		balance -= money;
		showInfo();
	}

	public void showInfo() {
		System.out.println("현재 계좌 잔액은 : " + balance + "입니다");
	}

	//get 메서드 만들기
	//get 는 read only 성질을 가진다 --> 데이터를 주입 받지 못하고 리턴만 시킨다
	public int getBalance() {
		return this.balance;
	}
	
	//set 메서드 만들기 -> 외부에서 값을 주입 받을수 있도록 설계
	public void setBalance(int money) {
		if(money <= 0) {
			System.out.println("잘못된 입력 값입니다.");
			//return; // <-- 함수, 메서드 의 실행을 종료한다
		}else {
			this.balance = money;			
		}
	}
	
	
	
	
	
}
