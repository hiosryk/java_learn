package com.kitri.test;

import javax.swing.JPanel;
import javax.swing.JEditorPane;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;

public class View1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public View1() {
		
		JEditorPane editorPane = new JEditorPane();
		add(editorPane);
		
		JProgressBar progressBar = new JProgressBar();
		add(progressBar);
		
		JScrollBar scrollBar = new JScrollBar();
		add(scrollBar);
		
		JTextArea textArea = new JTextArea();
		add(textArea);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		add(tglbtnNewToggleButton);

	}

}
