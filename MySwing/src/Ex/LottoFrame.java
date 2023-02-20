package Ex;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 화면담당
public class LottoFrame extends JFrame {

	LottoNumber lottoNumber;;
	JButton button;
	boolean isStart = false;

	public LottoFrame() {
		initDate();
		setInitLayout();
		addEventListener();
	}

	private void initDate() {
		setTitle("로또게임 객체지향 프로그래밍식 코드 짜기");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("번호 돌리는 버튼");
		lottoNumber = new LottoNumber();
	}

	private void setInitLayout() {
		add(button, BorderLayout.SOUTH);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 그림 을 그릴떄 두가 구분 처음, 버튼
		if (isStart == false) {
			g.drawString("게임을 실행시켜주세요", 150, 150);
			return;
		}
		int[] getNumber = lottoNumber.craeteNumber();
		g.drawString(getNumber[0] + "", 50, 150);
		g.drawString(getNumber[1] + "", 150, 150);
		g.drawString(getNumber[2] + "", 250, 150);
		g.drawString(getNumber[3] + "", 350, 150);
		g.drawString(getNumber[4] + "", 450, 150);
		g.drawString(getNumber[5] + "", 550, 150);
	}

	private void addEventListener() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 그림을 다시그려라
				isStart = true;
				repaint();
			}
		});
	}

}
