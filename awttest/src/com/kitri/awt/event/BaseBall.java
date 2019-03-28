package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

public class BaseBall extends Frame implements ActionListener, ItemListener {
	Panel pE = new Panel();
	Panel pS = new Panel();

	TextArea ta = new TextArea();
	
	Button newG = new Button("새게임");
	Button clear = new Button("지우기");
	Button dap = new Button("정답");
	Button fontC = new Button("글자색");
	Button exit = new Button("종료");
	
	Label l = new Label("숫자", Label.CENTER);
	TextField tf = new TextField();
	
	public BaseBall() {
		super("BaseBall !!!");
		pS.setLayout(new BorderLayout(5, 5));
		
		Font f = new Font("굴림", Font.BOLD, 15);
		l.setFont(f);
		exit.setFont(f);
		ta.setBackground(Color.yellow);
		newG.setBackground(Color.BLACK);
		newG.setForeground(Color.WHITE);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		dap.setBackground(Color.BLACK);
		dap.setForeground(Color.WHITE);
		fontC.setBackground(Color.BLACK);
		fontC.setForeground(Color.WHITE);
		exit.setForeground(Color.RED);
		exit.setBackground(Color.WHITE);
		pE.setLayout(new GridLayout(5, 1, 5, 5));
		pE.add(newG);
		pE.add(clear);
		pE.add(dap);
		pE.add(fontC);
		pE.add(exit);
		
		pS.setLayout(new BorderLayout(5, 5));
		pS.add(l, "West");
		pS.add(tf, "Center");		
			
		setLayout(new BorderLayout(5, 5));
		
		add(ta, "Center");
		add(pE, "East");
		add(pS, BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setBackground(Color.GREEN);
		setBounds(300, 200, 400, 230);
		setResizable(false);
		setVisible(true);
		
		exit.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new BaseBall();

	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		System.exit(0);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
