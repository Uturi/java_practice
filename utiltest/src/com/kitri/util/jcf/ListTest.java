package com.kitri.util.jcf;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println("list size === " + list.size());
		list.add("허경민");
		list.add("정수빈");
		list.add("박건우");
		list.add("김재환");
		System.out.println("list size == " +list.size());
		System.out.println("-- 두산의 타순 --");
		
//		String li[] = list.toArray(new String[0]);
//		int len = li.length;
//		for (int i = 0; i < len; i++) {
//			System.out.println(i+1+"번 타자 : "+li[i]);
//		}
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i+1+"번 타자 : "+list.get(i));
		}
		
		String name = "정수빈";
		
		int jung = (list.indexOf(name))+1;
		System.out.println(name + "은 "+jung+"번 타자입니다.");
		
		for (int i = 0; i < size; i++) {
			if(list.get(i).equals(name)) {
				System.out.println(name+ "은 "+(i+1)+"번 타자입니다.");
				break;
			}
			
		}
		
		String name2 = "오재원";
		System.out.println(name + "을 "+name2+"으로 교체");
//		list.set(1, name2);
		
		for (int i = 0; i < size; i++) {
			if(list.get(i).equals(name)) {
				list.set(i, name2);
				break;
			}
			
		}
		
		size= list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i+1+"번 타자 : "+list.get(i));
			
		}
		

	}

}
