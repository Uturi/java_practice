package com.kitri.lang;

public class ReverseTest {
	public static void main(String[] args) {
		String str = "!!! avaJ olleH";
		String strr = "";
		
//		str = str.replace("!!! avaJ olleH", "Hello Java !!!");
//		System.out.println("���÷��̽� : "+str);
		
		String str2 = "!!! avaJ olleH";
		byte b[] = str2.getBytes();
		int len3 = b.length;
		byte b2[] = new byte[len3];
		int x = 0;
		for (int i = len3-1; i > 0; i--) {
			b2[x++] = b[i];
		}
		strr = new String(b2);
		
		System.out.println("�ٹ���Ʈ : "+strr);		
	
		strr="";
		String str3 = "!!! avaJ olleH";
		char c[] = str3.toCharArray();
		int len = c.length;
		for (int i =(len-1); i > 0 ; i--) {
			strr += c[i];
		}
		System.out.println("ĳ���;�� : "+strr);
		
		strr="";
		String str4 = "!!! avaJ olleH";
		int len2 = str4.length();
		for (int i = len2-1; i >= 0; i--) {
			strr += str4.charAt(i);
		}
		System.out.println("ĳ���Ϳ� : "+strr);
		
		
		System.out.println("\n e �� " + (strr.indexOf('e')+1) + "��°�� �ֽ��ϴ�.");
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
	}
}
