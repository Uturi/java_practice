public class BookOrderTest {
	public static void main(String[] args) {
		
		int java = 24000, jquery = 21000, oracle = 19000, spring = 35000;
		int sum = java + jquery + oracle + spring;
		double dissum = sum-(sum*0.15);

		System.out.println("====���� ���� ���====");
		System.out.println("JAVA : " + java);
		System.out.println("JQuery : " + jquery);
		System.out.println("����Ŭ : " + oracle);
		System.out.println("������ : " + spring);
		System.out.println("-------------------------");
		System.out.println("�ֹ� �� �ݾ� : " + sum);
		System.out.println("���� �� ���� �ݾ�" + (int)dissum);

	}
}
