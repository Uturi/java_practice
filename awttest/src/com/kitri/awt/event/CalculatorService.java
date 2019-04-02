package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

//���� Ŭ����
//�̺�Ʈ�ҽ� ��ư17�� �׼Ǹ����ʾ���
public class CalculatorService {
	CalculatorController calculatorController;
	private Calculator cc;

	public int num1=0;
	public int num2=0;

 	public String str1 = "";
	public String str2 = "";
	public String op = "";
	public boolean opst= false;
	
	//������
	public CalculatorService(CalculatorController calculatorController) {
		this.calculatorController = calculatorController;
		cc = calculatorController.calculator;
	}

	//���� �Է�
		public void numberClick(int bStr) {
			if(!opst) {
				if(num1 != 0) {
					str1 += bStr;
					num1 = Integer.parseInt(str1);
					viewNum(num1+"");
				}else {
				str1 += bStr;
				num1 = Integer.parseInt(str1);
				viewNum(num1+"");
				}
			}else {
				if(num1 != 0) {
					str2 += bStr;
					num2 = Integer.parseInt(str2);
					viewNum(num2+"");
				}
			}
		}

		public void operClick(String bStr) {
			switch(bStr) {
			case "C" :
				clear();
				break;
			case "+" :
				viewOper(bStr);
				break;
			case "-" :
				viewOper(bStr);
				break;
			case "*" :
				viewOper(bStr);
				break;				
			case "/" :
				viewOper(bStr);
				break;				
			default :
				op = cc.operL.getText();
				opst=false;
				viewOper("");
				
				switch(op) {
				case "+":
					num1 = plus(num1, num2);
					viewNum(num1+"");
					break;
				case "-":
					num1 = minus(num1, num2);
					viewNum(num1+"");
					break;
				case "*":
					num1 = multi(num1, num2);
					viewNum(num1+"");
					break;
				case "/":
					num1 = div(num1, num2);
					viewNum(num1+"");
					break;
				default : 
					viewNum(num1+"");
				}
			}
		}

		public int multi(int num1, int num2) {
			return num1 * num2;
		}

		public int plus(int num1, int num2) {
			return num1 + num2;
		}

		public int minus(int num1, int num2) {
			return num1 - num2;
		}

		public int div(int num1, int num2) {
			return num1 / num2;
		}

		public boolean isNumber(String bStr) {

			boolean flag = true;
			int lenn=bStr.length();
			for (int i = 0; i < lenn; i++) {
				int x = bStr.charAt(i)-48;
						if(x<0||x>9) {
							flag = false;
							break;
						}
			}
			return flag;
		}

	//ȭ�� �����
		public void clear() {
			viewNum("");
			viewOper("");
			num1 = 0;
			num2 = 0;
			str1 = "";
			str2 = "";
			opst = false;
		}
	//�����ع�����
		public void exit() {
			System.exit(0);
		}

	//���ڶ󺧿� ��ư�Է°� ����ϱ�
		private void viewNum(String msg) {
			cc.numL.setText(msg);
		}

	//�����ڶ󺧿� ������ ���
		private void viewOper(String msg) {
			cc.operL.setText(msg);
			opst = true;
			str1 ="";
			str2 ="";
		}
		
}