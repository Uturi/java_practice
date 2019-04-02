package com.kitri.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.CardLayout;

public class MainFrame extends JFrame implements ActionListener{

	private JPanel panel;
	private JPanel contentPane;
	View1 v1 = new View1();
	View2 v2 = new View2();
	
	CardLayout card = new CardLayout();
	private JButton b1;
	private JButton b2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setLayout(card);
		panel.add("view1", v1);
		panel.add("view2", v2);
		card.show(panel, "view2");
		panel.setBounds(12, 51, 480, 394);
		contentPane.add(panel);
		
		b1 = new JButton("\uD654\uBA741");
		b1.setBounds(12, 10, 97, 33);
		contentPane.add(b1);
		
		b2 = new JButton("\uD654\uBA742");
		b2.setBounds(121, 10, 97, 33);
		contentPane.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == b1) {
			card.show(panel, "view1");
		} else if (ob == b2) {
			card.show(panel, "view2");
		}
		
	}

}
