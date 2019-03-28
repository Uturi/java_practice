package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

public class ColorSelector extends Frame implements ActionListener, AdjustmentListener{
	
	Panel pL = new Panel();
	Panel pLin = new Panel();
	Panel pLin2 = new Panel();
	Panel pLs = new Panel();
	Panel pR = new Panel();
	Panel pRin = new Panel();
	
	Label lE = new Label();
	Label lE2 = new Label();
	
	Label lR = new Label("»¡°­", Label.CENTER);
	Label lG = new Label("ÃÊ·Ï", Label.CENTER);
	Label lB = new Label("ÆÄ¶û", Label.CENTER);
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	
	Panel colorP = new Panel();
	Label colorL = new Label();
	Button ok = new Button("È®ÀÎ");
	
	Panel pP = new Panel();
	Panel pPP = new Panel();
	
	public ColorSelector() {
		super("Color Selector !!!");
		
		Font f = new Font("µ¸¿ò", Font.BOLD, 20);
		lR.setFont(f);
		lG.setFont(f);
		lB.setFont(f);
		lR.setBackground(Color.red);
		lG.setBackground(Color.green);
		lB.setBackground(Color.BLUE);
		
		pL.setLayout(new BorderLayout(10, 10));
		pLin.setLayout(new GridLayout(3, 1, 15, 15));
		pLin2.setLayout(new GridLayout(3, 1, 15, 15));
		pLin.add(lR);
		pLin.add(lG);
		pLin.add(lB);
		pLin2.add(sbR);
		pLin2.add(sbG);
		pLin2.add(sbB);
		pL.add(pLin, "West");
		pL.add(pLin2, "Center");
				
		pR.setLayout(new BorderLayout(10, 10));
		pRin.setLayout(new BorderLayout(10, 10));
//		colorP.setBackground(Color.magenta);
		colorL.setBackground(Color.cyan);
		pR.add(colorP, "Center");
		pRin.add(colorL, "Center");
		pRin.add(ok, "East");
		pR.add(pRin, "South");
	
		pLs.setLayout(new BorderLayout(10,10));
		pLs.add(lE, "North");
		pLs.add(lE2, "South");
		pLs.add(pL);
		
		pP.setLayout(new GridLayout(1, 2, 10, 10));
		pP.add(pLs);
		pP.add(pR);
		pPP.add(new Label());
//		setLayout(new GridLayout(1, 2, 10, 10));
		add(pPP, "North");
		add(pP, "Center");
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});		
		
		setBackground(Color.LIGHT_GRAY);
		setBounds(300, 200, 400, 230);
		setResizable(false);
		setVisible(true);
		
		ok.addActionListener(this);
		
		sbR.addAdjustmentListener(this);
		sbG.addAdjustmentListener(this);
		sbB.addAdjustmentListener(this);
		
		changeColor();
		
	}
	public static void main(String[] args) {
		new ColorSelector();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		changeColor();
		
	}
	private void changeColor() {
		int r = sbR.getValue();
		int g = sbG.getValue();
		int b = sbB.getValue();
		colorP.setBackground(new Color(r,g,b));
		colorL.setText("r = "+r+" g = "+g+" b = "+b);
	}
	

}
