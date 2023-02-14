package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame2 extends JFrame {

	ImagePanel imagePanel;// 내부클래스 맴버 변수로 선언

	public MyImageFrame2() {
		initData();
		setIntiLayout();
	}

	private void initData() {
		setTitle("이미지연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}

	private void setIntiLayout() {
		add(imagePanel);
		setVisible(true);
	}

	// 정적 내부클래스
	static class ImagePanel extends JPanel {
		private Image image1;
		private Image image2;
		private Image image3;
		private Image image4;

		public ImagePanel() {
			image1 = new ImageIcon("images3.png").getImage();
			image2 = new ImageIcon("images4.png").getImage();
			image3 = new ImageIcon("images5.png").getImage();
			image4 = new ImageIcon("images6.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image1, 220, 100, 70, 70, null);
			g.drawImage(image2, 130, 150, 70, 70, null);
			g.drawImage(image3, 150, 200, 200, 200, null);
			g.drawImage(image4, 250, 300, 200, 200, null);
		}
	}// end of inner class
}// end of outer class
