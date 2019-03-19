import java.awt.*;
import java.awt.event.*;

public class AbstractTest3 extends Frame {

	Button b = new Button("@눌러봐@");
	Button b1 = new Button("@시간이@");
	Button b2 = new Button("@빨리가는@");
	Button b3 = new Button("@버튼@");
	Checkbox c = new Checkbox("선택");

	public AbstractTest3() {
		super("집에 가고 싶다면?");
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
				System.out.println("아이콘화!!");
			}

		};
		addWindowListener(wl);
	}
	
	
	
	public static void main(String[] args) throws Exception {
		AbstractTest3 iat = new AbstractTest3();
	}
}
