package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx4 extends JFrame {

	// 맴버변수 선언 할게요
	private JButton[] buttons = new JButton[5];

	// 생성자는 메모리에 올라갈 떄 처음 실행 되는 코드
	// 구현부 안에서 순서도 중요하다
	public FlowLayoutEx4() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("배열 활용");
		setSize(600, 600);
		// static 변수나 함수는 클래스 이름으로도 접근 가능
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + (i + 1));
		}
	}

	private void setInitLayout() {

		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		for (int i = 0; i < buttons.length; i++) {
				add(buttons[i]);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutEx4();
	}
}
