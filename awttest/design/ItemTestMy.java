package com.kitri.awt.design;

import java.awt.*;

public class ItemTestMy extends Frame {

	//�����г�
	Panel pN = new Panel();
	//�Ʒ����г�
	Panel pS = new Panel();

	//üũ�ڽ�
	Checkbox app = new Checkbox("���");
	Checkbox banaan = new Checkbox("�ٳ���");
	Checkbox straw = new Checkbox("����");
	//������ư
	CheckboxGroup cg = new CheckboxGroup();
	Checkbox ch4 = new Checkbox("��ħ", cg, true);
	Checkbox ch5 = new Checkbox("����", cg, false);
	Checkbox ch6 = new Checkbox("����", cg, false);
	//�Է�â
	TextArea ta = new TextArea();
	//����â
	Choice ch = new Choice();
	//�����ư
	Button exit = new Button("����");

	public ItemTest() {
		super("Item Test !!!");//Ÿ��Ʋ
//		��
		pN.setLayout(new GridLayout(2, 3));//���ڹ�ġ
		
//		ch.setBackground(new Color(150, 210, 150));
//		ch.setForeground(Color.ORANGE);
		Font f = new Font("����", Font.BOLD, 20);//��Ʈ
		ch.setFont(f);
//		�߰� üũ�ڽ� �����ڽ� 
		pN.add(ch4);
		pN.add(ch5);
		pN.add(ch6);
		pN.add(ch1);
		pN.add(ch2);
		pN.add(ch3);
//		�Ʒ��г� ���� ��ġ			
		pS.setLayout(new GridLayout(1, 2, 10, 0));
		ch.add("��ħ");
		ch.add("����");
		ch.add("����");

		pS.add(ch);

		exit.setFont(f);
		pS.add(exit);

		setLayout(new BorderLayout(5, 10)); //�гι�ġ
		add(pN, "North");
		add(ta, "Center");
		add(pS, BorderLayout.SOUTH); 

//		setSize(300, 500);
//		setLocation(300, 200);
		setBounds(300, 200, 300, 500);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ItemTestMy();
	}
}
