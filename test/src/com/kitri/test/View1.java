package com.kitri.test;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

public class View1 extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public View1() {
		setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("\uBD81\uCABD");
		add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("\uC11C\uCABD");
		add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uB3D9\uCABD");
		add(btnNewButton_2, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("\uB0A8\uCABD");
		add(btnNewButton_3, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_5 = new JButton("\uADF8\uB9AC\uB4DC");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("\uADF8\uB9AC\uB4DC");
		panel.add(btnNewButton_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		panel.add(comboBox);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uC13C\uD130\uB97C \uADF8\uB9AC\uB4DC\uB85C");
		panel.add(rdbtnNewRadioButton);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		panel.add(scrollBar);
		
		JButton btnNewButton_4 = new JButton("\uADF8\uB9AC\uADF8\uB9AC\uB4DC");
		panel.add(btnNewButton_4);

	}

}
