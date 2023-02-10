package StarCraft;

public class ArrayMainTest {

	public static void main(String[] args) {
		
		//배열이란
		//연관된 데이터를 모아서 통으로 관리 하기위해서 사용하는 데이터 타입이다
		//변수라는것은 하나의 데이터를 저장하기 위한것이라면
		//배열은 여러개의 데이터를 하나의 변수에 저장하기 위한 것이다.
		//[]인뎃스 연산잔
		//배열을 선언할때 몇칸의 공간을 사용할지 지정해주어야한다
		int[] arr = new int[5];
		String[] arr2 = new String[5];
		//네모칸안에 값을 넣는 방법(index 연산 값 할당)
		arr[0] = 1;
		arr[1] = 100;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 300;
		
		arr2[0] = "섹시꽃남";
		arr2[1] = "존잘";
		arr2[2] = "조각미남";
		arr2[3] = "조각몸매";
		arr2[4] = "굿";
		
		
		
		//값을 확인하는 방법
		System.out.println(arr[2]);
		
	}//end of main

}//class
