package com.kitri.awt.design;

import java.awt.*;
import java.awt.geom.Point2D;

public class Calculator extends Frame {
	Panel pN = new Panel();
	Panel pC = new Panel();
	
	Label numL = new Label("numbernumber");
	Label operL = new Label("Operator");	
	
	Button btn[] = new Button[16];
	
	Button exit	= new Button("Á¾  ·á");
	
	public Calculator() {
		super("Calculater");
		Font f = new Font("µ¸¿ò", Font.BOLD, 25);
		Font f2 = new Font("µ¸¿ò", Font.PLAIN, 20);
		pN.setLayout(new BorderLayout(10, 10));
		numL.setBackground(Color.WHITE);
		operL.setBackground(Color.LIGHT_GRAY);
		numL.setFont(f2);
		operL.setFont(f2);
		pN.add(numL, "Center");
		pN.add(operL, "East");
		
//		°¡¿îµ¥
		pC.setLayout(new GridLayout(4,4,5,5));
		String num[] = {"7","8","9","+","4","5","6","-",
				"1","2","3","*","0","C","=","/"};
		int len = btn.length;
//		GradientPaint gp = new GradientPaint(1, Color.RED, 10, Color.blue);
//		GradientPaint gg = new GradientPaint(getLocationOnScreen(), Color.red, getLocationOnScreen(), Color.GREEN, true);
//		Color cg = new Color(gg);
		int c = 50;
		for (int i = 0; i < len; i++) {
			btn[i] = new Button();
			btn[i].setLabel(num[i]);
			btn[i].setFont(f);
			
			btn[i].setBackground(new Color(50+c, c, 5+c));
			pC.add(btn[i]);
			c +=10;
		}
		
		setLayout(new BorderLayout(10, 10));
		
		exit.setBackground(Color.LIGHT_GRAY);
		exit.setFont(f2);
		add(exit, "South");
		
		add(pN, "North");
		add(pC, "Center");
		
		setBackground(Color.DARK_GRAY);
		setBounds(300, 200, 300, 400);
		setResizable(false);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

}
