package com.kitri.awt.design;

import java.awt.*;

public class ItemTestMy extends Frame {

	//위쪽패널
	Panel pN = new Panel();
	//아래쪽패널
	Panel pS = new Panel();

	//체크박스
	Checkbox app = new Checkbox("사과");
	Checkbox banaan = new Checkbox("바나나");
	Checkbox straw = new Checkbox("딸기");
	//라디오버튼
	CheckboxGroup cg = new CheckboxGroup();
	Checkbox ch4 = new Checkbox("아침", cg, true);
	Checkbox ch5 = new Checkbox("점심", cg, false);
	Checkbox ch6 = new Checkbox("저녁", cg, false);
	//입력창
	TextArea ta = new TextArea();
	//선택창
	Choice ch = new Choice();
	//종료버튼
	Button exit = new Button("종료");

	public ItemTest() {
		super("Item Test !!!");//타이틀
//		위
		pN.setLayout(new GridLayout(2, 3));//격자배치
		
//		ch.setBackground(new Color(150, 210, 150));
//		ch.setForeground(Color.ORANGE);
		Font f = new Font("굴림", Font.BOLD, 20);//폰트
		ch.setFont(f);
//		추가 체크박스 라디오박스 
		pN.add(ch4);
		pN.add(ch5);
		pN.add(ch6);
		pN.add(ch1);
		pN.add(ch2);
		pN.add(ch3);
//		아래패널 격자 배치			
		pS.setLayout(new GridLayout(1, 2, 10, 0));
		ch.add("아침");
		ch.add("점심");
		ch.add("저녁");

		pS.add(ch);

		exit.setFont(f);
		pS.add(exit);

		setLayout(new BorderLayout(5, 10)); //패널배치
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
