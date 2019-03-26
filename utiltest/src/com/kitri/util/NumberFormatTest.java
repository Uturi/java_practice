package com.kitri.util;

import java.text.*;


public class NumberFormatTest {
	public static void main(String[] args) {
		double number = 64165416568.16587;
		//64,165,416,568.16
		
		
		Format f = new DecimalFormat("##,###,###,###,###.##");
		String num = f.format(number);
		System.out.println(num);
	}
}
