package com.kitri.awt.event;

//import java.awt.Color;
//1�߱������� awt���� �����̴���Ű�� ����Ʈ
//2�İ� �� �迭. 
// 3���� ���ӱ���
//	���� �̿��ϱ����� �� ����
//	���� ī��Ʈ 
//	���� rgb 
// ���ӱ��� 3 
// ��



//����ڰ� ��ư�� �������� ��Ģ���� ��ư�� ���������� �˻�





public class CalculatorService {

	CalculatorController calculatorController;
	private Calculator c;

	
	public CalculatorService(CalculatorController calculatorController) {
		this.calculatorController = calculatorController;
		
	}


//	���

public void exit() {
	System.exit(0);
}

}
