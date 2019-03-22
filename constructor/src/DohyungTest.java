public class DohyungTest {
	public static void main(String[] args) {
		
		Rect r1 = new Rect();
		Rect r2 = new Rect(5,7);
		//rect r1;
		//가로가 4이고 세로가 3인 사각형의 넓이는 12이고 둘레는 14입니다.
		r1.calcArea();
		r1.calcRound();
		System.out.println(r1.info());
		//rect r2;
		//가로가 5이고 세로가 7인 사각형의 넓이는 35이고 둘레는 24입니다.
		r2.calcArea();
		r2.calcRound();
		System.out.println(r2.info());

		
		Circle c1 = new Circle();
		Circle c2 = new Circle(5);
		//Circle c1;
		//반지름이 4인 원의 넓이는 50.xxx이고 둘레는 25.xxx입니다.
		c1.calcArea();
		c1.calcRound();
		System.out.println(c1.info());
		//Circle c2;
		//반지름이 5인 원의 넓이는 78.xxx이고 둘레는 31.xxx입니다.
		c2.calcArea();
		c2.calcRound();
		System.out.println(c2.info());

	}
}
