package com.kitri.awt.design;



import java.awt.*;




public class ColorSelectorJY extends Frame {
    Panel pL = new Panel();
    Panel pLin = new Panel();
    Panel pLin2 = new Panel();
    Panel pR = new Panel();
    Panel pRin = new Panel();
    Panel pLs = new Panel();
    
    Label lE = new Label();
    Label lE2 = new Label();
    
    Label lR = new Label("»¡°­");
    Label lG = new Label("ÃÊ·Ï");
    Label lB = new Label("ÆÄ¶û");
    Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 1, 10, 0, 255);
    Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 1, 10, 0, 255);
    Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 1, 10, 0, 255);
    
    Panel colorP = new Panel();
    Label colorL = new Label();
    Button ok = new Button("È®ÀÎ");
    
    public ColorSelectorJY() {
        super("Color Selector !!!");
        
        Font f = new Font("µ¸¿ò", Font.BOLD, 20);
        lR.setFont(f);
        lG.setFont(f);
        lB.setFont(f);
        lR.setBackground(Color.red);
        lG.setBackground(Color.green);
        lB.setBackground(Color.BLUE);
        
        pL.setLayout(new BorderLayout(5, 5));
        pLin.setLayout(new GridLayout(3, 1, 10, 10));
        pLin2.setLayout(new GridLayout(3, 1, 10, 10));
        pLin.add(lR);
        pLin.add(lG);
        pLin.add(lB);
        pLin2.add(sbR);
        pLin2.add(sbG);
        pLin2.add(sbB);
        pL.add(pLin, "West");
        pL.add(pLin2, "Center");
                
        pR.setLayout(new BorderLayout(5, 5));
        pRin.setLayout(new BorderLayout(5, 5));
        colorP.setBackground(Color.cyan);
        colorL.setBackground(Color.magenta);
        pR.add(colorP, "Center");
        pRin.add(colorL, "Center");
        pRin.add(ok, "East");
        pR.add(pRin, "South");
    
        pLs.setLayout(new BorderLayout(10,10));
        pLs.add(lE, "North");
        pLs.add(lE2, "South");
        pLs.add(pL);
        
        setLayout(new GridLayout(1, 2, 5, 5));
        add(pLs);
        add(pR);
        
        setBackground(Color.LIGHT_GRAY);
        setBounds(300, 200, 400, 230);
        setResizable(false);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new ColorSelectorJY();




    }




}