package com.kitri.awt.event;

import java.awt.Button;
import java.awt.event.*;

//메소드 싹 불러버리기
public class CalculatorController implements ActionListener{
	//메인,디자인클래스 불러버리기
	Calculator calculator;
	//로직클래스 불러버리기
	CalculatorService calculatorService;
	public String bStr;
	public CalculatorController(Calculator calculator) {
		this.calculator = calculator; //객체생성한거 저장
		calculatorService = new CalculatorService(this); //객체 로직에 전달
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
//		if(버튼라벨값이 숫자인가) {
//		숫자일때 메소드 호출}
//		else {문자일때 메소드 호출}
		}
}