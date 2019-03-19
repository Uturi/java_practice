public class BookOrderTest {
	public static void main(String[] args) {
		
		int java = 24000, jquery = 21000, oracle = 19000, spring = 35000;
		int sum = java + jquery + oracle + spring;
		double dissum = sum-(sum*0.15);

		System.out.println("====도서 구입 목록====");
		System.out.println("JAVA : " + java);
		System.out.println("JQuery : " + jquery);
		System.out.println("오라클 : " + oracle);
		System.out.println("스프링 : " + spring);
		System.out.println("-------------------------");
		System.out.println("주문 총 금액 : " + sum);
		System.out.println("할인 후 결제 금액" + (int)dissum);

	}
}
