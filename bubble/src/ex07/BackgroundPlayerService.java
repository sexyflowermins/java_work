package ex07;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//메인 화면에 그림으 그려주고있고 (키보드 이벤트 리스너 받고 있음 - 바쁨)
//백그라운드에서 계속 Player 계속 관찰중
public class BackgroundPlayerService implements Runnable {
	private BufferedImage image;
	private Player player;

	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드 서비스 객체에 사용하는 이미지 경로및 파일명 확인");
		}
	}

	@Override
	public void run() {
		while (true) {
			// 색상 확인
			// 왼쪽으로 갈때는 좌표 지점을 보정 해야하고
			// 오른쪽으로 할때는 역시나 기준 좌표지점을 보정 해야한다
			// 기준 왼쪽
			Color leftColor = new Color(image.getRGB(player.getX() + 5, player.getY()+25));
			// 기준 오른쪽
			Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY()+25));
			// 바닥 충돌 감지기능
			// Color bottomColorLeft = new Color(image.getRGB(player.getX() + 5,
			// player.getY()+60));
			int bottomColorLeft = image.getRGB(player.getX() + 10, player.getY() + 55);
			int bottomColorRight = image.getRGB(player.getX() + 45, player.getY() + 55);
			// 하얀색이 아니면 바닥이다
			if (bottomColorLeft + bottomColorRight != -2) {
				player.setDown(false);
			} else {
				// 쪼금 점프 하는 순간 bottomColorLeft -> 0이된다
				// 위화살표를 누르면 65번 반복돌면서 y값을 마이너스 해서
				// 이미지를 위로 올리고 있고 65번 반복 될떄까지 현재 y 좌표에서 +130 좌표올리고--> down 메서드 호출
				if (player.isUp() == false && player.isDown() == false) {
					// 다운 메서드가 한번 호출 되어야한다
					player.down();
				}
			}

			if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				player.setRight(false);
				player.setRightWallCrash(true);

			} else if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				player.setLeft(false);
				player.setLeftWallCrash(true);
			} else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
			}

			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
