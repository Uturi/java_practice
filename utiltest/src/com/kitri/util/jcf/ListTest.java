package com.kitri.util.jcf;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println("list size === " + list.size());
		list.add("����");
		list.add("������");
		list.add("�ڰǿ�");
		list.add("����ȯ");
		System.out.println("list size == " +list.size());
		System.out.println("-- �λ��� Ÿ�� --");
		
//		String li[] = list.toArray(new String[0]);
//		int len = li.length;
//		for (int i = 0; i < len; i++) {
//			System.out.println(i+1+"�� Ÿ�� : "+li[i]);
//		}
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i+1+"�� Ÿ�� : "+list.get(i));
		}
		
		String name = "������";
		
		int jung = (list.indexOf(name))+1;
		System.out.println(name + "�� "+jung+"�� Ÿ���Դϴ�.");
		
		for (int i = 0; i < size; i++) {
			if(list.get(i).equals(name)) {
				System.out.println(name+ "�� "+(i+1)+"�� Ÿ���Դϴ�.");
				break;
			}
			
		}
		
		String name2 = "�����";
		System.out.println(name + "�� "+name2+"���� ��ü");
//		list.set(1, name2);
		
		for (int i = 0; i < size; i++) {
			if(list.get(i).equals(name)) {
				list.set(i, name2);
				break;
			}
			
		}
		
		size= list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i+1+"�� Ÿ�� : "+list.get(i));
			
		}
		

	}

}
