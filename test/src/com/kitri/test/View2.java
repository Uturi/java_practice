package com.kitri.test;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JLabel;

public class View2 extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public View2() {
		setLayout(new BorderLayout(0, 0));
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("\uD1A0\uAE00\uBC84\uD2BC\uC740\uBB50\uB0D0");
		add(tglbtnNewToggleButton, BorderLayout.NORTH);
		
		JList list = new JList();
		add(list, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.setText("\uC785\uB825\uD558\uC138\uC694");
		add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JScrollBar scrollBar = new JScrollBar();
		add(scrollBar, BorderLayout.EAST);
		
		JLabel lblNewLabel = new JLabel("\uB07C\uC775\uB07C\uC775");
		add(lblNewLabel, BorderLayout.WEST);

	}

}
