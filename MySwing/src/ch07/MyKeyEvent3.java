package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyKeyEvent3 extends JFrame {

	private JTextArea area;
	// keyListener 구현클래스를 이라고 이름 붙였다
	private KeyListener keyListener = new KeyListener() {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		}
	};

	public MyKeyEvent3() {
		initDate();
		setInitLayout();
		addEventListener();
	}

	private void initDate() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);// 프레임 사이즈 조절 불가 설정
		area = new JTextArea();
	}

	private void setInitLayout() {
		add(area);
		setVisible(true);
	}

	private void addEventListener() {
		// 익명 클래스
		// 익명 구현 클래스!!
		// 인터페이스 + 추상 클래스를 구현클래스로 만들수 있다
		KeyListener keyListener;
		// 인터페이스는 new 할수없다
		// 하지만 인터페이스를 구현 클래스로 변형해서 사용할수 있다

	}

}
