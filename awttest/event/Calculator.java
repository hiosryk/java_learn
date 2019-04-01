//2개면댐. 패널
//버튼 반복 배열.
//버튼 배열로처리하세요.
// 글꼴도 바꾸고 막해보세요.
// 배경색을 칠하는데 그라데이션.
// 점점 색이 바뀌게 대각선으로.
package com.kitri.awt.event;

import java.awt.*;

public class Calculator extends Frame {
//	선언부
//	패널만들기. 위 가운데
    Panel pN = new Panel();
    Panel pC = new Panel();
// 위쪽 라벨    
    Label numL = new Label("number");
    Label operL = new Label("Oper");    
// 	계산기 버튼    
    Button btn[] = new Button[16];
//    종료버튼
    Button exit    = new Button("종 료");
//    배치부
    public Calculator() {
//    	위쪽패널에 보더배치. 
        pN.setLayout(new BorderLayout(10,0));
//        라벨 색상 라벨 추가
        numL.setBackground(Color.YELLOW);
        operL.setBackground(Color.ORANGE);
        pN.add(numL, "Center");
        pN.add(operL, "East");
        
//		가운데패널에 그리드배치
        pC.setLayout(new GridLayout(4,4,0,0));
//        배열을이용해서 16개버튼을 만든다. 버튼 폰트 설정. for 문을 이용 길이하나가 늘어날수록 버튼하나씩 만들어내기 
        String num[] = {"7","8","9","+","4","5","6","-","1","2","3","*","0","C","=","/"};
        int len = btn.length;
        
        Font f = new Font("궁서", Font.BOLD, 30);
        for (int i = 0; i < len; i++) {
            btn[i] = new Button();
            btn[i].setLabel(num[i]);
            btn[i].setFont(f);
            btn[i].setBackground(Color.LIGHT_GRAY);
//            버튼을 가운데 패널에 추가
            pC.add(btn[i]);
        }
//              종료버튼 색상 빨강
        exit.setBackground(Color.RED);
//        종료 버튼 (패널지정안한부분) , 위패널 가운데패널 추가	
        add(exit, "South");
        add(pN, "North");
        add(pC, "Center");
        
//       백그라운드 색상, 창 크기와 위치, 사이즈조정 안되게 , 만든것들 보여줘 
        setBackground(Color.BLUE);
        setBounds(300, 200, 300, 400);
        setResizable(false);
        setVisible(true);
        
//        calculatorController = new CalculatorController(this);
        
//        Calculator창 이벤트 등록
        
//        FontColorChooser창 이벤트 등록
    }
    
    public static void main(String[] args) {
        new Calculator();
    }




}

