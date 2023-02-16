package ch07;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoveImageFrame extends JFrame {

	ImagePanel imagePanel;
	int lmageX;
	int lmageY;

	class ImagePanel extends JPanel {

		private Image image1;

		public ImagePanel() {
			image1 = new ImageIcon("images10.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image1, 0, 0, 80, 80, null);
		}
	}

	public MoveImageFrame() {
		initDate();
		setInitLayout();
		addEventListener();
	}

	private void initDate() {
		setTitle("키보드 방향키로 이미지 움직임 구현");
		setSize(1_000, 1_000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
		lmageX = 100;
		lmageY = 100;
	}

	private void setInitLayout() {
		add(imagePanel);
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
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					int X = lmageX += 30;
					int Y = lmageY;
					imagePanel.setLocation(X, Y);
					if (X >= 900) {
						lmageX -= 30;
					}
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					int X = lmageX -= 30;
					int Y = lmageY;
					imagePanel.setLocation(X, Y);
					if (X <= 20) {
						lmageX += 30;
					}
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					int X = lmageX;
					int Y = lmageY -= 30;
					imagePanel.setLocation(X, Y);
					if (Y <= 20) {
						lmageY += 30;
					}
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					int X = lmageX;
					int Y = lmageY += 30;
					imagePanel.setLocation(X, Y);
					if (Y >= 860) {
						lmageY -= 30;
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
