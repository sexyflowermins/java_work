package ch09;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 화면담당
public class LottoFrame extends JFrame implements ActionListener {

	LottoNumber lottoNumber = new LottoNumber();
	JButton button;

	public LottoFrame() {
		initDate();
		setInitLayout();
		addEventListener();
	}

	private void initDate() {
		setTitle("로또게임");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("번호 돌리는 버튼");
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
		super.paint(g);
		Font f = new Font("바른고딕", Font.BOLD, 30);
		g.setFont(f);
		if (lottoNumber.getLottoNumber()[0] == 0) {
			g.drawString("로또게임을 하기위해선 버튼을 클릭해주세요", 0, 200);
			return;
		}
		int X = 30;
		for (int i = 0; i < lottoNumber.getLottoNumber().length; i++) {
			g.drawString(lottoNumber.getLottoNumber()[i] + "", X, 100);
			X += 100;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("로또 번호 뽑기 시작");
		lottoNumber.getLottoNumber();
		repaint();
	}
}
