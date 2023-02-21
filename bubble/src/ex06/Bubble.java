package ex06;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel implements Moveable {

	// 버블의 위치 상태
	private int x;
	private int y;

	// 버블에 움직임 방향 상태
	private boolean left;
	private boolean right;
	private boolean up;

	// 적군을 맞춘 상태 : 0 기본 물방울, 1 적을 가둔 물방울
	private int state;

	private ImageIcon bubble; // 기본 상태
	private ImageIcon bubbled;// 적을 맞춘 상태
	private ImageIcon bomb;// 물방울이 터진상태

	private Player player;

	public Bubble(Player player) {
		this.player = player;
		initDate();
		setInitLayout();
		initThread();
	}

	private void initDate() {
		bubble = new ImageIcon("images/bubble.png");
		bubbled = new ImageIcon("images/bubbled.png");
		bomb = new ImageIcon("images/bomb.png");
		left = false;
		right = false;
		up = false;
		state = 0;
	}

	private void setInitLayout() {
		// 플레이어가 있는 위치에 태어나야 한다
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
	}

	private void initThread() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				if (player.getpWay() == PlayerWay.LEFT) {
					// 왼쪽 방향을 보고있다
					left();
				} else {
					// 오른쪽방향을 쓰고있다
					right();
				}

			}
		}).start();
	}

	@Override
	public void left() {
		left = true;
		for (int i = 0; i < 400; i++) {
			x--;
			setLocation(x, y);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		up();
	}

	@Override
	public void right() {
		right = true;
		for (int i = 0; i < 400; i++) {
			x++;
			setLocation(x+25, y);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		up();
	}

	@Override
	public void up() {
		up = true;
		while(true) {
			y--;
			setLocation(x, y);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
