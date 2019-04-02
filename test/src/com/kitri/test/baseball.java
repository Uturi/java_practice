package com.kitri.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;

public class baseball extends JFrame {

	private JPanel contentPane;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					baseball frame = new baseball();
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
	public baseball() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC785\uB825");
		label.setBounds(12, 388, 59, 40);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label);
		
		tf = new JTextField();
		tf.setBounds(72, 389, 370, 39);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(445, 10, 76, 418);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 1, 10, 10));
		
		JButton newG = new JButton("\uC0C8\uAC8C\uC784");
		newG.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 16));
		newG.setBackground(Color.YELLOW);
		newG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(newG);
		
		JButton clear = new JButton("\uC9C0\uC6B0\uAE30");
		panel.add(clear);
		
		JButton dap = new JButton("\uC815\uB2F5");
		panel.add(dap);
		
		JButton fontC = new JButton("\uAE00\uC790\uC0C9");
		panel.add(fontC);
		
		JButton exit = new JButton("\uC885\uB8CC");
		panel.add(exit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 430, 374);
		contentPane.add(scrollPane);
		
		JTextArea ta = new JTextArea();
		scrollPane.setViewportView(ta);
	}
}
