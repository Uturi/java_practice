/*버스의 기본요금을 1000원이라고 가정하고, 다음과 같은 연령별 분류에 따라서 별도의할인율을 적용하여 최종요금을 계산하는 프로그램을 작성합니다.
단, 반드시 다중if 문을 사용하여 '단계별 분류 방식'으로 구현합니다.
0~3세 영유아 할인율 100% (무료)
4~13세 어린이 할인율 50% 
14~19세 청소년 할인율 25%
20세 이상 성인 할인율 0%
65세 이상 어르신 할인율 100% (무료)

요금계산과정에서 자료형에 주의합니다. 그리고 요금을 계산하지 않고 계산된 요금을 직접 출력하는것은 허용하지 않습니다.
입력  출력
2	최종요금:0원
12	최종요금:500원
17	최종요금:750원
24	최종요금:1000원
67	최종요금:0원*/
import java.io.*;

public class prac5 {
	public static void main(String[] args) throws Exception {
		BufferedReader in;

		in = new BufferedReader(new InputStreamReader(System.in));
		
		int price;
		int basic=1000;
		int disper;
		
		System.out.println("나이를 입력하세요.");
		int age = Integer.parseInt(in.readLine());
		if(age>=0&&age<=3){
			disper = 0;
			price = (int) (basic  * (disper * 0.01));
			System.out.println("최종요금 : "+ price+"원");
		} if(age>=4&&age<=13) {
			disper = 50;
			price = (int) (basic  * (disper * 0.01));
			System.out.println("최종요금 : "+ price+"원");
		} if(age>=14&&age<=19) {
			disper = 75;
			price = (int) (basic  * (disper * 0.01));
			System.out.println("최종요금 : "+ price+"원");
		} if(age>=20&&age<65) {
			disper = 100;
			price = (int) (basic  * (disper * 0.01));
			System.out.println("최종요금 : "+ price+"원");
		} if(age>=65) {
			disper = 0;
			price = (int) (basic  * (disper * 0.01));
			System.out.println("최종요금 : "+ price+"원");
		}
		
		
	}
}
