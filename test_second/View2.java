package com.kitri.test;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class View2 extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public View2() {
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		add(textArea);
		
		JButton btnNewButton_1 = new JButton("New button");
		add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		add(comboBox);

	}

}
