package ch12;

public abstract class Computer {

	public abstract void display();
	
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 킵니다");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
	
	public static void main(String[] args) {
		
		Computer[] computers = new Computer[300];
		
		computers[0] = new DeskTop();
		computers[1] = new DeskTop();
		computers[2] = new MyNoteBook();
		for (int i = 0; i < computers.length; i++) {
			if(computers[i] != null) {
				computers[i].display();
				if(computers[i] instanceof MyNoteBook) {
					System.out.println("섹시꽃남민우의 노트북이네요");
				}
			}
		}
		
		
		Computer desktop = new DeskTop(); 
		Computer myNoteBook = new MyNoteBook();		
		
//		desktop.turnOn();
//		desktop.turnOff();
//		desktop.display();
//		desktop.typing();
//		myNoteBook.turnOn();
//		myNoteBook.turnOff();
//		myNoteBook.typing();
//		myNoteBook.display();
	}
}
