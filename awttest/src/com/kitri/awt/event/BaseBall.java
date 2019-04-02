package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

//[디자인 클래스]

public class BaseBall extends Frame {

	Panel pE = new Panel();
	Panel pS = new Panel();

	TextArea ta = new TextArea();

	Button newG = new Button("새게임");
	Button clear = new Button("지우기");
	Button dap = new Button("정 답");
	Button fontC = new Button("글자색");
	Button exit = new Button("종료");

	Label l = new Label("숫자",  Label.CENTER);
	TextField tf = new TextField();
	
	Label ls = new Label();
	
	// ###컨트롤러 분리###
	BaseBallController baseBallController;
	//글자색변경 클래스 소환
	FontColorChooser fontColorChooser = new FontColorChooser();

	public BaseBall() {
		// <오른쪽 패널>
		pE.setLayout(new GridLayout(5, 1, 10, 10));
		pE.add(newG);
		pE.add(clear);
		pE.add(dap);
		pE.add(fontC);
		pE.add(exit);

		// <아래 패널>
		pS.setLayout(new BorderLayout(10, 10));
		pS.add(l, "West");
		pS.add(tf, "Center");
		pS.add(ls, "East");

		// <프레임>
		setBackground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout(10, 10));
//		ta.setEnable(false); //setEditable() : 사용 막는 메소드    (커서도 안 들어감)
		ta.setEditable(false); //setEditable() : 편집 막는 메소드 (커서는 들어감)
		Font f = new Font("굴림", Font.BOLD, 20);
		ta.setFont(f);
		add(ta, "Center");
		add(pE, "East");
		add(pS, "South");

		///////////////////////////// 메모리상의 Frame 배치 완료//////////////////////////

		setBounds(300, 200, 500, 400); // setBounds(int x, int y, int width, int height) : 위치, 크기 한 방에 지정
		setVisible(true); // 배치 완료된 Frame을 보이게 하기 ***항상 배치부의 마지막

		// ###컨트롤러 분리###
		baseBallController = new BaseBallController(this);
		
//		baseball 창 이벤트 등록
		tf.addActionListener(baseBallController);         //컨트롤러를 호출
		newG.addActionListener(baseBallController);
		clear.addActionListener(baseBallController);
		dap.addActionListener(baseBallController);
		fontC.addActionListener(baseBallController);
		exit.addActionListener(baseBallController);
		
		this.addWindowListener(baseBallController);
		
//		FontColorChooser 창 이벤트 등록
		fontColorChooser.ok.addActionListener(baseBallController);
		
		fontColorChooser.sbR.addAdjustmentListener(baseBallController);
		fontColorChooser.sbG.addAdjustmentListener(baseBallController);
		fontColorChooser.sbB.addAdjustmentListener(baseBallController);
		
		
	}

	public static void main(String[] args) {
		new BaseBall();
	}

}
