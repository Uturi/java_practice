/*버스의 기본요금을 1000원이라고 가정하고, 나이가 20세미만인 영유아, 어린이, 청소년에 대해서 요금을 25% 할인해주고 
20세 이상 성인은 할인을 해주지 않기로 합니다. 요금 계산 과정에서 자료형에 주의합니다. 
그리고 요금을 계산하지 않고 '750원'이나 '1000원'을 직접 출력하는 것은 허용되지 않습니다.

입력       출력
17    최종요금: 750원
21	  최종요금: 1000원*/
import java.io.*;

public class prac3 {
	public static void main(String[] args) throws Exception {
		BufferedReader in;

		in = new BufferedReader(new InputStreamReader(System.in));
		
		int price;
		int basic=1000;
		int disper;
		
		System.out.println("나이를 입력하세요.");
		int age = Integer.parseInt(in.readLine());
		if(age<20){
			disper = 75;
			price = (int) (basic  * (disper * 0.01));
			System.out.println("최종요금 : "+ price+"원");
		} else if(age>=20) {
			disper = 100;
			price = (int) (basic  * (disper * 0.01));
			System.out.println("최종요금 : "+ price+"원");
		} 
		
		System.out.println("");
	}
}
