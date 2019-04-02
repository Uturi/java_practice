package com.kitri.exception.runtime;

import java.util.Random;

public class ArithMeticTest {

	public static void main(String[] args) {
		Random random = new Random();
		int x = 30;
		//Runtime Exception은 try catch안쓰고 logic으로 처리한다.
//			int y = random.nextInt(5);
//		try {
//			int z = x/y;
//			System.out.println(x+" / "+y+" = "+z);
//		} catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println("0으로 나눌수 없습니다.");
//		}
		
		//1.
		//try catch로 한거랑 완전히다름. 위에서는 프로그램단위에서 에러가 낫냐 안낫냐
		//지금은 에러가나는거 자체를 막아버림. 논리적으로 다른것.
		int y = random.nextInt(5);
		if(y != 0) {			
		int z = x/y;
		System.out.println(x+" / "+y+" = "+z);
		} else {
			System.out.println("0으로 나눌수 없습니다.");
		}
		
		//2.
//		int y = random.nextInt(4)+1;
//		int z = x/y;
//		System.out.println(x+" / "+y+" = "+z);
		

		
		
	}
	
	
	
}
