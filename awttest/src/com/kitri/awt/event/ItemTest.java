package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

public class ItemTest extends Frame implements ItemListener, ActionListener{
	Panel pN = new Panel();
	Panel pS = new Panel();
	
	CheckboxGroup cbg = new CheckboxGroup();
	
	Checkbox mor = new Checkbox("��ħ", cbg, true); 
	Checkbox aft = new Checkbox("����", cbg, false); 
	Checkbox eve = new Checkbox("����", cbg, false); 
	Checkbox app = new Checkbox("���", true); 
	Checkbox banana = new Checkbox("�ٳ���"); 
	Checkbox straw = new Checkbox("����"); 
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("����");
	
	public ItemTest() {
		super("Item Test !!!");
		pN.setLayout(new GridLayout(2, 3, 10, 5));
		
		pN.add(mor);
		pN.add(aft);
		pN.add(eve);
		app.setBackground(Color.GREEN);
		banana.setBackground(Color.YELLOW);
		straw.setBackground(Color.RED);
//		app.setState(true);
		Font f = new Font("����", Font.BOLD, 20);
		Font f2 = new Font("����", Font.PLAIN, 15);
		app.setFont(f2);
		banana.setFont(f2);
		straw.setFont(f2);
		pN.add(app);
		pN.add(banana);
		pN.add(straw);
		
		
		pS.setLayout(new BorderLayout(10, 0));
		ch.add("��ħ");
		ch.add("����");
		ch.add("����");
		exit.setFont(f);
		pS.add(ch);
		pS.add(exit, "East");
		
		setBackground(Color.orange);
		setLayout(new BorderLayout(0, 10));
		add(pN, "North");
		add(ta, "Center");
		add(pS, BorderLayout.SOUTH);
		
		setBounds(300, 200, 300, 500);
		setResizable(false);
		setVisible(true);
		
		exit.addActionListener(this);
		mor.addItemListener(this);
		aft.addItemListener(this);
		eve.addItemListener(this);
		app.addItemListener(this);
		banana.addItemListener(this);
		straw.addItemListener(this);
		ch.addItemListener(this);
		
	}
	
	public static void main(String[] args) {
		new ItemTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object ob = e.getSource();
		if(ob==ch) {
			String str = ch.getSelectedItem();
			if(str.equals("��ħ")) {
				mor.setState(true);
			}else if(str.equals("����")) {
				aft.setState(true);
			}else {
				eve.setState(true);
			}
		}
		Checkbox sel = cbg.getSelectedCheckbox();
		String selStr = sel.getLabel();
//		System.out.println(selStr);
		ta.setText("--- "+selStr+ " ---"+"\n");
		ta.append("1. ��� : "+eat(app.getState())+"\n");
		ta.append("2. �ٳ��� : "+eat(banana.getState())+"\n");
		ta.append("3. ���� : "+eat(straw.getState())+"\n");
		ch.select(selStr);
	
	}
	
	private String eat(boolean flag) {
		return flag ? "�Ծ���." : "�ȸԾ���.";
	}
}
