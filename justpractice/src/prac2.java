/*����ڰ� �Է��� ���� ���������� �����ϰ� ���� �ٸ� �ڵ带 �����ϵ��� ��� ����
��� 1: 0�̸�
��� 2: 10���� 0�ʰ�
��� 3: 10�ʰ�
*/

import java.io.*;

public class prac2 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader in;

		in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������ �Է��Ͻÿ�.");
		int num = Integer.parseInt(in.readLine());
		
		if(num>10){
			System.out.println("10 �ʰ�");			
		} else{
			if(num<=10 && num>0){
			System.out.println("10���� 0�ʰ�");
			}else{
			System.out.println("0 �̸�");
			}
		}
		
	}
}
