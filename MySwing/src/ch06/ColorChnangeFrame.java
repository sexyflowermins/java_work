package ch06;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorChnangeFrame extends JFrame implements ActionListener {
	// 이벤트 리스너에 대한 개념을 알자
	private JButton button1;
	private JButton button2;
	private JButton button3;
	public ColorChnangeFrame() {
		initDate();
		setInitLayout();
		addEventListener();
	}

	private void initDate() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("클릭 1");
		button2 = new JButton("클릭 2");
		button3 = new JButton("클릭 3");
	}

	private void setInitLayout() {
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);
		setVisible(true);
	}

	private void addEventListener() {
		// ColorChnangeFrame 은 다형성이 적용이 되어서 ActionListener 타입으로도 바라볼수있다
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}

	// 코드 테스트
	public static void main(String[] args) {
		new ColorChnangeFrame();
	}// end main

	//actionPerformed 호출 되어짐
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed 메소드 호출됨");
		System.out.println(e.toString());
		this.setBackground(Color.blue);
	}

}// end class
