/*������ �⺻����� 1000���̶�� �����ϰ�, ������ ���� ���ɺ� �з��� ���� �������������� �����Ͽ� ��������� ����ϴ� ���α׷��� �ۼ��մϴ�.
��, �ݵ�� ����if ���� ����Ͽ� '�ܰ躰 �з� ���'���� �����մϴ�.
0~3�� ������ ������ 100% (����)
4~13�� ��� ������ 50% 
14~19�� û�ҳ� ������ 25%
20�� �̻� ���� ������ 0%
65�� �̻� ��� ������ 100% (����)

��ݰ��������� �ڷ����� �����մϴ�. �׸��� ����� ������� �ʰ� ���� ����� ���� ����ϴ°��� ������� �ʽ��ϴ�.
�Է�  ���
2	�������:0��
12	�������:500��
17	�������:750��
24	�������:1000��
67	�������:0��*/
import java.io.*;

public class prac5 {
	public static void main(String[] args) throws Exception {
		BufferedReader in;

		in = new BufferedReader(new InputStreamReader(System.in));
		
		int price;
		int basic=1000;
		int disper;
		
		System.out.println("���̸� �Է��ϼ���.");
		int age = Integer.parseInt(in.readLine());
		if(age>=0&&age<=3){
			disper = 0;
			price = (int) (basic  * (disper * 0.01));
			System.out.println("������� : "+ price+"��");
		} if(age>=4&&age<=13) {
			disper = 50;
			price = (int) (basic  * (disper * 0.01));
			System.out.println("������� : "+ price+"��");
		} if(age>=14&&age<=19) {
			disper = 75;
			price = (int) (basic  * (disper * 0.01));
			System.out.println("������� : "+ price+"��");
		} if(age>=20&&age<65) {
			disper = 100;
			price = (int) (basic  * (disper * 0.01));
			System.out.println("������� : "+ price+"��");
		} if(age>=65) {
			disper = 0;
			price = (int) (basic  * (disper * 0.01));
			System.out.println("������� : "+ price+"��");
		}
		
		
	}
}