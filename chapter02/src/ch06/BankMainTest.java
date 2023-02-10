package ch06;

public class BankMainTest {

	public static void main(String[] args) {
		
		Bank bankB = new Bank();
		bankB.deposit(10_000);
		bankB.withdraw(6_000);

		//신입 개발자가 실수로 맴버 변수에 접근해서 수정
		//실수 --> 입금 (기능),출금(기능)
		//bankB.balance = 100_000; //private 선언 하는 순간 외부에서 접근 불가!!
		//실수한 가능성이 생긴다
		//예방 -> 접근 제어 지시자를 할당한다 --> private
		//정보 출력
		bankB.showInfo();
		
		//현재금액에대한 정보만 가지고싶다면
		//int currentBalance = 
		//현재 계좌 잔액을 지역 변수에 담아 보기
		//get 메서드 사용해보기
		int curretMoney = bankB.getBalance();
		System.out.println("curretMoney : " + curretMoney);
		
		//set 메서드 사용해보기
		bankB.setBalance(-200_000);
		bankB.showInfo();
		
	}//end of main

}//end of class
