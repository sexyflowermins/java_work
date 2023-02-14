package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame{

	JButton[] buttons = new JButton[10];
	
	
	public NoLayoutEx2(){
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("혼자해보는 레이아웃없는 좌표형식");
		setSize(1_000, 1_000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		buttons[0] = new JButton("버튼1");
		buttons[0].setSize(100, 100);
		buttons[1] = new JButton("버튼2");
		buttons[1].setSize(100, 100);
		buttons[2] = new JButton("버튼3");
		buttons[2].setSize(100, 100);
		buttons[3] = new JButton("버튼4");
		buttons[3].setSize(100, 100);
		buttons[4] = new JButton("버튼5");
		buttons[4].setSize(100, 100);
		buttons[5] = new JButton("버튼6");
		buttons[5].setSize(100, 100);
		buttons[6] = new JButton("버튼7");
		buttons[6].setSize(100, 100);
		buttons[7] = new JButton("버튼8");
		buttons[7].setSize(100, 100);
		buttons[8] = new JButton("버튼9");
		buttons[8].setSize(100, 100);
		buttons[9] = new JButton("버튼9");
		buttons[9].setSize(100, 100);
	}
	private void setInitLayout() {
		setLayout(null);
		buttons[0].setLocation(0, 0);
		add(buttons[0]);
		buttons[1].setLocation(100, 100);
		add(buttons[1]);
		buttons[2].setLocation(200, 0);
		add(buttons[2]);
		buttons[3].setLocation(300, 100);
		add(buttons[3]);
		buttons[4].setLocation(400, 0);
		add(buttons[4]);
		buttons[5].setLocation(500, 100);
		add(buttons[5]);
		buttons[6].setLocation(600, 0);
		add(buttons[6]);
		buttons[7].setLocation(700, 100);
		add(buttons[7]);
		buttons[8].setLocation(800, 0);
		add(buttons[8]);
		buttons[9].setLocation(900, 100);
		add(buttons[9]);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NoLayoutEx2();
	}
}
