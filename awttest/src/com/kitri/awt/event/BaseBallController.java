package com.kitri.awt.event;

import java.awt.event.*;

// [��Ʈ�ѷ� Ŭ����] : �޼ҵ带 ���� ����ض�. ��ȣ�� ����.

public class BaseBallController implements ActionListener, AdjustmentListener, WindowListener{

	// ###�������� ȣ��###
	// ������->��Ʈ�ѷ�
	BaseBall baseBall;
	
	// ###������ ȣ��###
	// ��Ʈ�ѷ� -> ����
	BaseBallService baseballService;

	// ###�������� ȣ��###
	// ###������ ȣ��###
	public BaseBallController(BaseBall baseBall) {
		this.baseBall = baseBall;   						//������ ��ü->��Ʈ�ѷ� (����)
		baseballService = new BaseBallService(this); //��Ʈ�ѷ��� ������ ��ü -> ���� (����)
	}
	@Override
	public void windowClosing(WindowEvent e) {
		baseballService.exit();
	}

	
	// ###������ �и��� �޼ҵ� ȣ��###
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == baseBall.newG) {
			baseballService.newGame();
		} else if(ob == baseBall.clear) {
			baseballService.clear();
		} else if(ob == baseBall.dap) {
			baseballService.showDap();
		}else if(ob==baseBall.fontC){
			baseballService.fontColorChange();
		}else if(ob==baseBall.exit){
			baseballService.exit();
		}else if(ob==baseBall.tf){
			baseballService.game();
		} else if(ob==baseBall.fontColorChooser.ok) {
			baseballService.selectColor();
		}
}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		baseballService.changeColor();
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
