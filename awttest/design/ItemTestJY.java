package com.kitri.awt.design;

import java.awt.*;

public class ItemTestJY extends Frame {
    Panel pN = new Panel();
    Panel pS = new Panel();
    
    CheckboxGroup cbg = new CheckboxGroup();
    
    Checkbox app = new Checkbox("���"); 
    Checkbox banana = new Checkbox("�ٳ���"); 
    Checkbox straw = new Checkbox("����"); 
    
    TextArea ta = new TextArea();
    
    Choice ch = new Choice();
    Button exit = new Button("����");
    
    public ItemTestJY() {
        super("Item Test !!!");
        pN.setLayout(new GridLayout(2, 2, 3, 0));
        
        pN.add(new Checkbox("��ħ", cbg, true));
        pN.add(new Checkbox("����", cbg, false));
        pN.add(new Checkbox("����", cbg, false));
        app.setBackground(Color.GREEN);
        banana.setBackground(Color.YELLOW);
        straw.setBackground(Color.RED);
        app.setState(true);
        Font f = new Font("����", Font.BOLD, 20);
        Font f2 = new Font("����", Font.PLAIN, 15);
        app.setFont(f2);
        banana.setFont(f2);
        straw.setFont(f2);
        pN.add(app);
        pN.add(banana);
        pN.add(straw);
        
        
        pS.setLayout(new BorderLayout(10, 0));
        ch.add("��ħ");
        ch.add("����");
        ch.add("����");
        exit.setFont(f);
        pS.add(ch);
        pS.add(exit, "East");
        
        setBackground(Color.orange);
        setLayout(new BorderLayout(0, 10));
        add(pN, "North");
        add(ta, "Center");
        add(pS, BorderLayout.SOUTH);
        
        setBounds(300, 200, 300, 500);
        setResizable(false);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new ItemTestJY();
    }
}