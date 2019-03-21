/*사용자가 입력한 값을 세가지경우로 구별하고 각각 다른 코드를 실행하도록 제어문 구성
경우 1: 0미만
경우 2: 10이하 0초과
경우 3: 10초과
*/

import java.io.*;

public class prac2 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader in;

		in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("정수를 입력하시오.");
		int num = Integer.parseInt(in.readLine());
		
		if(num>10){
			System.out.println("10 초과");			
		} else{
			if(num<=10 && num>0){
			System.out.println("10이하 0초과");
			}else{
			System.out.println("0 미만");
			}
		}
		
	}
}
