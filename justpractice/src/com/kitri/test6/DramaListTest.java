package com.kitri.test6;

import java.util.ArrayList;
import java.util.List;

public class DramaListTest {
	public static void main(String[] args) {
	Drama[] drama = new Drama[4];
	
	List<Drama> li = new ArrayList<Drama>();
	
	Drama d1 = new Drama("�� �ܿ�, �ٶ��� �д�.","SBS","�����","���μ�","������");
	Drama d2 = new Drama("����� ����","MBC","�ּ���",null,null);
	Drama d3 = new Drama("���̸���2","KBS","ǥ�μ�","����","�̴���");
	Drama d4 = new Drama("�ְ�� �̼���","KBS","������",null,null);
	
	li.add(d1);
	li.add(d2);
	li.add(d3);
	li.add(d4);
	System.out.println("<< ArrayList�� �̿��� ��� ���� >>");
	
	int size = li.size();
	for (int i = 0; i < size; i++) {
		System.out.println(i+1+". "+li.get(i));
	}
	
	
	}
}
