package ch09;

import java.util.Scanner;

public class BookStoreManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Book[] books = new Book[100];
		int lastIndex = 0;
		// 책을 저장하는 기능을 만들고
		// 정보를 출력 하는 프로그래밍 만들어주세요
		// 스캐너

		boolean flag = true;

		do {
			System.out.println("무엇을 하시겠습니까");
			System.out.println("1.저장\t2.전체조회\t\t3.선택조회\t\t4.전체삭제\t0.종료");
			String choice = sc.nextLine();

			if (choice.equals("1")) {
				System.out.println("저장을 선택하셨습니다");
				System.out.println("---------------");
				System.out.println("저장 하실 책을 입력해주세요");
				
				String title = sc.nextLine();
				String author = sc.nextLine();
				
				books[lastIndex] = new Book(title, author);
				lastIndex++;
				
				
			} else if (choice.equals("2")) {
				System.out.println("전체조회를 선택하셨습니다");
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						books[i].showInfo();
					}
				}
				
				
			} else if (choice.equals("3")) {
				System.out.println("선택조회를 선택하셨습니다");
				System.out.println("저자로조회를 선택하시겠습니까 제목으로조회를 선택하시겠습니까");
				String userInput = sc.nextLine();

				if (userInput.equals("저자")) {
					System.out.println("저자를 입력해주세요");
					String author1 = sc.nextLine();
					for (int j = 0; j < books.length; j++) {
						if(books[j] != null) {
							if (books[j].getAuthor().equals(author1)) {
								books[j].showInfo();
							}
						}
					}
				} else if (userInput.equals("제목")) {
					System.out.println("제목를 입력해주세요");
					String title1 = sc.nextLine();
					for (int i = 0; i < books.length; i++) {
						if (books[i] != null) {
							if (books[i].getTitle().equals(title1)) {
								books[i].showInfo();
							}
						}
					}
				}
			} else if (choice.equals("4")) {
				System.out.println("전체삭제를 선택하셨습니다");
				System.out.println("저장하신 정보들은 초기화 됩니다");
				System.out.println("---------------------");
				for(int i = 0; i < books.length; i++) {
					books[i]=null;
				}
			} else if (choice.equals("0")) {
				System.out.println("프로그램이 종료되었습니다");
				flag = false;
				break;
			}
		} while (flag);

		// 문자열 비교
		// 값을 비교하는 연산자 ==
		// 문자를 비교할떄 equals

		// while 문을 사용해서
		// crud에 개념
		// 1번 저장 2번 전체 조회 3. 선택조회 4. 전체삭제 0. 프로그램 종료

	}
}
