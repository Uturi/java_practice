package com.kitri.test5;

import java.util.*;

public class SonataArrayTest {

	public static void main(String[] args) {
		Car sonata[] = new Sonata[4];
		
		Car s1 = new Sonata("���", 5000, "�¿�", "NF");
		Car s2 = new Sonata("����", 7000, "����", "Brilliant");
		Car s3 = new Sonata("��ȫ��", 4000, "�ý�", "EF");
		Car s4 = new Sonata("������", 6000, "�¿�", "Hybrid");
		
		sonata[0] = s1;
		sonata[1] = s2;
		sonata[2] = s3;
		sonata[3] = s4;
		
		System.out.println("=============�ҳ�Ÿ �������=============");
		for (int i = 0; i < sonata.length; i++) {
			System.out.println(sonata[i].toString());
		}
	
	}
}
