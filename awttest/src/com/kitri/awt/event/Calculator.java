package com.kitri.awt.event;
import java.awt.*;

import java.awt.event.*;

 //������
public class Calculator extends Frame{
	Panel pN = new Panel();
	Panel pC = new Panel();

	Label numL = new Label("0",Label.RIGHT);
	Label operL = new Label("   ",Label.CENTER);	

	Button btn[] = new Button[16];
	public int len = btn.length;
	public final String num[] = {"7","8","9","+","4","5","6","-",
			"1","2","3","*","0","C","=","/"};

	Button exit	= new Button("��  ��");

	//��Ʈ�ѷ�
	CalculatorController calculatorController;
	
	public Calculator() {
		super("����  --by ������");
	//��ܺ� ���ڶ� ������ ǥ�� 
		Font f = new Font("����", Font.BOLD, 25);
		Font f2 = new Font("����", Font.PLAIN, 20);
		pN.setLayout(new BorderLayout(10, 10));
		numL.setBackground(Color.WHITE);
		operL.setBackground(Color.LIGHT_GRAY);
		numL.setFont(f2);
		operL.setFont(f2);
		pN.add(numL, "Center");
		pN.add(operL, "East");
	
//		��� ��ư
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

		//�����ӿ� �����г� ���̰� �ٴڿ� ���� ��ư
		setLayout(new BorderLayout(10, 10));
		exit.setBackground(Color.LIGHT_GRAY);
		exit.setFont(f2);
		add(exit, "South");
		add(pN, "North");
		add(pC, "Center");

		//������â x��ư���°�
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

		//��Ʈ�ѷ� �ҷ������� ������ �ٿ�������. �̺�Ʈ���
		exit.addActionListener(calculatorController);	
	}

	public static void main(String[] args) {
		new Calculator();
	}

}