/*if문이용 최댓값구하기
사용자로부터 세정수를 입력받아 그중 가장큰수출력하는프로그램작성
단 삼항연산자 사용말고 반드시이프문 
입력 예: 10
		 30
		-10

		max : 30
		*/
import java.io.*;

public class prac1 {
	public static void main(String[] args) throws Exception {

		BufferedReader in;

		in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("정수 세 개를 입력하시오.");
		int a = Integer.parseInt(in.readLine());
		int b = Integer.parseInt(in.readLine());
		int c = Integer.parseInt(in.readLine());

		if(a>b){
			if(a>c){
				System.out.println("max : "+ a);
			}else if(c>a){
				System.out.println("max : "+ c);
			}
		}else if(b>a){
			if(b>c){
				System.out.println("max : "+ b);
			}else if(c>b){
				System.out.println("max : "+ c);
			}
		}


	}
}
