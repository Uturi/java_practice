package com.kitri.awt.event;

import java.awt.*;

//1. Frame ���
//2. ����ο� �ʿ��� ��ü ����.
//3. ��ġ��(������)���� design(component ��ġ)
//** �۾��� �� >> �� 

public class DesignTest extends Frame {
	
//	�����
	Panel pN = new Panel();
	Panel pS = new Panel();
	
	Label l = new Label("�Է�", Label.CENTER);
	TextField tf = new TextField();
	Button send = new Button("����");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("����");
		
	public DesignTest() {
//		��ġ��
		super("Design Test !!!");
		pN.setLayout(new BorderLayout(10, 0));
//		l.setBackground(new Color(20, 60, 123));
		l.setBackground(Color.orange);
//		l.setForeground(new Color(255, 255, 0));
		l.setForeground(Color.BLUE);
		Font f = new Font("Consolas", Font.BOLD, 20);
		l.setFont(f);
		send.setFont(f);
		pN.add(l, "West");
		pN.add(tf, "Center");
		pN.add(send, "East");
		
		pS.setLayout(new GridLayout(1, 2, 10, 0));
		ch.add("����");
		ch.add("���");
		ch.add("��õ");
		ch.add("����");
		ch.add("��û");
//		ch.setFont(f);
		exit.setFont(f);
		pS.add(ch);
		pS.add(exit);
		
		setLayout(new BorderLayout(0, 10));
		add(pN, "North");
		add(ta, "Center");
		add(pS, BorderLayout.SOUTH);	
		
//		setSize(300, 500);
//		setLocation(300, 200);
		setBounds(300, 200, 300, 500);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
//		�͸����� ��ü ����. ���θ޼ҵ忡�� ���� �����ڸ� �ּҰ��� �־ ����� ���� ���⶧��.
		new DesignTest();
	}
}
