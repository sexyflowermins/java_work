package ch01;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx2 extends JFrame {
	// BorderLayout <-- 컴포먼트를 동서남북 센터로
	JButton[] buttons = new JButton[5];
	String[] direction = { BorderLayout.EAST, BorderLayout.WEST, BorderLayout.SOUTH, BorderLayout.NORTH,
			BorderLayout.CENTER };

//	JButton buttons1 = new JButton("동");
//	JButton buttons2 = new JButton("서");
//	JButton buttons3 = new JButton("남");
//	JButton buttons4 = new JButton("북");
//	JButton buttons5 = new JButton("선터");

	public BorderLayoutEx2() {
		initData();
		setinitLayout();
	}

	private void initData() {
		setTitle("borderlayout 연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(direction[i]);
		}
	}

	private void setinitLayout() {
		// setLayout();
		// borderlaout 은 매게변수 값 하나를 더 추가할수 있다(방향지정가능)
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i], direction[i]);
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutEx2();
	}// main

}
