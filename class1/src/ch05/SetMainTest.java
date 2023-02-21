package ch05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMainTest {

	public static void main(String[] args) {
		
		//순서가 없고 중복 불가
		Set<Integer> set1 = new HashSet<>();
		//값을 추가 하는 방법(특징 기억)
		set1.add(1);
		set1.add(10);
		set1.add(100);
		set1.add(500);
		set1.add(1);
		set1.add(1);
		
		System.out.println(set1.toString());
		System.out.println(set1.size());
		
		//삭제 하는방법
		set1.remove(500);
		set1.remove(1000);//없는 요소를 삭제 요청 하더라도 오류 발생 하지않음!!!
		//set1.clear();//요소 전체 삭제
		System.out.println(set1.toString());
		
		//set 계열을 반복문 처리 할때 Iterator 타입으로 변환 처리 할수있다
		Iterator<Integer> iter = set1.iterator();//반복자로 형변환 처리
		//hasNext(),next()
		System.out.println(iter.next());
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
		
		
	}//end of main

}//end of class
