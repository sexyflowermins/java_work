package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ch03.MyFrame1.MyDrawPanel;

public class MyFrame2 extends JFrame {

	// 내부클래스를 활용해서
	// JPanel 를 상속 받고 paint 메서드로 집 그림을 그려주세요
	MyDrawPanel drawPanel;

	class MyDrawPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(350, 350, 300, 300);
			g.drawRect(500, 400, 50, 50);
			g.drawRect(550, 450, 50, 50);
			g.drawRect(550, 400, 50, 50);
			g.drawRect(500, 450, 50, 50);
			g.drawLine(350, 350, 500, 200);
			g.drawLine(650, 350, 500, 200);
			g.drawString("★", 100, 50);
			g.drawString("★", 120, 70);
			g.drawString("★", 200, 80);
			g.drawString("★", 100, 100);
			g.drawString("★", 120, 120);
			g.drawString("★", 200, 130);
			g.drawString("★", 220, 90);
			g.drawString("★", 270, 80);
			g.drawString("★", 300, 70);
			g.drawString("★", 330, 144);
			g.drawString("★", 450, 92);
			g.drawString("★", 510, 132);
			g.drawString("★", 450, 62);
			g.drawString("★", 520, 71);
			g.drawString("★", 350, 92);
			g.drawString("★", 410, 132);
			g.drawString("★", 350, 62);
			g.drawString("☆", 420, 71);
			g.drawOval(800, 30, 150, 150);
			g.drawString("달", 870, 80);
			g.drawLine(750, 80, 550, 150);
			g.drawLine(750, 100, 580, 180);
			g.drawLine(750, 120, 610, 210);
			g.drawLine(780, 140, 650, 250);
			g.drawString("☆", 550, 150);
			g.drawString("☆", 580, 180);
			g.drawString("☆", 610, 210);
			g.drawString("☆", 650, 250);
		}
	}

	public MyFrame2() {
		initDate();
		setInitLayout();
	}

	private void initDate() {
		setTitle("외부클래스를 이용하여 집 모양 만들기");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
	}

	private void setInitLayout() {
		add(drawPanel);
		setVisible(true);
	}

}
//g.drawString("반가워", 300, 300);
//g.drawOval(300,300,50,50);