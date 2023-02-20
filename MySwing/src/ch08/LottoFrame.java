package ch08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame implements ActionListener {

	int[] lotto = new int[6];
	JButton button;

	public LottoFrame() {
		initDate();
		setInitLayout();
		addEventListener();
	}

	private void initDate() {
		setTitle("로또 번호 뽑기");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("Lotto button");
	}

	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);
	}

	private void addEventListener() {
		button.addActionListener(this);
	}

	@Override
	public void paint(Graphics g) {
		int X = 50;
		super.paint(g);
		Font f = new Font("바른고딕", Font.BOLD, 25);
		g.setFont(f);
		if (lotto[0] == 0) {
			g.drawString("로또게임을 하기위해선 버튼을 클릭해주세요", 50, 200);
			return;
		}
		for (int i = 0; i < lotto.length; i++) {
			g.drawString(lotto[i] + "", X, 200);
			X += 100;
		}
	}

	public int[] getLottoNumber() {
		int[] lotto = new int[6];
		Random r = new Random();
		for (int i = 0; i < lotto.length; i++) {
			int j = r.nextInt(45) + 1;
			lotto[i] = j;
			for (int e = 0; e < i; e++) {
				if (lotto[i] == lotto[e]) {
					i = i - 1;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}// end of for

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("게임 시작");
		lotto = getLottoNumber();
		repaint();
	}

	//main
	public static void main(String[] args) {
		LottoFrame lottoFrame = new LottoFrame();
	}// main
}// class
