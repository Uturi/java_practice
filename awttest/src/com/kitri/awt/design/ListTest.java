package com.kitri.awt.design;

import java.awt.*;

public class ListTest extends Frame {
	Panel pC = new Panel();
	Panel pCin = new Panel();
	Panel pS = new Panel();
	
	List listL = new List(4, false);
	List listR = new List(4, false);
	Button btR = new Button("¢¹");
	Button btRAll = new Button("¢º");
	Button btL = new Button("¢·");
	Button btLAll = new Button("¢¸");
	 
	TextField tfL = new TextField();
	TextField tfR = new TextField();
	
	public ListTest() {
		super("List Test !!!");
		pC.setLayout(new GridLayout(1, 3, 10, 10));
		pCin.setLayout(new GridLayout(6, 1, 5, 5));
		Font f = new Font("±Ã¼­", Font.ITALIC, 18);
		listL.setFont(f);
		listR.setFont(f);
		listL.add("Mercury");
		listL.add("Venus");
		listL.add("Earth");
		listL.add("JavaSoft");
		listL.add("Mars");
		listR.add("Jupiter");
		listR.add("Saturn");
		listR.add("Uranus");
		listR.add("Neptune");
		listR.add("Pluto");
		listL.setBackground(Color.YELLOW);
		listR.setBackground(Color.ORANGE);
		listL.setForeground(Color.BLUE);
		listR.setForeground(Color.RED);
		pC.add(listL);
		btR.setBackground(Color.LIGHT_GRAY);
		btRAll.setBackground(Color.LIGHT_GRAY);
		btL.setBackground(Color.LIGHT_GRAY);
		btLAll.setBackground(Color.LIGHT_GRAY);
		pCin.add(new Label());
		pCin.add(btR);
		pCin.add(btRAll);
		pCin.add(btL);
		pCin.add(btLAll);
		pC.add(pCin);
		pC.add(listR);
		
		pS.setLayout(new GridLayout(1, 2, 100, 0));
		pS.add(tfL);
		pS.add(tfR);
		
		setBackground(Color.DARK_GRAY);
		setLayout(new BorderLayout(0, 10));
		add(pC, "Center");
		add(pS, BorderLayout.SOUTH);
		
		setBounds(300, 200, 300, 500);
		setResizable(false);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ListTest();

	}

}
