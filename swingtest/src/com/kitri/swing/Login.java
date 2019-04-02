package com.kitri.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Login extends JFrame {
	
	JPanel pC = new JPanel();
	JPanel pCin = new JPanel();
	JPanel pBtn = new JPanel();
	JPanel pIp = new JPanel();
	JPanel pName = new JPanel();
		
	JLabel ipl = new JLabel("  I    P : ");
	JLabel namel = new JLabel(" 대 화 명 : ");
	
	JTextField iptf = new JTextField();
	JTextField nametf = new JTextField();
	
	JButton ok = new JButton("확 인");
	JButton cancel = new JButton("취 소");
	
	
	public Login() {
		super("Login!!");
		pC.setLayout(new BorderLayout());
		pBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		pIp.setLayout(new BorderLayout(10, 10));
		pName.setLayout(new BorderLayout(10, 10));
		pCin.setLayout(new GridLayout(2,1,10,10));
		
		pIp.add(ipl, "West");
		pIp.add(iptf, "Center");
		
		pName.add(namel, "West");
		pName.add(nametf, "Center");
		
		pBtn.add(ok);
		pBtn.add(cancel);
		
		pC.add(pBtn, "South");
		pC.add(pCin, "Center");
		pCin.add(pIp);
		pCin.add(pName);
		
		add(pC);
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(300, 200, 400, 300);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Login();

	}

}
