package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame {

	// 배열
	// 1 단계 버튼 2개 생성
	private JButton button1;
	private JButton button2;

	private FlowLayout flowLayout;

	// 베치관리자 FlowLayout 맴버 변수로 선언
	// 화면서 component
	public FlowLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("FlowLayoutEx2");
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		flowLayout = new FlowLayout(FlowLayout.LEFT, 10, 10);
	}

	private void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.RIGHT, 50, 200));
		add(button1);
		add(button2);
	}

	public static void main(String[] args) {
		new FlowLayoutEx2();
	}
}
