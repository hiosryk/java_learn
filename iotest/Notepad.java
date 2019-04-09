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
//액션리스너 임플먼트
	
	
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
//		 FileDialog f = new FileDialog(this); //this < 프레임 지정;    
//	        f.setDirectory(".."); //.. 부모디렉터리
//	        f.setVisible(true);
//	        String FileName = f.getFile(); //file이름 가져오기
//	          
//	        setTitle("파일테스트");
//	        setSize(300, 300);
//	        setLocation(0, 100);
//	        //파일 
//	        setVisible(true);
		
		
//		fileDialog fileDialog;
//		fileDialog = new FileDialog()
		
		//여기서 할꺼니까 
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
		help.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = e.getActionCommand();
		
		if (str.equals("열기")) {
			System.out.println("열기클릭");
		} else if (str.equals("저장")) {
			System.out.println("저장클릭");
		} else if (str.equals("종료")) {
			System.out.println("종료클릭");
		} else {
			System.out.println("도움말클릭");
		}
		
	
	} 
}
