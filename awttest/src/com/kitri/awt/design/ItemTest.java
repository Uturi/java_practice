package com.kitri.awt.design;

import java.awt.*;

public class ItemTest extends Frame {
	Panel pN = new Panel();
	Panel pS = new Panel();
	
	CheckboxGroup cbg = new CheckboxGroup();
	
	Checkbox mor = new Checkbox("¾ÆÄ§", cbg, true); 
	Checkbox aft = new Checkbox("Á¡½É", cbg, false); 
	Checkbox eve = new Checkbox("Àú³á", cbg, false); 
	Checkbox app = new Checkbox("»ç°ú", true); 
	Checkbox banana = new Checkbox("¹Ù³ª³ª"); 
	Checkbox straw = new Checkbox("µþ±â"); 
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("Á¾·á");
	
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
		Font f = new Font("±¼¸²", Font.BOLD, 20);
		Font f2 = new Font("±¼¸²", Font.PLAIN, 15);
		app.setFont(f2);
		banana.setFont(f2);
		straw.setFont(f2);
		pN.add(app);
		pN.add(banana);
		pN.add(straw);
		
		
		pS.setLayout(new BorderLayout(10, 0));
		ch.add("¾ÆÄ§");
		ch.add("Á¡½É");
		ch.add("Àú³á");
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
		
	}
	
	public static void main(String[] args) {
		new ItemTest();
	}
}
