//2�����. �г�
//��ư �ݺ� �迭.
//��ư �迭��ó���ϼ���.
// �۲õ� �ٲٰ� ���غ�����.
// ������ ĥ�ϴµ� �׶��̼�.
// ���� ���� �ٲ�� �밢������.
package com.kitri.awt.event;

import java.awt.*;

public class Calculator extends Frame {
//	�����
//	�гθ����. �� ���
    Panel pN = new Panel();
    Panel pC = new Panel();
// ���� ��    
    Label numL = new Label("number");
    Label operL = new Label("Oper");    
// 	���� ��ư    
    Button btn[] = new Button[16];
//    �����ư
    Button exit    = new Button("�� ��");
//    ��ġ��
    public Calculator() {
//    	�����гο� ������ġ. 
        pN.setLayout(new BorderLayout(10,0));
//        �� ���� �� �߰�
        numL.setBackground(Color.YELLOW);
        operL.setBackground(Color.ORANGE);
        pN.add(numL, "Center");
        pN.add(operL, "East");
        
//		����гο� �׸����ġ
        pC.setLayout(new GridLayout(4,4,0,0));
//        �迭���̿��ؼ� 16����ư�� �����. ��ư ��Ʈ ����. for ���� �̿� �����ϳ��� �þ���� ��ư�ϳ��� ������ 
        String num[] = {"7","8","9","+","4","5","6","-","1","2","3","*","0","C","=","/"};
        int len = btn.length;
        
        Font f = new Font("�ü�", Font.BOLD, 30);
        for (int i = 0; i < len; i++) {
            btn[i] = new Button();
            btn[i].setLabel(num[i]);
            btn[i].setFont(f);
            btn[i].setBackground(Color.LIGHT_GRAY);
//            ��ư�� ��� �гο� �߰�
            pC.add(btn[i]);
        }
//              �����ư ���� ����
        exit.setBackground(Color.RED);
//        ���� ��ư (�г��������Ѻκ�) , ���г� ����г� �߰�	
        add(exit, "South");
        add(pN, "North");
        add(pC, "Center");
        
//       ��׶��� ����, â ũ��� ��ġ, ���������� �ȵǰ� , ����͵� ������ 
        setBackground(Color.BLUE);
        setBounds(300, 200, 300, 400);
        setResizable(false);
        setVisible(true);
        
//        calculatorController = new CalculatorController(this);
        
//        Calculatorâ �̺�Ʈ ���
        
//        FontColorChooserâ �̺�Ʈ ���
    }
    
    public static void main(String[] args) {
        new Calculator();
    }




}

