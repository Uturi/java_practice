import java.awt.*;
import java.awt.event.*;

public class AbstractTest3 extends Frame {

	Button b = new Button("@������@");
	Button b1 = new Button("@�ð���@");
	Button b2 = new Button("@��������@");
	Button b3 = new Button("@��ư@");
	Checkbox c = new Checkbox("����");

	public AbstractTest3() {
		super("���� ���� �ʹٸ�?");
		setLayout(new FlowLayout());
		add(b);
		add(b1);
		add(b2);
		add(b3);
		add(c);
		setBackground(new Color(198, 100, 105));
		setSize(400, 300);
		setLocation(300, 200);
		setVisible(true);

		WindowListener wl = new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
			public void windowIconified(WindowEvent e){
				System.out.println("������ȭ!!");
			}

		};
		addWindowListener(wl);
	}
	
	
	
	public static void main(String[] args) throws Exception {
		AbstractTest3 iat = new AbstractTest3();
	}
}
