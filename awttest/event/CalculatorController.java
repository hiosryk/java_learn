package com.kitri.awt.event;

import java.awt.event.*;

public class CalculatorController implements ActionListener, AdjustmentListener {

	Calculator calculator;
	CalculatorService calculatorService;
	
	public CalculatorController(Calculator calculator) {
		this.calculator = calculator;
		calculatorService = new CalculatorService(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		
	}
}