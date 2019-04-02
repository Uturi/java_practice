package com.kitri.awt.event;

import java.awt.Button;
import java.awt.event.*;

//�޼ҵ� �� �ҷ�������
public class CalculatorController implements ActionListener{
	//����,������Ŭ���� �ҷ�������
	Calculator calculator;
	//����Ŭ���� �ҷ�������
	CalculatorService calculatorService;
	public String bStr;
	public CalculatorController(Calculator calculator) {
		this.calculator = calculator; //��ü�����Ѱ� ����
		calculatorService = new CalculatorService(this); //��ü ������ ����
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		Button b = (Button) ob;
		bStr = b.getLabel();

		if(ob==calculator.exit) {
			calculatorService.exit();
		}else {
			if(calculatorService.isNumber(bStr)) {
				calculatorService.numberClick(Integer.parseInt(bStr));
			}else {
				calculatorService.operClick(bStr);			
			}
		}		
//		if(��ư�󺧰��� �����ΰ�) {
//		�����϶� �޼ҵ� ȣ��}
//		else {�����϶� �޼ҵ� ȣ��}
		}
}