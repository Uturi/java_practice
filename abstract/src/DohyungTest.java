public class DohyungTest {
	public static void main(String[] args) {
		Rect r1 = new Rect(4,5);
		System.out.println("���ΰ� "+r1.width+"�̰� ���ΰ� "+r1.height+"�� �簢���� ���̴� "+r1.getArea() + "�̰� �ѷ��� "+r1.getRound()+"�Դϴ�.");
	
		Circle c1 = new Circle(4);
		System.out.println("�������� "+c1.radius+"�� ���� ���̴� "+c1.getArea() + "�̰� �ѷ��� "+c1.getRound()+"�Դϴ�.");	
	
//		Dohyung d = new Dohyung();
		Dohyung d1 = new Rect(4,3);
		System.out.println("������ ���̴� "+d1.getArea() + "�̰� �ѷ��� "+d1.getRound()+"�Դϴ�.");

		Dohyung d2 = new Circle(2);
		System.out.println("������ ���̴� "+d2.getArea() + "�̰� �ѷ��� "+d2.getRound()+"�Դϴ�.");

		//���� ����ȯ
		Rect r2 = (Rect) d1;
		System.out.println("���ΰ� "+r2.width+"�̰� ���ΰ� "+r2.height+"�� �簢���� ���̴� "+r2.getArea() + "�̰� �ѷ��� "+r2.getRound()+"�Դϴ�.");
		
		Circle c2 = (Circle)d1;
		//���������� ��������. �����Ҷ� ������. ĳ��Ʈ�ȵ�. ����ȯ ����
	}
}