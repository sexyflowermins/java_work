package ch02;

import java.awt.Checkbox;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyComponents extends JFrame{
	private JButton button1;
	private JLabel lable;//글자를 넣어서 화면에 띄울수 있다
	private JTextField textField;//사용자한테 입력값을 받을수 있는 컴포먼트
	private JPasswordField jPasswordField;//사용자 비번을 받는 컴포먼트
	private JCheckBox jCheckBox;//
	
	public MyComponents() {
		initData();
		setIntiLayout();
	}
	private void initData() {
		setTitle("컴포먼트 확인");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("Jbutton");
		lable = new JLabel("글자를 적는 컴포먼트");
		textField = new JTextField("아이디 입력",20);
		jPasswordField = new JPasswordField("비번입력",10);
		jCheckBox = new JCheckBox("동의 하시겠습니까");
	}
	private void setIntiLayout() {
		add(button1);
		add(lable);
		add(textField);
		add(jPasswordField);
		add(jCheckBox);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyComponents();
	}
}
