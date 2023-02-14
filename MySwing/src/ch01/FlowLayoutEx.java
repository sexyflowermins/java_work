package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//배치관리자 연습 - FlowLaout
//components 수평, 수직 으로 배치해주는 녀석
public class FlowLayoutEx extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	// 문제1 버튼 6개를 만들어 화면 출력
	private JButton button4;
	private JButton button5;
	private JButton button6;

	public FlowLayoutEx() {
		// 초기화 값 세팅(메서드를 통해서 역할 분담) 순서도 중요하다
		initData();// 데이터
		setInitLayout();
	}

	public void initData() {
		setTitle("FlowLayout 연습");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		button3 = new JButton("button3");
		button4 = new JButton("button4");
		button5 = new JButton("button5");
		button6 = new JButton("button6");
	}

	public void setInitLayout() {
		// 배치관리자를 설정해보자.
		// FlowLayout
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 200));
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
	}

	// 코드테스드
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
