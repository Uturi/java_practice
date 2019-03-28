package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

public class ItemTest extends Frame implements ItemListener, ActionListener{
	Panel pN = new Panel();
	Panel pS = new Panel();
	
	CheckboxGroup cbg = new CheckboxGroup();
	
	Checkbox mor = new Checkbox("아침", cbg, true); 
	Checkbox aft = new Checkbox("점심", cbg, false); 
	Checkbox eve = new Checkbox("저녁", cbg, false); 
	Checkbox app = new Checkbox("사과", true); 
	Checkbox banana = new Checkbox("바나나"); 
	Checkbox straw = new Checkbox("딸기"); 
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("종료");
	
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
		Font f = new Font("굴림", Font.BOLD, 20);
		Font f2 = new Font("굴림", Font.PLAIN, 15);
		app.setFont(f2);
		banana.setFont(f2);
		straw.setFont(f2);
		pN.add(app);
		pN.add(banana);
		pN.add(straw);
		
		
		pS.setLayout(new BorderLayout(10, 0));
		ch.add("아침");
		ch.add("점심");
		ch.add("저녁");
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
			if(str.equals("아침")) {
				mor.setState(true);
			}else if(str.equals("점심")) {
				aft.setState(true);
			}else {
				eve.setState(true);
			}
		}
		Checkbox sel = cbg.getSelectedCheckbox();
		String selStr = sel.getLabel();
//		System.out.println(selStr);
		ta.setText("--- "+selStr+ " ---"+"\n");
		ta.append("1. 사과 : "+eat(app.getState())+"\n");
		ta.append("2. 바나나 : "+eat(banana.getState())+"\n");
		ta.append("3. 딸기 : "+eat(straw.getState())+"\n");
		ch.select(selStr);
	
	}
	
	private String eat(boolean flag) {
		return flag ? "먹었다." : "안먹었다.";
	}
}
