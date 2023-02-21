package ex07;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//주의
//이녀석은 쓰레드가 아님!
//메서드 호출 시키기!!

public class BackgroundService {

	private BufferedImage image;
	private Bubble bubble;

	public BackgroundService(Bubble bubble) {
		this.bubble = bubble;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("파일 경로를 확인해 주세요");
		}
	}

	public boolean leftWall() {
		// RGB 값을 int 값으로 확인할수있다
		Color leftColor = new Color(image.getRGB(bubble.getX()+10, bubble.getY()));
		if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
			//빨간색
			return true;
		}
		return false;
	}

	public boolean rightWall() {
		// RGB 값을 int 값으로 확인할수있다
		Color rightColor = new Color(image.getRGB(bubble.getX()+60, bubble.getY()));
		if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
			//빨간색
			return true;
		}
		return false;
	}

	public boolean topWall() {
		// RGB 값을 int 값으로 확인할수있다
		Color topColor = new Color(image.getRGB(bubble.getX()+25, bubble.getY()));
		if (topColor.getRed() == 255 && topColor.getGreen() == 0 && topColor.getBlue() == 0) {
			//빨간색
			return true;
		}
		return false;
	}

}
