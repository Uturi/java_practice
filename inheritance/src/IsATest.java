import java.awt.*;

public class IsATest extends Frame {

	Button b = new Button("@눌러봐@");
	Button b1 = new Button("@시간이@");
	Button b2 = new Button("@빨리가는@");
	Button b3 = new Button("@버튼@");

	public IsATest() {
		super("집에 가고 싶다면?");
		setLayout(new FlowLayout());
		add(b);
		add(b1);
		add(b2);
		add(b3);
		setBackground(new Color(198, 100, 105));
		setSize(1500, 1500);
		setLocation(300, 200);
		setVisible(true);

//		b.setLabel("눌러봐!!!");
			
	}


	public static void main(String[] args) {
		IsATest iat = new IsATest();
	}
}