public class BusGuest {
	public static void main(String[] args) {
		Bus b1 = new Bus("6515", "�ó�����", "�����");
		System.out.println("b1 >> "+ b1.busInfo()+ "���� �°��� "+b1.sumCount+" ��");

		int people = 2;
		b1.getOn(people);
		System.out.println("�̹��� ž���� �°� ���� "+people+"�� ���� �°� ���� " +b1.sumCount+"��");
		people = 6;
		b1.getOn(people);
		System.out.println("�̹��� ž���� �°� ���� "+people+"�� ���� �°� ���� " +b1.sumCount+"��");
		people = 10;
		b1.getOn(people);
		System.out.println("�̹��� ž���� �°� ���� "+people+"�� ���� �°� ���� " +b1.sumCount+"��");
		people = 40;
		b1.getOn(people);
		System.out.println("�̹��� ž���� �°� ���� "+people+"�� ���� �°� ���� " +b1.sumCount+"��");
		people = 10;
		b1.getOut(people);
		System.out.println("�̹��� ���� �°� ���� "+people+"�� ���� �°� ���� " +b1.sumCount+"��");
		people = 35;
		b1.getOut(people);
		System.out.println("�̹��� ���� �°� ���� "+people+"�� ���� �°� ���� " +b1.sumCount+"��");
		
	}
}
