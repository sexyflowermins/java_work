package ch05;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class YearNumber extends JFrame implements ActionListener{
	
	Scanner sc = new Scanner(System.in);
	JButton button;
	private JTextArea area;
	
	public YearNumber() {
		initDate();
		setInitLayout();
		addEventListener();
	}

	private void initDate() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("버튼");
		//area = new JTextArea(sc.nextInt());
	}

	private void setInitLayout() {
		add(area);
		add(button, BorderLayout.SOUTH);
		setVisible(true);
	}

	private void addEventListener() {
		button.addActionListener(this);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font f = new Font("바른고딕", Font.BOLD, 30);
		g.setFont(f);
		g.drawString("윤년 을 알아보는 년도를 입력해주세요", 100, 200);
		//g.draw
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("윤년 을 알아보는 년도를 입력해주세요");
		
		repaint();
	}
}
