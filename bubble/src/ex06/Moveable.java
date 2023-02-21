package ex06;

public interface Moveable {
	public abstract void left();
	public abstract void right();
	public abstract void up();
	
	//default 문법 사용해보기 !!
	//후크매서드(구현부만 있고 로직은 없다
	//Moveable 구현하는 클래스에서 필요하다면 재정의 해서 써라
	default public  void down() {};
}
