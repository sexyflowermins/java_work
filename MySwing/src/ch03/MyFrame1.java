package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author GGG 학습목표 내부클래스 외부클래스
 */
//외부클래스
public class MyFrame1 extends JFrame {

	MyDrawPanel drawPanel; // 맴버 변수 선언

	// 내부클래스 선언 - inner class
	// 내부 클래스에는 - 정적 클래스 , 인스턴스 클래스
	// 정적클래스란 :static <-- (new 하지 않더라고 접금 가능) 클래스 접근가능
	// 인스턴스클래스란 : 외부클래스가 new, 내부클래스 new 되어야한다
	class MyDrawPanel extends JPanel {

		// paints -->X
		// print -->X
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(100, 100, 100, 200);
			g.drawRect(100, 50, 50, 50);
			g.drawString("반가워", 300, 300);
			g.drawLine(250, 300, 500, 550);
			g.drawOval(300, 300, 50, 50);
		}
	}

	public MyFrame1() {
		initDate();
		setInitLayout();
	}

	private void initDate() {
		setTitle("외부클래스란");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
	}

	private void setInitLayout() {
		add(drawPanel);
		setVisible(true);
	}

}// end class

//클래스화 상속의 예
