import java.awt.*;

public class IsATest extends Frame {

	Button b = new Button("@������@");
	Button b1 = new Button("@�ð���@");
	Button b2 = new Button("@��������@");
	Button b3 = new Button("@��ư@");

	public IsATest() {
		super("���� ���� �ʹٸ�?");
		setLayout(new FlowLayout());
		add(b);
		add(b1);
		add(b2);
		add(b3);
		setBackground(new Color(198, 100, 105));
		setSize(1500, 1500);
		setLocation(300, 200);
		setVisible(true);

//		b.setLabel("������!!!");
			
	}


	public static void main(String[] args) {
		IsATest iat = new IsATest();
	}
}