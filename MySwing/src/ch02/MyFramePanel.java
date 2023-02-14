package ch02;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFramePanel extends JFrame {

	private JButton button1;
	private JButton button2;
	// 패널 : 컴포먼트들을 그룹화 시킬수 있닥 즉 가가에 배치관리자를 지정하수있다
	private JPanel panel1;
	private JPanel panel2;

	public MyFramePanel() {
		initDate();
		setIntiLayout();
	}

	private void initDate() {
		setTitle("패널 추가 연습");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		panel1.setBackground(Color.red);
		panel2 = new JPanel();
		panel2.setBackground(Color.yellow);

		// 버튼 초기화
		button1 = new JButton("버튼1");
		button2 = new JButton("버튼2");

	}

	private void setIntiLayout() {
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		// 루트패널 기본레이아웃은 borderLayout 였는데
		// 하지만 추가적으로 만들어 사용하는 Panel 은 기본 레이아웃이 FLowLayout이다.

		panel1.add(button1);
		// panel1.setLayout(null);

		panel2.add(button2);

		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFramePanel();
	}
}
