package ch06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex extends JFrame implements ActionListener {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JPanel panel1;
	private JPanel panel2;

	public Ex() {
		initDate();
		setIntiLayout();
		addEventListener();
	}

	private void initDate() {
		setTitle("무지게 패녈 연습");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		panel1.setBackground(Color.white);
		panel2 = new JPanel();
		// 버튼 초기화
		button1 = new JButton("버튼 1");
		button2 = new JButton("버튼 2");
		button3 = new JButton("버튼 3");
		button4 = new JButton("버튼 4");
		button5 = new JButton("버튼 5");
		button6 = new JButton("버튼 6");
		button7 = new JButton("버튼 7");

	}

	private void setIntiLayout() {
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(button7);
		panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));
		setVisible(true);
	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetButton = (JButton) e.getSource();
		if (targetButton.getText().equals("버튼 1")) {
			panel1.setBackground(Color.red);
		} else if (targetButton.getText().equals("버튼 2")) {
			panel1.setBackground(Color.orange);
		} else if (targetButton.getText().equals("버튼 3")) {
			panel1.setBackground(Color.yellow);
		} else if (targetButton.getText().equals("버튼 4")) {
			panel1.setBackground(Color.green);
		} else if (targetButton.getText().equals("버튼 5")) {
			panel1.setBackground(Color.blue);
		} else if (targetButton.getText().equals("버튼 6")) {
			panel1.setBackground(Color.GRAY);
		} else if (targetButton.getText().equals("버튼 7")) {
			panel1.setBackground(Color.PINK);
		}
	}

	public static void main(String[] args) {
		new Ex();
	}// main

}// class
