import java.awt.*;

public class HasATest {

	Frame f = new Frame("���� ���� �ʹٸ�?");
	Button b = new Button("@������@");

	public HasATest() {
		f.setLayout(new FlowLayout());
		f.add(b);
		f.setSize(400, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
//		f.setTitle("���� ���� �ʹٸ�?");

//		b.setLabel("������!!!");
			
	}


	public static void main(String[] args) {
		HasATest hat = new HasATest();
	}
}
