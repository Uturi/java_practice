package com.kitri.test6;

import java.util.ArrayList;
import java.util.List;

public class DramaArrayTest {
	public static void main(String[] args) {
		TVProgram drama[] = new Drama[4];
		
		TVProgram d1 = new Drama("�� �ܿ�, �ٶ��� �д�.","SBS","�����","���μ�","������");
		TVProgram d2 = new Drama("����� ����","MBC","�ּ���");
		TVProgram d3 = new Drama("���̸���2","KBS","ǥ�μ�","����","�̴���");
		TVProgram d4 = new Drama("�ְ�� �̼���","KBS","������");
		
		drama[0] = d1;
		drama[1] = d2;
		drama[2] = d3;
		drama[3] = d4;
		
		System.out.println("<< �迭�� �̿��� ��� ���� >>");
		for (int i = 0; i < drama.length; i++) {
			if(i%2==0) {
			System.out.println((i+1)+". "+drama[i].toString()+drama[i].toString2());
			} else {
				System.out.println((i+1)+". "+drama[i].toString());				
			}
			
		}	
	
		
	
	}	
}
