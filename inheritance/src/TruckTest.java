public class TruckTest {
	public static void main(String[] args) {
		Truck t1 = new Truck("ī������", "�ε���¥��", "����");
		System.out.println("t1 >> "+ t1.toString()+ "���� ���Դ� "+t1.sumWeight+" kg");

		int weight = 20;
		t1.loadUp(weight);
		System.out.println("�̹��� ������ ���Դ� "+weight+"kg ���� ���Դ� " +t1.sumWeight+" kg");
		weight = 7;
		t1.loadUp(weight);
		System.out.println("�̹��� ������ ���Դ� "+weight+"kg ���� ���Դ� " +t1.sumWeight+" kg");
		weight = 10;
		t1.loadUp(weight);
		System.out.println("�̹��� ������ ���Դ� "+weight+"kg ���� ���Դ� " +t1.sumWeight+" kg");
		weight = 16;
		t1.loadUp(weight);
		System.out.println("�̹��� ������ ���Դ� "+weight+"kg ���� ���Դ� " +t1.sumWeight+" kg");

		
		weight = 17;
		t1.loadDown(weight);
		System.out.println("�̹��� ���� ���Դ� "+weight+"kg ���� ���Դ� " +t1.sumWeight+" kg");
		weight = 8;
		t1.loadDown(weight);
		System.out.println("�̹��� ���� ���Դ� "+weight+"kg ���� ���Դ� " +t1.sumWeight+" kg");
		weight = 40;
		t1.loadDown(weight);
		System.out.println("�̹��� ���� ���Դ� "+weight+"kg ���� ���Դ� " +t1.sumWeight+" kg");


	}
}
