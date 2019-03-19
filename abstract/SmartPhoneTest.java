public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone smartPhone1 = new SmartPhone("삼성", "갤럭시S10", 1300000);
		SmartPhone smartPhone2 = new SmartPhone("애플", "아이폰XS", 1100000, 30);
		SmartPhone smartPhone3 = new SmartPhone("삼성", "갤럭시노트9", 1200000, 35);
		
		System.out.println(" ---- 제품 목록 ----");
		System.out.println("----------------------");
		System.out.println(smartPhone1);
		System.out.println(smartPhone2);
		System.out.println(smartPhone3);
	

	}
}
