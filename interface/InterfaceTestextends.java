import java.awt.*;
import java.awt.event.*;

public class InterfaceTestextends extends Frame implements WindowListener{

		Button b1  = new Button("@������@");
	
	public InterfaceTestextends() {
		super("���� ���� �ʹٸ�?");
		setLayout(new FlowLayout());
		add(b1);
		setBackground(new Color(198, 100, 105));
		setSize(400, 300);
		setLocation(300, 200);
		setVisible(true);


		//WindowListener wl = new InterfaceTest();
		addWindowListener(this);
	}

	public void windowDeactivated(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowiconified(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {System.exit(0);}
	public void Opened(WindowEvent e) {}


	public static void main(String[] args) throws Exception{
		InterfaceTestextends iat = new InterfaceTestextends();
	}
}