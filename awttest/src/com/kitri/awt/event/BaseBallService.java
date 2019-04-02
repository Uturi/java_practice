package com.kitri.awt.event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

// [���� Ŭ����]

// �̺�Ʈ �ҽ� : 6�� (��ư 5�� + �ؽ�Ʈ�ʵ� 1��)
// ��� �׼��̺�Ʈ

public class BaseBallService {

	// [�ʵ�]
	BaseBallController baseBallController;
	private FontColorChooser fcc;
	private BaseBall bb;

	private int my[];
	private int com[];
	int gameLength; // ���� ����
	int count; // ���� Ƚ�� ���������� ����
	Random random = new Random();
	int r, g, b;

	// [������]
	public BaseBallService(BaseBallController baseBallController) {
		this.baseBallController = baseBallController;
		bb = baseBallController.baseBall;
		fcc = bb.fontColorChooser;
		// ���� ���� ũ�� �ʱ�ȭ
		gameLength = 3;

		// �迭 ũ�� �ʱ�ȭ
		my = new int[gameLength];
		com = new int[gameLength];

		// �� ���� ���� �޼ҵ� ȣ��
		newGame();
	}

	// <�� ���� ����> �޼ҵ�
	public void newGame() {

		// com[]�� �� �ڸ� ���� ����
		com[0] = random.nextInt(9) + 1; // com�� ù ��° �ڸ��� 0�� �ƴ� ��

		do { // com�� ������ �ڸ��� 0~9�� �� (�ߺ� X)
			com[1] = random.nextInt(10);
		} while (com[0] == com[1]);

		do {
			com[2] = random.nextInt(10);
		} while (com[0] == com[2] || com[1] == com[2]);
		//�������Ҷ� �ٽ� �ؽ�Ʈ�ʵ� ����ϰ� Ǯ���������
		bb.tf.setEnabled(true);
		clear();
		viewResult("���ο� ������ �����մϴ�.");
		count = 0;
		// [�ӽ�] �� �̱� ó��
		System.out.println("�� : " + com[0] + com[1] + com[2]);

	}

	// <ȭ�� �����> �޼ҵ�
	public void clear() {
		bb.ta.setText(" ");
	}

	// <�� ���> �޼ҵ�
	public void showDap() {
		viewResult("������ " + com[0] + com[1] + com[2] + "�Դϴ�.");
		viewResult("�� ���� �Ǵ� ���Ḧ ��������!");
		bb.tf.setEnabled(false);
	}

	//
	public void fontColorChange() {
		fcc.setVisible(true);
		changeColor();
	}

	// <���α׷� ����> �޼ҵ�
	public void exit() {
		System.exit(0);
	}

	public void game() {
		int strike = 0;
		int ball = 0;

		String myNumStr = bb.tf.getText().trim();
		bb.tf.setText("");  //�Է°� ������ �ٷ� �����

		if(myNumStr.length() != gameLength) {
			viewResult("3�ڸ� ���ڸ� �Է��ϼ���!!!!");
			return;
		}
		
		if(!isNumber(myNumStr)) {
			viewResult("���ڸ� �Է��ϼ���!!!!");
			return;
		}
		
		for (int i = 0; i < gameLength; i++) {
			my[i] = myNumStr.charAt(i) - 48; // myNumStr.charAt(i)�� char�̹Ƿ�, asciicode�� 0(48)���� ����
		}

		// ���ڿ� �ڸ��� ��
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
		//���ڿ� �ڸ��� ��(���� ���� ����) �� count ����!
		count++;
		
		//��Ʈ����ũ�� �ƴ� ���
		if(strike != gameLength) {
			viewResult(count + ". " + myNumStr + "�� " + strike + "��Ʈ����ũ " + ball + "�� �Դϴ�.");
		} else {
			viewResult(myNumStr + "�� " + count + "��°���� �����Դϴ�.");
			viewResult("������ �Ǵ� ���Ḧ �����ּ���!");
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
