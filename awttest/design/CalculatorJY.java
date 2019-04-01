package com.kitri.awt.design;





import java.awt.*;




public class CalculatorJY extends Frame {
    
    Panel pN = new Panel();
    Panel pC = new Panel();
    
    Label numL = new Label("numbernumber");
    Label operL = new Label("Operator");    
    
    Button btn[] = new Button[16];
    
    Button exit    = new Button("종 료");
    
    public CalculatorJY() {
        pN.setLayout(new BorderLayout(5, 5));
        numL.setBackground(Color.WHITE);
        operL.setBackground(Color.LIGHT_GRAY);
        pN.add(numL, "Center");
        pN.add(operL, "East");
        
//        가운데
        pC.setLayout(new GridLayout(4,4,5,5));
        String num[] = {"7","8","9","+","4","5","6","-",
                "1","2","3","*","0","C","=","/"};
        int len = btn.length;
        Font f = new Font("돋움", Font.BOLD, 20);
        for (int i = 0; i < len; i++) {
            btn[i] = new Button();
            btn[i].setLabel(num[i]);
            btn[i].setFont(f);
            pC.add(btn[i]);
        }
        
        
        exit.setBackground(Color.LIGHT_GRAY);
        add(exit, "South");
        
        add(pN, "North");
        add(pC, "Center");
        
        setBackground(Color.DARK_GRAY);
        setBounds(300, 200, 300, 400);
        setResizable(false);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new CalculatorJY();
    }




}