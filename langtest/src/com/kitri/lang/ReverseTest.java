package com.kitri.lang;

public class ReverseTest {
	public static void main(String[] args) {
		String str = "!!! avaJ olleH";
		String strr = "";
		
//		str = str.replace("!!! avaJ olleH", "Hello Java !!!");
//		System.out.println("리플레이스 : "+str);
		
		String str2 = "!!! avaJ olleH";
		byte b[] = str2.getBytes();
		int len3 = b.length;
		byte b2[] = new byte[len3];
		int x = 0;
		for (int i = len3-1; i > 0; i--) {
			b2[x++] = b[i];
		}
		strr = new String(b2);
		
		System.out.println("겟바이트 : "+strr);		
	
		strr="";
		String str3 = "!!! avaJ olleH";
		char c[] = str3.toCharArray();
		int len = c.length;
		for (int i =(len-1); i > 0 ; i--) {
			strr += c[i];
		}
		System.out.println("캐릭터어레이 : "+strr);
		
		strr="";
		String str4 = "!!! avaJ olleH";
		int len2 = str4.length();
		for (int i = len2-1; i >= 0; i--) {
			strr += str4.charAt(i);
		}
		System.out.println("캐릭터엣 : "+strr);
		
		
		System.out.println("\n e 는 " + (strr.indexOf('e')+1) + "번째에 있습니다.");
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
	}
}
