package com.kitri.awt.design;

import java.awt.*;

//��Ʈ�� ����Ʈ O �ڵ����� ����Ʈ

/*1. Frame ���
/2. ����ο� �ʿ��� ��ü���� ����. �����ڿ��� �ص� �Ǵµ� ��¥��
/������̳������� ��ư�� ��������ߴ�ϱ� Ŭ������
/��������� �������� �ص� ���������.
/3. ��ġ�ο��� design(component ��ġ)
/  <*�۾��� �����ſ��� ū�ż�����*> 
/������� ���ʿ��ٰ� �гκ��̰��ƴ϶� 
/�гο��ٰ� �������̰� �׳��� �������� ���ʿ��ٿ��� 
*/
public class DesignTest2 extends Frame {
//�����
	// awt�ϴµ��ȿ��� ���⸦ ����ζ���Ұ��̴�.
	Panel pN = new Panel(); // api���� �����ں��� ���̾ƿ��Ŵ����������� �װŴ� ��ġ�ο����ϴ°�����
							// �Ϲ������� ����Ʈ�����.
	Panel pS = new Panel();
	Label l = new Label("�Է�"); // api���ϱ� ���⼭�Է� �ٷ��ϴ°����ٳ�
	TextField tf = new TextField();
	Button send = new Button("����");// ��������.
	// �������� ���ʿϼ�.
	TextArea ta = new TextArea();
	// ����ϼ�.
	Choice ch = new Choice(); // �����ڰ������� �Ʒ��� �ؾ߰ڳ�
	Button exit = new Button(":����");

	public DesignTest2() {
		super ("Design Test !!!");
//	3.��ġ��
//		1.setText("�Է�:)
//		LayoutManager lm = new BorderLayout();
		pN.setLayout(new BorderLayout());
		l.setBackground(new Color(100, 200, 150));
//		l.setForeground(new Color(255, 0, 255));
		l.setForeground(new Color(255, 0, 255));
		
		pN.add(l, "West");
		pN.add(tf, "Center");
		pN.add(send, "East"); //�����ϼ�
		
		pS.setLayout(new GridLayout(1,2, 10, 0)); //
		ch.add("����");
		ch.add("���,��õ");
		ch.add("����");
		ch.add("��û");
		
		pS.add(ch);
		pS.add(exit);

		add(pN, "North");
		add(ta, "Center");
		add(pS, BorderLayout.SOUTH); // �̰͵��� ���� �����ϳ� ���.
		
		// �޸𸮻󿡼� ����ڴٰ��Ѱ���

//		setVisible(true); // �������. ������ �߸��ž���. �������ϰ��� ��������ض�.
	
		//setSize(300, 400);// ũ�������ض�.
		//setLocation(300, 200); //������ġ�ض�
		setBounds(300, 200, 300, 500);
		setResizable(false);
		setVisible(true); // �������.
	
	//����� �߸��Ǿ��� ������ ������ ��ƾߴ��.
	
	}

	public static void main(String[] args) {
		new DesignTest2();

	}

}
//�ڹ� ���������� �����ϴ±۰�. �߿������ʴ�.
