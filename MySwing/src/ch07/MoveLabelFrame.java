package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabelFrame extends JFrame {

	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;

	public MoveLabelFrame() {
		initDate();
		setInitLayout();
		addEventListener();
	}

	private void initDate() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		// 초기값 세팅
		labelTextX = 300;
		labelTextY = 350;
		labelText = new JLabel("hello world");
		labelText.setSize(100, 100);
	}

	private void setInitLayout() {
		setLayout(null);
		labelText.setLocation(labelTextX, labelTextY);
		add(labelText);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// 현재 이벤트가 일어난 시점에서 x,y 좌표값을 확인
//				int currentX = labelText.getX();
//				int currentY = labelText.getX();

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					int X = labelTextX += 50;
					int Y = labelTextY;
					labelText.setLocation(X, Y);
					if (X == 700) {
						labelTextX -= 50;
					}
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					int X = labelTextX -= 50;
					int Y = labelTextY;
					labelText.setLocation(X, Y);
					if (X == 50) {
						labelTextX += 50;
					}
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					int X = labelTextX;
					int Y = labelTextY -= 50;
					labelText.setLocation(X, Y);
					if (Y == 50) {
						labelTextY += 50;
					}
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					int X = labelTextX;
					int Y = labelTextY += 50;
					labelText.setLocation(X, Y);
					if (Y == 700) {
						labelTextY -= 50;
					}
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}
}
