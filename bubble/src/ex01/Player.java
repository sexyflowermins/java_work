package ex01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {

	private int x;
	private int y;
	private ImageIcon playerR, playerL;

	public Player() {
		initDate();
		setInitLayout();
	}

	private void initDate() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
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
		setIcon(playerL);
		x = x - 10;
		setLocation(x,y);
	}

	@Override
	public void right() {
		setIcon(playerR);
		x = x + 10;
		setLocation(x,y);
	}

	@Override
	public void up() {
		System.out.println("점프 ! ");
	}

	@Override
	public void down() {
		System.out.println("p down");
	}

}
