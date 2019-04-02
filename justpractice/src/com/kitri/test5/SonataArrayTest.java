package com.kitri.test5;

import java.util.*;

public class SonataArrayTest {

	public static void main(String[] args) {
		Car sonata[] = new Sonata[4];
		
		Car s1 = new Sonata("흰색", 5000, "승용", "NF");
		Car s2 = new Sonata("은색", 7000, "업무", "Brilliant");
		Car s3 = new Sonata("감홍색", 4000, "택시", "EF");
		Car s4 = new Sonata("검정색", 6000, "승용", "Hybrid");
		
		sonata[0] = s1;
		sonata[1] = s2;
		sonata[2] = s3;
		sonata[3] = s4;
		
		System.out.println("=============소나타 생산시작=============");
		for (int i = 0; i < sonata.length; i++) {
			System.out.println(sonata[i].toString());
		}
	
	}
}
