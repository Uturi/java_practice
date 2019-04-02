package com.kitri.test6;

import java.util.ArrayList;
import java.util.List;

public class DramaArrayTest {
	public static void main(String[] args) {
		TVProgram drama[] = new Drama[4];
		
		TVProgram d1 = new Drama("그 겨울, 바람이 분다.","SBS","김규태","조인성","송혜교");
		TVProgram d2 = new Drama("백년의 유산","MBC","주성우");
		TVProgram d3 = new Drama("아이리스2","KBS","표민수","장혁","이다해");
		TVProgram d4 = new Drama("최고다 이순신","KBS","윤성식");
		
		drama[0] = d1;
		drama[1] = d2;
		drama[2] = d3;
		drama[3] = d4;
		
		System.out.println("<< 배열을 이용한 드라마 정보 >>");
		for (int i = 0; i < drama.length; i++) {
			if(i%2==0) {
			System.out.println((i+1)+". "+drama[i].toString()+drama[i].toString2());
			} else {
				System.out.println((i+1)+". "+drama[i].toString());				
			}
			
		}	
	
		
	
	}	
}
