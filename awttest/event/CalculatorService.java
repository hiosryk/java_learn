package com.kitri.awt.event;

//import java.awt.Color;
//1야구게임은 awt색과 난수뽑는패키지 임포트
//2컴과 나 배열. 
// 3변수 게임길이
//	난수 이용하기위해 뉴 생성
//	변수 카운트 
//	변수 rgb 
// 게임길이 3 
// 나



//사용자가 버튼을 눌렀는지 사칙연산 버튼을 눌렀는지를 검사





public class CalculatorService {

	CalculatorController calculatorController;
	private Calculator c;

	
	public CalculatorService(CalculatorController calculatorController) {
		this.calculatorController = calculatorController;
		
	}


//	기능

public void exit() {
	System.exit(0);
}

}
