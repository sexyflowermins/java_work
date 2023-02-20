package ex011;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		add(player);
	}

	private void addEventListener() {
		
	}
}
