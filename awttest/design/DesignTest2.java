package com.kitri.awt.design;

import java.awt.*;

//컨트롤 쉬프트 O 자동으로 임포트

/*1. Frame 상속
/2. 선언부에 필요한 객체들을 생성. 생성자에서 해도 되는데 어짜피
/저모양이나오려면 버튼이 만들어져야대니까 클래스가
/만들어지는 시점에서 해도 상관없지만.
/3. 배치부에서 design(component 배치)
/  <*작업은 작은거에서 큰거순으로*> 
/예를들어 북쪽에다가 패널붙이고가아니라 
/패널에다가 세개붙이고 그놈을 프레임의 북쪽에붙여라 
*/
public class DesignTest2 extends Frame {
//선언부
	// awt하는동안에는 여기를 선언부라고할것이다.
	Panel pN = new Panel(); // api가서 생성자보면 레이아웃매니저도잇지만 그거는 배치부에서하는게좋고
							// 일반적으로 디폴트만든다.
	Panel pS = new Panel();
	Label l = new Label("입력"); // api보니까 여기서입력 바로하는게좋겟네
	TextField tf = new TextField();
	Button send = new Button("전송");// 마찬가지.
	// 위에까지 북쪽완성.
	TextArea ta = new TextArea();
	// 가운데완성.
	Choice ch = new Choice(); // 생성자가업으니 아래서 해야겠네
	Button exit = new Button(":종료");

	public DesignTest2() {
		super ("Design Test !!!");
//	3.배치부
//		1.setText("입력:)
//		LayoutManager lm = new BorderLayout();
		pN.setLayout(new BorderLayout());
		l.setBackground(new Color(100, 200, 150));
//		l.setForeground(new Color(255, 0, 255));
		l.setForeground(new Color(255, 0, 255));
		
		pN.add(l, "West");
		pN.add(tf, "Center");
		pN.add(send, "East"); //붂족완성
		
		pS.setLayout(new GridLayout(1,2, 10, 0)); //
		ch.add("서울");
		ch.add("경기,인천");
		ch.add("강원");
		ch.add("충청");
		
		pS.add(ch);
		pS.add(exit);

		add(pN, "North");
		add(ta, "Center");
		add(pS, BorderLayout.SOUTH); // 이것도댐 샘플 둘중하나 써요.
		
		// 메모리상에서 만들겠다고한거임

//		setVisible(true); // 보여줘라. 순서가 잘못돼었다. 다지정하고나서 보여줘라를해라.
	
		//setSize(300, 400);// 크기지정해라.
		//setLocation(300, 200); //여기위치해라
		setBounds(300, 200, 300, 500);
		setResizable(false);
		setVisible(true); // 보여줘라.
	
	//모양이 잘못되었다 북쪽은 보더를 잡아야댄다.
	
	}

	public static void main(String[] args) {
		new DesignTest2();

	}

}
//자바 버전에따른 지원하는글골. 중요하지않다.
