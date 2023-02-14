package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame {

	// 배열
	//8개생성
	private JButton[] button = new JButton[8];

	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("FlowLayoutEx3");
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton("button"+(i+1));
		}
	}

	private void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		for (int i = 0; i < button.length; i++) {
			add(button[i]);
		}
	}

	public static void main(String[] args) {
		new FlowLayoutEx3();
	}
}
