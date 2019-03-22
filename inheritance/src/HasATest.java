import java.awt.*;

public class HasATest {

	Frame f = new Frame("집에 가고 싶다면?");
	Button b = new Button("@눌러봐@");

	public HasATest() {
		f.setLayout(new FlowLayout());
		f.add(b);
		f.setSize(400, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
//		f.setTitle("집에 가고 싶다면?");

//		b.setLabel("눌러봐!!!");
			
	}


	public static void main(String[] args) {
		HasATest hat = new HasATest();
	}
}
