/*if���̿� �ִ񰪱��ϱ�
����ڷκ��� �������� �Է¹޾� ���� ����ū������ϴ����α׷��ۼ�
�� ���׿����� ��븻�� �ݵ�������� 
�Է� ��: 10
		 30
		-10

		max : 30
		*/
import java.io.*;

public class prac1 {
	public static void main(String[] args) throws Exception {

		BufferedReader in;

		in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("���� �� ���� �Է��Ͻÿ�.");
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
