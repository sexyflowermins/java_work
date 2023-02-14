package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx1 extends JFrame{
	//BorderLayout <-- 컴포먼트를 동서남북 센터로
	
	JButton buttons1 = new JButton("동");
	JButton buttons2 = new JButton("서");
	JButton buttons3 = new JButton("남");
	JButton buttons4 = new JButton("북");
	JButton buttons5 = new JButton("선터");
	
	public BorderLayoutEx1() {
		initData();
		setinitLayout();
	}
	private void initData() {
		setTitle("borderlayout 연습");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void setinitLayout() {
		//setLayout();
		//borderlaout 은 매게변수 값 하나를 더 추가할수 있다(방향지정가능)
		add(buttons1, BorderLayout.EAST);
		add(buttons2, BorderLayout.WEST);
		add(buttons3, BorderLayout.SOUTH);
		add(buttons4, BorderLayout.NORTH);
		add(buttons5, BorderLayout.CENTER);

		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutEx1();
	}//main
	
}
