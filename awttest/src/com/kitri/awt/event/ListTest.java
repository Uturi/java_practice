package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

public class ListTest extends Frame implements ItemListener, ActionListener {
	Panel pC = new Panel();
	Panel pCin = new Panel();
	Panel pS = new Panel();
	
	List listL = new List(4, false);
	List listR = new List(4, true);
	Button btR = new Button("▷");
	Button btRAll = new Button("▶");
	Button btL = new Button("◁");
	Button btLAll = new Button("◀");
	 
	TextField tfL = new TextField();
	TextField tfR = new TextField();
	
	public ListTest() {
		super("List Test !!!");
		pC.setLayout(new GridLayout(1, 3, 10, 10));
		pCin.setLayout(new GridLayout(6, 1, 5, 5));
		Font f = new Font("궁서", Font.ITALIC, 18);
		listL.setFont(f);
		listR.setFont(f);
		
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
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(300, 200, 300, 500);
		setResizable(false);
		setVisible(true);
		
		tfL.addActionListener(this);
		tfR.addActionListener(this);
		btL.addActionListener(this);
		btLAll.addActionListener(this);
		btR.addActionListener(this);
		btRAll.addActionListener(this);
	}
	public static void main(String[] args) {
		new ListTest();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob==tfL) {
//			1. tfL 의 값 get(유효성 검사)
			String tmp = tfL.getText().trim();
//			2. tfL 초기화
			tfL.setText("");
			if(tmp.isEmpty()) {
				return;
			}
//			3. listL에 추가
			listL.add(tmp);
			
		} else if(ob==tfR) {
			String tmp = tfR.getText().trim();
			tfR.setText("");
			if(tmp.isEmpty()) {
				return;
			}
			listR.add(tmp);
			
		} else if(ob==btL) {
			String tmp[] = listR.getSelectedItems();
//			if(tmp==null)
//				return;
			int len = tmp.length;
			for (int i = 0; i < len; i++) {
				listL.add(tmp[i]);				
			}
			for (int i = len-1; i >= 0; i--) {
				listR.remove(tmp[i]);
			}	
			
		} else if(ob==btLAll) {
			String tmp[] = listR.getItems();
			int len = tmp.length;
			for (int i = 0; i < len; i++) {
				listL.add(tmp[i]);
			}
			listR.removeAll();
			
		} else if(ob==btR) {
//			1.listL에서 선택한 문자열 get
			String tmp = listL.getSelectedItem();
			if(tmp==null)
				return;
//			2.1의 값을 listR에 추가.
			listR.add(tmp);
//			3.1의 값을 listL에서 제거.
			listL.remove(tmp);
			
		} else if(ob==btRAll) {
//			1.listL의 값을 모두 get
			String tmp[] = listL.getItems();
//			2.1값을 listR에 모두 추가
			int len = tmp.length;
			for (int i = 0; i < len; i++) {
				listR.add(tmp[i]);	
			}
//			3.1값을 listL에서 모두 제거
			listL.removeAll();
//			for (int i = len-1; i >= 0; i--) {
//				listL.remove(i);
//			}
			
		}
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
	}

}
