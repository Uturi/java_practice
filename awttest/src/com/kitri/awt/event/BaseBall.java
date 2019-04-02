package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

//[������ Ŭ����]

public class BaseBall extends Frame {

	Panel pE = new Panel();
	Panel pS = new Panel();

	TextArea ta = new TextArea();

	Button newG = new Button("������");
	Button clear = new Button("�����");
	Button dap = new Button("�� ��");
	Button fontC = new Button("���ڻ�");
	Button exit = new Button("����");

	Label l = new Label("����",  Label.CENTER);
	TextField tf = new TextField();
	
	Label ls = new Label();
	
	// ###��Ʈ�ѷ� �и�###
	BaseBallController baseBallController;
	//���ڻ����� Ŭ���� ��ȯ
	FontColorChooser fontColorChooser = new FontColorChooser();

	public BaseBall() {
		// <������ �г�>
		pE.setLayout(new GridLayout(5, 1, 10, 10));
		pE.add(newG);
		pE.add(clear);
		pE.add(dap);
		pE.add(fontC);
		pE.add(exit);

		// <�Ʒ� �г�>
		pS.setLayout(new BorderLayout(10, 10));
		pS.add(l, "West");
		pS.add(tf, "Center");
		pS.add(ls, "East");

		// <������>
		setBackground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout(10, 10));
//		ta.setEnable(false); //setEditable() : ��� ���� �޼ҵ�    (Ŀ���� �� ��)
		ta.setEditable(false); //setEditable() : ���� ���� �޼ҵ� (Ŀ���� ��)
		Font f = new Font("����", Font.BOLD, 20);
		ta.setFont(f);
		add(ta, "Center");
		add(pE, "East");
		add(pS, "South");

		///////////////////////////// �޸𸮻��� Frame ��ġ �Ϸ�//////////////////////////

		setBounds(300, 200, 500, 400); // setBounds(int x, int y, int width, int height) : ��ġ, ũ�� �� �濡 ����
		setVisible(true); // ��ġ �Ϸ�� Frame�� ���̰� �ϱ� ***�׻� ��ġ���� ������

		// ###��Ʈ�ѷ� �и�###
		baseBallController = new BaseBallController(this);
		
//		baseball â �̺�Ʈ ���
		tf.addActionListener(baseBallController);         //��Ʈ�ѷ��� ȣ��
		newG.addActionListener(baseBallController);
		clear.addActionListener(baseBallController);
		dap.addActionListener(baseBallController);
		fontC.addActionListener(baseBallController);
		exit.addActionListener(baseBallController);
		
		this.addWindowListener(baseBallController);
		
//		FontColorChooser â �̺�Ʈ ���
		fontColorChooser.ok.addActionListener(baseBallController);
		
		fontColorChooser.sbR.addAdjustmentListener(baseBallController);
		fontColorChooser.sbG.addAdjustmentListener(baseBallController);
		fontColorChooser.sbB.addAdjustmentListener(baseBallController);
		
		
	}

	public static void main(String[] args) {
		new BaseBall();
	}

}
