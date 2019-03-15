public class TruckTest {
	public static void main(String[] args) {
		Truck t1 = new Truck("카고차량", "두돈반짜리", "군대");
		System.out.println("t1 >> "+ t1.info()+ "현재 무게는 "+t1.sumWeight+" kg");

		int weight = 20;
		t1.loadUp(weight);
		System.out.println("이번에 적재한 무게는 "+weight+"kg 현재 무게는 " +t1.sumWeight+" kg");
		weight = 7;
		t1.loadUp(weight);
		System.out.println("이번에 적재한 무게는 "+weight+"kg 현재 무게는 " +t1.sumWeight+" kg");
		weight = 10;
		t1.loadUp(weight);
		System.out.println("이번에 적재한 무게는 "+weight+"kg 현재 무게는 " +t1.sumWeight+" kg");
		weight = 16;
		t1.loadUp(weight);
		System.out.println("이번에 적재한 무게는 "+weight+"kg 현재 무게는 " +t1.sumWeight+" kg");

		
		weight = 17;
		t1.loadDown(weight);
		System.out.println("이번에 내린 무게는 "+weight+"kg 현재 무게는 " +t1.sumWeight+" kg");
		weight = 8;
		t1.loadDown(weight);
		System.out.println("이번에 내린 무게는 "+weight+"kg 현재 무게는 " +t1.sumWeight+" kg");
		weight = 40;
		t1.loadDown(weight);
		System.out.println("이번에 내린 무게는 "+weight+"kg 현재 무게는 " +t1.sumWeight+" kg");


	}
}
