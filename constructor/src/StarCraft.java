public class StarCraft {
	public static void main(String[] args) {
		Marine my = new Marine();
		Marine com = new Marine();
		
		my.info(com);
		//��ü�� : 100  ��ü�� : 100

		int count = 2;
		System.out.println("���� ���� "+count+"ȸ ����!!!!");
		my.attack(count,com);
		my.info(com);

		//��ü�� : 100  ��ü�� : 80
		
		count = 4;
		System.out.println("���� ���� "+count+"ȸ ����!!!!");
		com.attack(count,my);
		my.info(com);
		//��ü�� : 60  ��ü�� : 80
		System.out.println("��� ����!!!!");
		my.changeMode();
		my.info(com);
		//��ü�� : 35  ��ü�� : 80
		count = 3;
		System.out.println("���� ���� "+count+"ȸ ����!!!!");
		my.attack(count,com);
		my.info(com);
		//��ü�� : 35  ��ü�� 35
		System.out.println("��� ����!!!!");
		my.changeMode();
		//��� : ��� ���� �Ұ�!!!!
		//��ü�� : 35  ��ü�� : 35
		count = 3;
		System.out.println("���� ���� "+count+"ȸ ����!!!!");
		my.attack(count,com);
		my.info(com);

		//��ü�� : 35  ��ü�� : die		
	}
}
