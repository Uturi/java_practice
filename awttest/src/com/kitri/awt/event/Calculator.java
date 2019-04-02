package com.kitri.awt.event;
import java.awt.*;

import java.awt.event.*;

 //디자인
public class Calculator extends Frame{
	Panel pN = new Panel();
	Panel pC = new Panel();

	Label numL = new Label("0",Label.RIGHT);
	Label operL = new Label("   ",Label.CENTER);	

	Button btn[] = new Button[16];
	public int len = btn.length;
	public final String num[] = {"7","8","9","+","4","5","6","-",
			"1","2","3","*","0","C","=","/"};

	Button exit	= new Button("종  료");

	//컨트롤러
	CalculatorController calculatorController;
	
	public Calculator() {
		super("계산기  --by 이종영");
	//상단부 숫자랑 연산자 표시 
		Font f = new Font("돋움", Font.BOLD, 25);
		Font f2 = new Font("굴림", Font.PLAIN, 20);
		pN.setLayout(new BorderLayout(10, 10));
		numL.setBackground(Color.WHITE);
		operL.setBackground(Color.LIGHT_GRAY);
		numL.setFont(f2);
		operL.setFont(f2);
		pN.add(numL, "Center");
		pN.add(operL, "East");
	
//		가운데 버튼
		pC.setLayout(new GridLayout(4,4,5,5));
		int c = 50;
		for (int i = 0; i < len; i++) {
			btn[i] = new Button();
			btn[i].setLabel(num[i]);
			btn[i].setFont(f);
			btn[i].setBackground(new Color(50+c, c, 5+c));
			pC.add(btn[i]);
			
			c +=10;
		}

		//프레임에 만든패널 붙이고 바닥에 종료 버튼
		setLayout(new BorderLayout(10, 10));
		exit.setBackground(Color.LIGHT_GRAY);
		exit.setFont(f2);
		add(exit, "South");
		add(pN, "North");
		add(pC, "Center");

		//윈도우창 x버튼끄는거
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setBackground(Color.DARK_GRAY);
		setBounds(300, 200, 300, 400);
		setResizable(false);
		setVisible(true);	

		calculatorController = new CalculatorController(this);
		for (int i = 0; i < len; i++) {
			btn[i].addActionListener(calculatorController);
		}

		//컨트롤러 불러버려서 리스너 붙여버리기. 이벤트등록
		exit.addActionListener(calculatorController);	
	}

	public static void main(String[] args) {
		new Calculator();
	}

}