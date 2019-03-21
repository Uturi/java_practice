package com.kitri.lang;

public class StringTest1 {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "Java";
		String s3 = new String("java");
		String s4 = new String("java");
		
		if(s1 == s2)
			System.out.println("s1 s2는 주소값이 같다.");//O
		if(s1 == s3)
			System.out.println("s1 s3는 주소값이 같다.");//X
		if(s1 == s4)
			System.out.println("s1 s4는 주소값이 같다.");//X
		if(s2 == s3)
			System.out.println("s2 s3는 주소값이 같다.");//X
		if(s2 == s4)
			System.out.println("s2 s4는 주소값이 같다.");//X
		if(s3 == s4)
			System.out.println("s3 s4는 주소값이 같다.");//X

		System.out.println("-------------------------------------");
		
		if(s1.equals(s2))
			System.out.println("s1 s2는 문자열이 같다.");//X
		if(s1.equals(s3))
			System.out.println("s1 s3는 문자열이 같다.");//O
		if(s1.equals(s4))
			System.out.println("s1 s4는 문자열이 같다.");//O
		if(s2.equals(s3))
			System.out.println("s2 s3는 문자열이 같다.");//X
		if(s2.equals(s4))
			System.out.println("s2 s4는 문자열이 같다.");//X
		if(s3.equals(s4))
			System.out.println("s3 s4는 문자열이 같다.");//O
	}

}
