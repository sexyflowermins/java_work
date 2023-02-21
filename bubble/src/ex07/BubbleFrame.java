package ex07;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initDate();
		setInitLayout();
		addEventListener();

		// player 메모리에 올라간 상태이다
		// 약속 run 메서드 안에 동작 처리를 한다.
		new Thread(new BackgroundPlayerService(player)).start();
	}

	private void initDate() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(1000, 640);

		player = new Player();
	}

	private void setInitLayout() {
		setLayout(null);// 좌표기반
		setResizable(false);
		setLocationRelativeTo(null);// JFrame 가운대 배치
		setVisible(true);

		add(player);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 38,40,39,37
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 여러번 누르더라도 한번만 호출되게 방어적 코드 작성
					// false
					// true<-- 변경!!
					// 한번더<-- 현재상태값 true
					if (player.isLeft() == false && player.isLeftWallCrash() == false) {
						player.left();
					}
					break;
				case KeyEvent.VK_RIGHT:// 콜론
					if (player.isRight() == false && player.isRightWallCrash() == false) {
						player.right();
					}
					// 로직
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;
				case KeyEvent.VK_DOWN:
					player.down();
					break;
				}
			}// end of

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 왼쪽 버튼을떄면 멈춰야해
					player.setLeft(false);
					break;

				case KeyEvent.VK_RIGHT:
					// 오른쪽 버튼을 때면 멈춰야해
					player.setRight(false);
					break;
				case KeyEvent.VK_SPACE:
					//1단계  
					Bubble bubble = new Bubble(player); 
					add(bubble);
					break;
				}
			}
		});
	}

	
	//********** 자바 프로그램중 main 함수를 가지는 클래스는
	//프로그램에서 사용하는 모든 참조 값을 알수 있다.(별 10만개짜리)
	public static void main(String[] args) {
		new BubbleFrame();
	}// end main
}// end class
