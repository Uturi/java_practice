package com.kitri.awt.design;

import java.awt.*;

//1. Frame 상속
//2. 선언부에 필요한 객체 생성.
//3. 배치부(생성자)에서 design(component 배치)
//** 작업은 소 >> 대 

public class DesignTest extends Frame {
	
//	선언부
	Panel pN = new Panel();
	Panel pS = new Panel();
	
	Label l = new Label("입력", Label.CENTER);
	TextField tf = new TextField();
	Button send = new Button("전송");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("종료");
		
	public DesignTest() {
//		배치부
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
		ch.add("서울");
		ch.add("경기");
		ch.add("인천");
		ch.add("강원");
		ch.add("충청");
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
//		익명으로 객체 생성. 메인메소드에서 굳이 생성자를 주소값에 넣어서 사용할 일이 없기때문.
		new DesignTest();
	}
}
