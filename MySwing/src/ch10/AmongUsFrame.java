package ch10;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AmongUsFrame extends JFrame implements KeyListener {

	// 배경 이미지
	BufferedImage backgroundMap;
	// 캐릭터 어몽어스 이미지 1
	BufferedImage pinkImage1;
	// 캐릭터 어몽어스 적군 이미지1
	BufferedImage grayImage1;
	// jpanel 상속 --> inner class
	CustomPanel customPanel;

	int pintX = 200;
	int pintY = 200;
	int grayX = -20;
	int grayY = 400;

	public AmongUsFrame() {
		initDate();
		setInitLayout();
		addEventListener();
		new Thread(customPanel).start();
	}

	private void initDate() {
		setTitle("미니 어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 이미지 3새 있음 , CustomPanel 있음
		try {
			backgroundMap = ImageIO.read(new File("images/background_map.png"));
			pinkImage1 = ImageIO.read(new File("images/pink_image1.png"));
			grayImage1 = ImageIO.read(new File("images/gray_image1.png"));
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다");
			e.printStackTrace();
		}
		// paintComponent 메서드 호출
		customPanel = new CustomPanel();
	}

	private void setInitLayout() {
		// 레이아웃을 기본 레이아웃으로 설정함
		// add 호출시 paintComponent 메서드 실행됨
		add(customPanel);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(this); // 이벤트 리스너 등록처리
	}

	class CustomPanel extends JPanel implements Runnable {
		// boolean flagR = true;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundMap, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(pinkImage1, pintX, pintY, 100, 100, null);
			g.drawImage(grayImage1, grayX, grayY, 100, 100, null);
		}

		@Override
		public void run() {
			boolean isRight = true;
			while (true) {
				if (isRight) {
					grayX += 10;
				} else {
					grayX -= 10;
				}
				// 방향 체크
				if (grayX == 500) {
					isRight = false;
				} else if (grayX == -20) {
					isRight = true;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (pintX == grayX && pintY == grayY) {
					pinkImage1 = null;
				}
				repaint();
			}

		}

	}// end of inner class

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		System.out.println("keyCode" + keyCode);
		if (keyCode == KeyEvent.VK_LEFT) {
			pintX = (pintX < 0) ? -20 : pintX - 10;
			// pintX -= 10;
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			pintX = (pintX > 500) ? 520 : pintX + 10;
			// pintX += 10;
		} else if (keyCode == KeyEvent.VK_UP) {
			// 위
			pintY = (pintY < 0) ? -20 : pintY - 10;
			// pintY -= 10;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			pintY = (pintY > 500) ? 520 : pintY + 10;
			// 아래
			// pintY += 10;
		}
		// 그림을 다시 그려준다
		repaint();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}// end of outer class
