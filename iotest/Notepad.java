package com.kitri.io;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class Notepad extends JFrame implements ActionListener {
//�׼Ǹ����� ���ø�Ʈ
	
	
	private JPanel contentPane;
	private JMenuItem open;
	private JMenuItem save;
	private JMenuItem exit;
	private JMenuItem help;
	private JTextArea textArea;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notepad frame = new Notepad();
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
	public Notepad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu file = new JMenu("\uD30C\uC77C");
		menuBar.add(file);
		
		open = new JMenuItem("\uC5F4\uAE30");
		file.add(open);
		
		save = new JMenuItem("\uC800\uC7A5");
		file.add(save);
		
		exit = new JMenuItem("\uC885\uB8CC");
		file.add(exit);
		
		help = new JMenuItem("\uB3C4\uC6C0\uB9D0");
		menuBar.add(help);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(0, 0, 434, 228);
		contentPane.add(textArea);
//		
//		 FileDialog f = new FileDialog(this); //this < ������ ����;    
//	        f.setDirectory(".."); //.. �θ���͸�
//	        f.setVisible(true);
//	        String FileName = f.getFile(); //file�̸� ��������
//	          
//	        setTitle("�����׽�Ʈ");
//	        setSize(300, 300);
//	        setLocation(0, 100);
//	        //���� 
//	        setVisible(true);
		
		
//		fileDialog fileDialog;
//		fileDialog = new FileDialog()
		
		//���⼭ �Ҳ��ϱ� 
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
		help.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = e.getActionCommand();
		
		if (str.equals("����")) {
			System.out.println("����Ŭ��");
		} else if (str.equals("����")) {
			System.out.println("����Ŭ��");
		} else if (str.equals("����")) {
			System.out.println("����Ŭ��");
		} else {
			System.out.println("����Ŭ��");
		}
		
	
	} 
}
