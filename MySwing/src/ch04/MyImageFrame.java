package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

// JLable <-- String,Image()
public class MyImageFrame extends JFrame {

	imagePanel imagePanel;

	// JPanel안에 이미지를 넣는 방법!!
	// 내부클래스 이용해보기
	class imagePanel extends JPanel {

		private Image image;

		public imagePanel() {
			image = new ImageIcon("images.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			// 대상 x,y,가로,세로,널
			g.drawImage(image, 0, 0, 400, 400, null);
		}

	}// end of inner class

	public MyImageFrame() {
		initDate();
		setInitLayout();
	}

	private void initDate() {
		setTitle("이미지연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new imagePanel();
	}

	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);
	}
}
