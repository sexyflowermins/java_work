package ch06;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChange extends JFrame implements ActionListener {

	private JPanel panel;
	private JButton button1;
	private JButton button2;

	public ColorChange() {
		initDate();
		setInitLayout();
		addEventListener();
	}

	private void initDate() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("버튼 1");
		button2 = new JButton("버튼 2");
		panel = new JPanel();
	}

	private void setInitLayout() {
		add(panel);
		panel.setBackground(Color.blue);
		panel.add(button1);
		panel.add(button2);
		setVisible(true);
	}

	private void addEventListener() {
		// this ->ColorChange->ActionListener 다형성 적용으로 이렇게도 볼수있다
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	// 테스트 코드
	public static void main(String[] args) {
		new ColorChange();

	}// end of main

	// 약속 되어진 메서드
	// 이벤트가 일어나면 운영체제가 actionPerformed를 불러준다
	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource() -->
		// 다운 캐스팅 버튼
		JButton targetButton = (JButton) e.getSource();
		// targetButton.setText("눌러진 버튼입니다");
		System.out.println(targetButton.getText());

//		System.out.println(e.getSource());
//		if(e.getSource() == this.button1) {
//			panel.setBackground(Color.black);
//		}else {
//			panel.setBackground(Color.yellow);
//		}

		// 문제1
		// 문자열을 비교해서 색상을 변경 시키는 코드를 작성해주세요
		if (targetButton.getText().equals("버튼 1")) {
			panel.setBackground(Color.black);
		} else {
			panel.setBackground(Color.yellow);
		}

	}

}// end of class
