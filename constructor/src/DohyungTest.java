public class DohyungTest {
	public static void main(String[] args) {
		
		Rect r1 = new Rect();
		Rect r2 = new Rect(5,7);
		//rect r1;
		//���ΰ� 4�̰� ���ΰ� 3�� �簢���� ���̴� 12�̰� �ѷ��� 14�Դϴ�.
		r1.calcArea();
		r1.calcRound();
		System.out.println(r1.info());
		//rect r2;
		//���ΰ� 5�̰� ���ΰ� 7�� �簢���� ���̴� 35�̰� �ѷ��� 24�Դϴ�.
		r2.calcArea();
		r2.calcRound();
		System.out.println(r2.info());

		
		Circle c1 = new Circle();
		Circle c2 = new Circle(5);
		//Circle c1;
		//�������� 4�� ���� ���̴� 50.xxx�̰� �ѷ��� 25.xxx�Դϴ�.
		c1.calcArea();
		c1.calcRound();
		System.out.println(c1.info());
		//Circle c2;
		//�������� 5�� ���� ���̴� 78.xxx�̰� �ѷ��� 31.xxx�Դϴ�.
		c2.calcArea();
		c2.calcRound();
		System.out.println(c2.info());

	}
}
