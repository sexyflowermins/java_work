package ex011;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {

	private int x;
	private int y;
	private ImageIcon playerR;
	private ImageIcon playerL;

	public Player() {
		initDate();
		setInitLayout();
	}

	private void initDate() {
		playerR = new ImageIcon();
	}

	private void setInitLayout() {
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub

	}

	@Override
	public void right() {
		// TODO Auto-generated method stub

	}

	@Override
	public void up() {
		// TODO Auto-generated method stub

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub

	}

}
