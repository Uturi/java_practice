/*������ �⺻����� 1000���̶�� �����ϰ�, ���̰� 20���̸��� ������, ���, û�ҳ⿡ ���ؼ� ����� 25% �������ְ� 
20�� �̻� ������ ������ ������ �ʱ�� �մϴ�. ��� ��� �������� �ڷ����� �����մϴ�. 
�׸��� ����� ������� �ʰ� '750��'�̳� '1000��'�� ���� ����ϴ� ���� ������ �ʽ��ϴ�.

�Է�       ���
17    �������: 750��
21	  �������: 1000��*/
import java.io.*;

public class prac3 {
	public static void main(String[] args) throws Exception {
		BufferedReader in;

		in = new BufferedReader(new InputStreamReader(System.in));
		
		int price;
		int basic=1000;
		int disper;
		
		System.out.println("���̸� �Է��ϼ���.");
		int age = Integer.parseInt(in.readLine());
		if(age<20){
			disper = 75;
			price = (int) (basic  * (disper * 0.01));
			System.out.println("������� : "+ price+"��");
		} else if(age>=20) {
			disper = 100;
			price = (int) (basic  * (disper * 0.01));
			System.out.println("������� : "+ price+"��");
		} 
		
		System.out.println("");
	}
}
