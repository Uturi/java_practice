package com.kitri.array;

import java.io.*;

//0. com, my 3자리 배열.
//1. com 세자리 난수 발생. >> comRandom()
//2. 1의 숫자는 중복 숫자 X
//			0으로 시작 X
//3. 내가 입력한 3자리 숫자를 my 배열에 넣기
//4. com과 my의 숫자와 자리비교
//5. 숫자가 같다면
//  5-1. 자리수 같다면 strike 증가
//  5-2. 자리수 다르다면 ball 증가.
//6. 5의 결과
//  6-1. strike가 3 : 
//	xxx는 x번째만에 정답입니다.
//	계속(1), 종료(0) : 
//  6-2. strike가 3이 아니라면
//   1. xxx는 x스트라이크 x볼입니다. >> 3번으로

public class NumberBaseBall {
	
	private int my[] = new int[3];
	private int com[] = new int[3];
	BufferedReader in;
	public int trycnt=0;
	
	public NumberBaseBall() {
		comRandom();
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	private void comRandom() {//컴퓨터가 첫 3자리난수 발생, 중복숫자 x, 0시작 x
		do {
		com[0] = (int) (Math.random()*9)+1;
		com[1] = (int) (Math.random()*10);
		com[2] = (int) (Math.random()*10);
		}
		while(com[0]==com[1] || com[0]==com[2] || com[1]==com[2]);
		
	}
	
	private void game() {
		while(true) {//내가 입력한 3자리 숫자를 my 배열에 넣기
			System.out.println("숫자입력 : ");
			int myNum = getNumber();//149
			my[0] = myNum/100;//1
			my[1] = (int) (myNum%100)/10;//4
			my[2] = myNum%10;//9
			
			int strike=0;
			int ball=0;
			//숫자와 자리수 비교
			//com[0]하고 my[0]같으면strike
			//com[0]하고 my[1], my[2]같으면 ball
			//com[1]하고 my[1]같으면strike
			//com[1]하고 my[0], my[2]같으면 ball
			//com[2]하고 my[2]같으면strike
			//com[2]하고 my[0], my[1]같으면 ball
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if(com[i]==my[j]&&i==j) {
						strike++;
						System.out.print(strike+"스트라이크!  ");
					}else if(com[i]==my[j]) {
						ball++;
						System.out.println(ball+"볼!");
					}
					
				}
				
			}
			
						
			//결과
			if(strike ==3 ) {
//				xxx는 x번째만에 정답입니다.
				System.out.println(myNum+"은(는) "+trycnt+"번째만에 정답입니다.");
//				계속(1), 종료(0) : 
				System.out.print("계속 하시겠습니까? 계속(1), 종료(0) : ");
				int end = getNumber();
				if(end==1) {
					comRandom();
					game();
				}else 
					break;
				
			} else {
			//  6-2. strike가 3이 아니라면
			//   1. xxx는 x스트라이크 x볼입니다. >> 3번으로

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
