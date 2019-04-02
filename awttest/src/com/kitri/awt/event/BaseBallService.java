package com.kitri.awt.event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

// [로직 클래스]

// 이벤트 소스 : 6개 (버튼 5개 + 텍스트필드 1개)
// 모두 액션이벤트

public class BaseBallService {

	// [필드]
	BaseBallController baseBallController;
	private FontColorChooser fcc;
	private BaseBall bb;

	private int my[];
	private int com[];
	int gameLength; // 게임 숫자
	int count; // 게임 횟수 전역변수로 지정
	Random random = new Random();
	int r, g, b;

	// [생성자]
	public BaseBallService(BaseBallController baseBallController) {
		this.baseBallController = baseBallController;
		bb = baseBallController.baseBall;
		fcc = bb.fontColorChooser;
		// 게임 숫자 크기 초기화
		gameLength = 3;

		// 배열 크기 초기화
		my = new int[gameLength];
		com = new int[gameLength];

		// 새 게임 시작 메소드 호출
		newGame();
	}

	// <새 게임 시작> 메소드
	public void newGame() {

		// com[]에 세 자리 난수 저장
		com[0] = random.nextInt(9) + 1; // com의 첫 번째 자리는 0이 아닌 수

		do { // com의 나머지 자리는 0~9의 수 (중복 X)
			com[1] = random.nextInt(10);
		} while (com[0] == com[1]);

		do {
			com[2] = random.nextInt(10);
		} while (com[0] == com[2] || com[1] == com[2]);
		//새게임할때 다시 텍스트필드 사용하게 풀어줘버리기
		bb.tf.setEnabled(true);
		clear();
		viewResult("새로운 게임을 시작합니다.");
		count = 0;
		// [임시] 답 뽑기 처리
		System.out.println("답 : " + com[0] + com[1] + com[2]);

	}

	// <화면 지우기> 메소드
	public void clear() {
		bb.ta.setText(" ");
	}

	// <답 출력> 메소드
	public void showDap() {
		viewResult("정답은 " + com[0] + com[1] + com[2] + "입니다.");
		viewResult("새 게임 또는 종료를 누르세요!");
		bb.tf.setEnabled(false);
	}

	//
	public void fontColorChange() {
		fcc.setVisible(true);
		changeColor();
	}

	// <프로그램 종료> 메소드
	public void exit() {
		System.exit(0);
	}

	public void game() {
		int strike = 0;
		int ball = 0;

		String myNumStr = bb.tf.getText().trim();
		bb.tf.setText("");  //입력값 얻어오고 바로 지우기

		if(myNumStr.length() != gameLength) {
			viewResult("3자리 숫자를 입력하세요!!!!");
			return;
		}
		
		if(!isNumber(myNumStr)) {
			viewResult("숫자만 입력하세요!!!!");
			return;
		}
		
		for (int i = 0; i < gameLength; i++) {
			my[i] = myNumStr.charAt(i) - 48; // myNumStr.charAt(i)은 char이므로, asciicode의 0(48)값을 빼줌
		}

		// 숫자와 자릿수 비교
		for (int i = 0; i < gameLength; i++) {
			for (int j = 0; j < gameLength; j++) {
				if (my[i] == com[j]) {
					if (i == j)
						strike++;
					else
						ball++;
				}
			}
		}
		//숫자와 자릿수 비교(게임 정상 구동) 후 count 증가!
		count++;
		
		//스트라이크가 아닌 경우
		if(strike != gameLength) {
			viewResult(count + ". " + myNumStr + "는 " + strike + "스트라이크 " + ball + "볼 입니다.");
		} else {
			viewResult(myNumStr + "은 " + count + "번째만에 정답입니다.");
			viewResult("새게임 또는 종료를 눌러주세요!");
			bb.tf.setEnabled(false);
			
		}

	}

	private boolean isNumber(String str) {
		boolean flag = true;
		for (int i = 0; i < gameLength; i++) {
			int num = str.charAt(i) - 48;
			if(num < 0 || num > 9) {
				flag = false;
				break;
				}
			}
		return flag;
	}
	
	private void viewResult(String msg) {
		bb.ta.append(msg + "\n");
	}
	
	
	public void changeColor() {
		r = fcc.sbR.getValue();
		g = fcc.sbG.getValue();
		b = fcc.sbB.getValue();
		fcc.colorP.setBackground(new Color(r,g,b));
		fcc.colorL.setText("r = "+r+" g = "+g+" b = "+b);
	}
	
	public void selectColor() {
		bb.ta.setForeground(new Color(r, g, b));
		fcc.setVisible(false);
	}
	
}
