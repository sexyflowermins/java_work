package ex02;

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
	}

	private void initDate() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(1000,640);
		
		player = new Player();
	}

	private void setInitLayout() {
		setLayout(null);//좌표기반
		setResizable(false);
		setLocationRelativeTo(null);// JFrame 가운대 배치
		setVisible(true);
		
		add(player);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//38,40,39,37
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.left();
					break;
				case KeyEvent.VK_RIGHT://콜론
					player.right();					
					// 로직
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;
				case KeyEvent.VK_DOWN:
					player.down();
					break;
				}
			}//end of 
			
			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					//왼쪽 버튼을떄면 멈춰야해
					player.setLeft(false);
					break;
					
				case KeyEvent.VK_RIGHT:
					//오른쪽 버튼을 때면 멈춰야해
					player.setRight(false);
					break;

				default:
					break;
				}
			}
		});
		
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}//end main
}//end class
