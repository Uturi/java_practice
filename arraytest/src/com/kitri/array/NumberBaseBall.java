package com.kitri.array;

import java.io.*;

//0. com, my 3�ڸ� �迭.
//1. com ���ڸ� ���� �߻�. >> comRandom()
//2. 1�� ���ڴ� �ߺ� ���� X
//			0���� ���� X
//3. ���� �Է��� 3�ڸ� ���ڸ� my �迭�� �ֱ�
//4. com�� my�� ���ڿ� �ڸ���
//5. ���ڰ� ���ٸ�
//  5-1. �ڸ��� ���ٸ� strike ����
//  5-2. �ڸ��� �ٸ��ٸ� ball ����.
//6. 5�� ���
//  6-1. strike�� 3 : 
//	xxx�� x��°���� �����Դϴ�.
//	���(1), ����(0) : 
//  6-2. strike�� 3�� �ƴ϶��
//   1. xxx�� x��Ʈ����ũ x���Դϴ�. >> 3������

public class NumberBaseBall {
	
	private int my[] = new int[3];
	private int com[] = new int[3];
	BufferedReader in;
	public int trycnt=0;
	
	public NumberBaseBall() {
		comRandom();
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	private void comRandom() {//��ǻ�Ͱ� ù 3�ڸ����� �߻�, �ߺ����� x, 0���� x
		do {
		com[0] = (int) (Math.random()*9)+1;
		com[1] = (int) (Math.random()*10);
		com[2] = (int) (Math.random()*10);
		}
		while(com[0]==com[1] || com[0]==com[2] || com[1]==com[2]);
		
	}
	
	private void game() {
		while(true) {//���� �Է��� 3�ڸ� ���ڸ� my �迭�� �ֱ�
			System.out.println("�����Է� : ");
			int myNum = getNumber();//149
			my[0] = myNum/100;//1
			my[1] = (int) (myNum%100)/10;//4
			my[2] = myNum%10;//9
			
			int strike=0;
			int ball=0;
			//���ڿ� �ڸ��� ��
			//com[0]�ϰ� my[0]������strike
			//com[0]�ϰ� my[1], my[2]������ ball
			//com[1]�ϰ� my[1]������strike
			//com[1]�ϰ� my[0], my[2]������ ball
			//com[2]�ϰ� my[2]������strike
			//com[2]�ϰ� my[0], my[1]������ ball
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if(com[i]==my[j]&&i==j) {
						strike++;
						System.out.print(strike+"��Ʈ����ũ!  ");
					}else if(com[i]==my[j]) {
						ball++;
						System.out.println(ball+"��!");
					}
					
				}
				
			}
			
						
			//���
			if(strike ==3 ) {
//				xxx�� x��°���� �����Դϴ�.
				System.out.println(myNum+"��(��) "+trycnt+"��°���� �����Դϴ�.");
//				���(1), ����(0) : 
				System.out.print("��� �Ͻðڽ��ϱ�? ���(1), ����(0) : ");
				int end = getNumber();
				if(end==1) {
					comRandom();
					game();
				}else 
					break;
				
			} else {
			//  6-2. strike�� 3�� �ƴ϶��
			//   1. xxx�� x��Ʈ����ũ x���Դϴ�. >> 3������

			}
		}
	}
	
	private int getNumber() {
		int num = 0;
		try {
			num = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		trycnt++;
		return num;
	}

	public static void main(String[] args) {
		 NumberBaseBall nbb = new NumberBaseBall();
		 nbb.game();
	}
}
