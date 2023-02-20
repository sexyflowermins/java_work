package ex02;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {

	private int x;
	private int y;
	private ImageIcon playerR, playerL;

	// 플레이어의 현재 움직임 상태를 기록
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	// 플레이어의 속도
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	public Player() {
		initDate();
		setInitLayout();
	}

	// setter 메서드만들기; 오른 쪼 왼쪽
	public void setLeft(boolean left) {
		this.left = left;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	private void initDate() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		left = false;
		right = false;
		up = false;
		down = false;
	}

	private void setInitLayout() {

		x = 55;
		y = 535;
		// 좌표기반 ,라벨의 크기 지정해야한다.
		setSize(50, 50);
		setLocation(x, y);
		// JLabel 에 아이콘 세팅하는 메서드
		setIcon(playerR);
	}

	@Override
	public void left() {
		left = true;

		// 한번 키보드 왼쪽 방향키를 누르면
		// 쓰레드 생성이 된다.
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (left) {
					setIcon(playerL);
					x = x - SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			}
		}).start();
	}

	@Override
	public void right() {
		right = true;

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (right) {
					setIcon(playerR);
					x = x + SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			}
		}).start();
	}

	@Override
	public void up() {
		System.out.println("점프 ! ");
		up = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 130 / JUMPSPEED; i++) {
					y = y - JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for
				up = false;
				down();
			}
		}).start();
	}

	@Override
	public void down() {
		System.out.println("p down");
		down = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 130 / JUMPSPEED; i++) {
					y = y + JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				down = false;
				//상태값을 다룰 떄는 상황이 변하면 초기화 처리를 잘 해야함 (팁!!)
			}
		}).start();

	}

}
